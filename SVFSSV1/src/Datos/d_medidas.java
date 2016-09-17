package Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Logica.c_medidas;

public class d_medidas {
     public static c_medidas insertarMedidas(c_medidas m) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO medida (codmedida,medida) VALUES (?,?)");
        ps.setString(1, m.getCodmedida());
        ps.setString(2, m.getMedida());
        ps.executeUpdate();
        PreparedStatement ps2 = cnn.prepareStatement("select max(idmedida) from medida");
        ResultSet r = ps2.executeQuery();
        if (r.next()) {
            String lastID = r.getString(1);
            m.setCodmedida(lastID);
        }
        ps2.close();
        cnn.close();
        ps.close();
        return m;
    }

    public static c_medidas buscarCodMedidas(String medida) throws SQLException {
        return buscarCodMedidas(medida, null);
    }

     public static c_medidas buscarCodMedidas( String medida,c_medidas m) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from medida where medida=? ");
        ps.setString(1, medida);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (m == null) {
                m = new c_medidas(){};
            }
            m.setIdmedida(rs.getInt("idmedida"));
            m.setCodmedida(rs.getString("codmedida"));
            m.setMedida(rs.getString("medida"));
        }
        cnn.close();
        ps.close();
        return m;
    }
    public static boolean eliminarMedidas(String medida) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("delete from medida WHERE medida=?");
        ps.setString(1, medida);
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

     public static boolean actualizarMedida(c_medidas m) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("UPDATE medida SET codmedida=?,medida=? WHERE idmedida=" + m.getIdmedida());
        ps.setString(1, m.getCodmedida());
        ps.setString(2,m.getMedida());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated >0) {
            return true;
        } else {
            return false;
        }
    }

     public static ArrayList<c_medidas> mostrarMedidas() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<c_medidas> lista = new ArrayList<c_medidas>();

        ps = cnn.prepareStatement("SELECT codmedida,medida FROM medida");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            c_medidas m = new c_medidas(){};
            m.setCodmedida(rs.getString("codmedida"));
            m.setMedida(rs.getString("medida"));
            lista.add(m);
        }
        cnn.close();
        ps.close();
        return lista;
    }
}
