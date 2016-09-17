package Datos;
import Logica.c_ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class d_ciudad {
     public static c_ciudad insertarCiudades(c_ciudad cd) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO ciudad (codciudad,distrito, provincia,region,pais) VALUES (?,?,?,?,?)");
        ps.setString(1, cd.getCodciudad());
        ps.setString(2, cd.getDistrito());
        ps.setString(3, cd.getProvincia());
        ps.setString(4, cd.getRegion());
        ps.setString(5, cd.getPais());
        ps.executeUpdate();
        cnn.close();
        ps.close();
        return cd;
    }

    public static c_ciudad buscarCodCiudades(String codciudad) throws SQLException {
        return buscarCodCiudades(codciudad, null);
    }

     public static c_ciudad buscarCodCiudades( String codciudad,c_ciudad cd) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from ciudad where codciudad=? ");
        ps.setString(1, codciudad);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (cd == null) {
                cd = new c_ciudad(){};
            }
            cd.setIdciudad(rs.getInt("idciudad"));
            cd.setCodciudad(rs.getString("codciudad"));
            cd.setDistrito(rs.getString("distrito"));
            cd.setProvincia(rs.getString("provincia"));
            cd.setRegion(rs.getString("region"));
            cd.setPais(rs.getString("pais"));
        }
        cnn.close();
        ps.close();
        return cd;
    }
    public static boolean eliminarCiudades(String codciudad) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("delete from ciudad WHERE codciudad=?");
        ps.setString(1, codciudad);
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

     public static boolean actualizarCiudades(c_ciudad cd) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("UPDATE ciudad SET codciudad=?,distrito=?, provincia=?, region=?, pais=? WHERE idciudad=" + cd.getIdciudad());
        ps.setString(1,cd.getCodciudad());
        ps.setString(2,cd.getDistrito());
        ps.setString(3, cd.getProvincia());
        ps.setString(4,cd.getRegion());
        ps.setString(5, cd.getPais());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated >0) {
            return true;
        } else {
            return false;
        }
    }

     public static ArrayList<c_ciudad> mostrarCiudades() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<c_ciudad> lista = new ArrayList<c_ciudad>();

        ps = cnn.prepareStatement("SELECT codciudad,distrito,provincia,region,pais FROM ciudad");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            c_ciudad cd = new c_ciudad(){};
            cd.setCodciudad(rs.getString("codciudad"));
            cd.setDistrito(rs.getString("distrito"));
            cd.setProvincia(rs.getString("provincia"));
            cd.setRegion(rs.getString("region"));
            cd.setPais(rs.getString("pais"));
            lista.add(cd);
        }
        cnn.close();
        ps.close();
        return lista;
    }
}
