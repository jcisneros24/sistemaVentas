package Datos;
import Logica.c_cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class d_cliente {
     public static c_cliente insertarCliente(c_cliente c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO CLIENTE (nombres, apellidos,dni,sexo, direccion, codciudad, telefono, celular, correo, web, fnaci) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, c.getNombres());
        ps.setString(2, c.getApellidos());
        ps.setInt(3, c.getDni());
        ps.setString(4, c.getSexo());
        ps.setString(5, c.getDireccion());
        ps.setString(6, c.getCiudad());
        ps.setString(7, c.getTelefono());
        ps.setString(8, c.getCelular());
        ps.setString(9, c.getCorreo());
        ps.setString(10, c.getWeb());
        ps.setString(11, c.getFnaci());
        ps.executeUpdate();
        cnn.close();
        ps.close();
        return c;
    }

    public static c_cliente buscarClienteNumDoc(String numdoc) throws SQLException {
        return buscarClienteNumDoc(numdoc, null);
    }

     public static c_cliente buscarClienteNumDoc(String numdoc, c_cliente c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from cliente where dni=?");
        ps.setString(1, numdoc);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (c == null) {
                c = new c_cliente() {};
            }
            c.setNombres(rs.getString("nombres"));
            c.setApellidos(rs.getString("apellidos"));
            c.setDni(Integer.parseInt(rs.getString("dni")));
            c.setSexo(rs.getString("sexo"));
            c.setDireccion(rs.getString("direccion"));
            c.setCiudad(rs.getString("codciudad"));
            c.setTelefono(rs.getString("telefono"));
            c.setCelular(rs.getString("celular"));
            c.setCorreo(rs.getString("correo"));
            c.setWeb(rs.getString("web"));
            c.setFnaci(rs.getString("fnaci"));
        }
        cnn.close();
        ps.close();
        return c;
    }
    public static boolean eliminarCliente(String dni) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("delete from CLIENTE WHERE dni=?");
        ps.setString(1, dni);
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

     public static boolean actualizarCliente(c_cliente c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("UPDATE CLIENTE SET nombres=?, apellidos=?,dni=?, sexo=?, direccion=?, codciudad=?, telefono=?, celular=?, correo=?, web=? WHERE dni=" + c.getDni());
        ps.setString(1, c.getNombres());
        ps.setString(2,c.getApellidos());
        ps.setInt(3, c.getDni());
        ps.setString(4, c.getSexo());
        ps.setString(5, c.getDireccion());
        ps.setString(6,c.getCiudad());
        ps.setString(7, c.getTelefono());
        ps.setString(8, c.getCelular());
        ps.setString(9,c.getCorreo());
        ps.setString(10, c.getWeb());
        //ps.setString(11, c.getFnaci());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

     public static ArrayList<c_cliente> mostrarCliente() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<c_cliente> lista = new ArrayList<c_cliente>();

        ps = cnn.prepareStatement("SELECT nombres,apellidos,dni,direccion,codciudad,correo,web,celular FROM cliente");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            c_cliente c = new c_cliente() {};
            c.setNombres(rs.getString("nombres"));
            c.setApellidos(rs.getString("apellidos"));
            c.setDni(rs.getInt("dni"));
            c.setDireccion(rs.getString("direccion"));
            c.setCiudad(rs.getString("codciudad"));
            c.setCorreo(rs.getString("correo"));
            c.setWeb(rs.getString("web"));
            c.setCelular(rs.getString("celular"));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
}
