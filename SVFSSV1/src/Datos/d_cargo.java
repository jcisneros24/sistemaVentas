package Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Logica.c_cargo;

public class d_cargo {
     public static c_cargo insertarCargo(c_cargo c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO cargo (cargo,salbase,bonificacion) VALUES (?,?,?)");
        ps.setString(1, c.getCargo());
        ps.setDouble(2, c.getSalbase());
        ps.setDouble(3, c.getBonificacion());
        ps.executeUpdate();
        cnn.close();
        ps.close();
        return c;
    }

    public static c_cargo buscarCargo(String cargo) throws SQLException {
        return buscarCargo(cargo, null);
    }

     public static c_cargo buscarCargo( String cargo,c_cargo c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from cargo where cargo=? ");
        ps.setString(1, cargo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (c == null) {
                c = new c_cargo(){};
            }
            c.setIdcargo(rs.getInt("idcargo"));
            c.setCargo(rs.getString("cargo"));
            c.setSalbase(rs.getDouble("salbase"));
            c.setBonificacion(rs.getDouble("bonificacion"));
        }
        cnn.close();
        ps.close();
        return c;
    }
    public static boolean eliminarCargo(String cargo) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("delete from cargo WHERE cargo=?");
        ps.setString(1, cargo);
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

     public static boolean actualizarCargo(c_cargo c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("UPDATE cargo SET cargo=?,salbase=?,bonificacion=? WHERE idcargo=" + c.getIdcargo());
        ps.setString(1,c.getCargo());
        ps.setDouble(2,c.getSalbase());
        ps.setDouble(3,c.getBonificacion());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated >0) {
            return true;
        } else {
            return false;
        }
    }

     public static ArrayList<c_cargo> mostrarCargo() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<c_cargo> lista = new ArrayList<c_cargo>();

        ps = cnn.prepareStatement("SELECT cargo,salbase,bonificacion FROM cargo");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
        	c_cargo c = new c_cargo(){};
            c.setCargo(rs.getString("cargo"));
            c.setSalbase(rs.getDouble("salbase"));
            c.setBonificacion(rs.getDouble("bonificacion"));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
}
