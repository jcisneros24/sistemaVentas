package Datos;
import Logica.c_proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class d_proveedor {
     public static c_proveedor insertarProveedor(c_proveedor p) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO proveedor (nombres, razonsocial,ruc,direccion, codciudad, telefono, celular, correo, web, fingreso) VALUES (?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, p.getNombres());
        ps.setString(2, p.getRazonsocial());
        ps.setObject(3, p.getRuc());
        ps.setString(4, p.getDireccion());
        ps.setString(5, p.getCodciudad());
        ps.setString(6, p.getTelefono());
        ps.setString(7, p.getCelular());
        ps.setString(8, p.getCorreo());
        ps.setString(9, p.getWeb());
        ps.setObject(10, p.getFingreso());
        ps.executeUpdate();
        cnn.close();
        ps.close();
        return p;
    }

    public static c_proveedor buscarRuc(String ruc) throws SQLException {
        return buscarRuc(ruc, null);
    }

     public static c_proveedor buscarRuc(String ruc, c_proveedor p) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from proveedor where ruc=?");
        ps.setString(1, ruc);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (p == null) {
                p = new c_proveedor() {};
            }
            p.setNombres(rs.getString("nombres"));
            p.setRazonsocial(rs.getString("razonsocial"));
            p.setRuc(rs.getString("ruc"));
            p.setDireccion(rs.getString("direccion"));
            p.setCodciudad(rs.getString("codciudad"));
            p.setTelefono(rs.getString("telefono"));
            p.setCelular(rs.getString("celular"));
            p.setCorreo(rs.getString("correo"));
            p.setWeb(rs.getString("web"));
           //p.setFingreso(rs.getObject("fingreso"));
        }
        cnn.close();
        ps.close();
        return p;
    }
    public static boolean eliminarProveedor(String ruc) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("delete from proveedor WHERE ruc=?");
        ps.setString(1, ruc);
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

     public static boolean actualizarProveedor(c_proveedor p) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("UPDATE proveedor SET nombres=?, razonsocial=?,ruc=?, direccion=?, codciudad=?, telefono=?, celular=?, correo=?, web=? WHERE ruc=" + p.getRuc());      
        ps.setString(1, p.getNombres());
        ps.setString(2, p.getRazonsocial());
        ps.setObject(3, p.getRuc());
        ps.setString(4, p.getDireccion());
        ps.setString(5, p.getCodciudad());
        ps.setString(6, p.getTelefono());
        ps.setString(7, p.getCelular());
        ps.setString(8, p.getCorreo());
        ps.setString(9, p.getWeb());
        // ps.setObject(10, p.getFingreso());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

     public static ArrayList<c_proveedor> mostrarProveedor() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<c_proveedor> lista = new ArrayList<c_proveedor>();

        ps = cnn.prepareStatement("SELECT nombres, razonsocial,ruc,direccion, codciudad, telefono, celular, correo FROM proveedor");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
        	c_proveedor p = new c_proveedor() {};
            p.setNombres(rs.getString("nombres"));
            p.setRazonsocial(rs.getString("razonsocial"));
            p.setRuc(rs.getString("ruc"));
            p.setDireccion(rs.getString("direccion"));
            p.setCodciudad(rs.getString("codciudad"));
            p.setTelefono(rs.getString("telefono"));
            p.setCelular(rs.getString("celular"));
            p.setCorreo(rs.getString("correo"));
            lista.add(p);
        }
        cnn.close();
        ps.close();
        return lista;
    }
}
