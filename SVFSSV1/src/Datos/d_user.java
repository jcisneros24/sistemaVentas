package Datos;
import Logica.c_user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class d_user {
     public static c_user insertarUser(c_user u) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO user (coduser,user,password,codtipouser) VALUES (?,?,?,?)");
        ps.setString(1, u.getCoduser());
        ps.setString(2, u.getUser());
        ps.setString(3, u.getPassword());
        ps.setString(4, u.getCodtipouser());
        ps.executeUpdate();
        cnn.close();
        ps.close();
        return u;
    }

    public static c_user buscarCodUser(String coduser) throws SQLException {
        return buscarCodUser(coduser, null);
    }

     public static c_user buscarCodUser( String coduser,c_user u) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from user where coduser=? ");
        ps.setString(1, coduser);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (u == null) {
                u = new c_user(){};
            }
            u.setIduser(rs.getInt("iduser")); 
            u.setCoduser(rs.getString("coduser"));
            u.setUser(rs.getString("user"));
            u.setPassword(rs.getString("password"));
            u.setCodtipouser(rs.getString("codtipouser"));
        }
        cnn.close();
        ps.close();
        return u;
    }
    public static boolean eliminarUser(String coduser) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("delete from user WHERE coduser=?");
        ps.setString(1, coduser);
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

     public static boolean actualizarUser(c_user u) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("UPDATE user SET coduser=?,user=?,password=?,codtipouser=? WHERE iduser=" + u.getIduser());
        ps.setString(1,u.getCoduser());
        ps.setString(2,u.getUser());
        ps.setString(3,u.getPassword());
        ps.setString(4,u.getCodtipouser());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated >0) {
            return true;
        } else {
            return false;
        }
    }

     public static ArrayList<c_user> mostrarUser() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<c_user> lista = new ArrayList<c_user>();

        ps = cnn.prepareStatement("SELECT * FROM user");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            c_user u = new c_user(){};
            u.setCoduser(rs.getString("coduser"));
            u.setUser(rs.getString("user"));
            u.setPassword(rs.getString("password"));
            u.setCodtipouser(rs.getString("codtipouser"));
            lista.add(u);
        }
        cnn.close();
        ps.close();
        return lista;
    }
}
