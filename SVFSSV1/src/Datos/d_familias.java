package Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Logica.c_familias;

public class d_familias {
     public static c_familias insertarFamilias(c_familias fam) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO familias (codfam,hija, madre) VALUES (?,?,?)");
        ps.setString(1, fam.getCodfam());
        ps.setString(2, fam.getHija());
        ps.setString(3, fam.getMadre());
        ps.executeUpdate();
        cnn.close();
        ps.close();
        return fam;
    }

    public static c_familias buscarFamiliasCodfam(String codfam) throws SQLException {
        return buscarFamiliasCodfam(codfam, null);
    }

     public static c_familias buscarFamiliasCodfam( String codfam,c_familias fam) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from familias where codfam=?");
        ps.setString(1, codfam);
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            if (fam == null) {
            	fam = new c_familias() {};
            }
            fam.setIdfam(rs.getInt("idfam"));
            fam.setCodfam(rs.getString("codfam"));
            fam.setHija(rs.getString("hija"));
            fam.setMadre(rs.getString("madre"));
        }
        cnn.close();
        ps.close();
        return fam;
    }
    public static boolean eliminarFamilias(String codfam) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("delete from familias WHERE codfam=?");
        ps.setString(1, codfam);
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }
     public static boolean actualizarFamilias(c_familias fam) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("UPDATE familias SET codfam=?, hija=?, madre=? WHERE idfam="+ fam.getIdfam());
        ps.setString(1,fam.getCodfam());
        ps.setString(2,fam.getHija());
        ps.setString(3,fam.getMadre());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated >0) {
            return true;
        } else {
            return false;
        }
    }

     public static ArrayList<c_familias> mostrarFamilias() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<c_familias> lista = new ArrayList<c_familias>();

        ps = cnn.prepareStatement("SELECT * FROM familias");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            c_familias fam = new c_familias(){};
            fam.setCodfam(rs.getString("codfam"));
            fam.setHija(rs.getString("hija"));
            fam.setMadre(rs.getString("madre"));
            lista.add(fam);
        }
        cnn.close();
        ps.close();
        return lista;
    }
}
