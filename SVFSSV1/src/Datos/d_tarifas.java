package Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Logica.c_tarifas;

public class d_tarifas {
     public static c_tarifas insertarTarifas(c_tarifas t) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO tarifas (codarticulo,pcunt, pvunt,descventa,desccompra) VALUES (?,?,?,?,?)");
        ps.setString(1, t.getCodarticulo());
        ps.setDouble(2, t.getPcunt());
        ps.setDouble(3, t.getPvunt());
        ps.setDouble(4, t.getDesventa());
        ps.setDouble(5, t.getDescompra());
        ps.executeUpdate();
        cnn.close();
        ps.close();
        return t;
    }

    public static c_tarifas buscarCodArti(String codarticulo) throws SQLException {
        return buscarCodArti(codarticulo, null);
    }

     public static c_tarifas buscarCodArti( String codarticulo,c_tarifas t) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from tarifas where codarticulo=? ");
        ps.setString(1, codarticulo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (t == null) {
                t = new c_tarifas(){};
            }
            t.setIdtarifas(rs.getInt("idtarifas"));
            t.setCodarticulo(rs.getString("codarticulo"));
            t.setPcunt(rs.getDouble("pcunt"));
            t.setPvunt(rs.getDouble("pvunt"));
            t.setDesventa(rs.getDouble("descventa"));
            t.setDescompra(rs.getDouble("desccompra"));
        }
        cnn.close();
        ps.close();
        return t;
    }
    public static boolean eliminarTarifas(String codarticulo) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("delete from tarifas WHERE codarticulo=?");
        ps.setString(1, codarticulo);
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

     public static boolean actualizarTarifas(c_tarifas t) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("UPDATE tarifas SET codarticulo=?,pcunt=?, pvunt=?, descventa=?, desccompra=? WHERE idtarifas=" + t.getIdtarifas());
        ps.setString(1,t.getCodarticulo());
        ps.setDouble(2,t.getPcunt());
        ps.setDouble(3, t.getPvunt());
        ps.setDouble(4,t.getDesventa());
        ps.setDouble(5, t.getDescompra());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated >0) {
            return true;
        } else {
            return false;
        }
    }

     public static ArrayList<c_tarifas> mostrarTarifas() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<c_tarifas> lista = new ArrayList<c_tarifas>();

        ps = cnn.prepareStatement("SELECT a.codarticulo,t.pcunt,t.pvunt,t.descventa,t.desccompra FROM tarifas t INNER JOIN articulos a ON a.codarticulo=t.codarticulo WHERE a.estado='ACTIVO'");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            c_tarifas t = new c_tarifas(){};
            t.setCodarticulo(rs.getString("codarticulo"));
            t.setPcunt(rs.getDouble("pcunt"));
            t.setPvunt(rs.getDouble("pvunt"));
            t.setDesventa(rs.getDouble("descventa"));
            t.setDescompra(rs.getDouble("desccompra"));
            lista.add(t);
        }
        cnn.close();
        ps.close();
        return lista;
    }
}
