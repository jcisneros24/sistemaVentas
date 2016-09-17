package Datos;
import Logica.c_empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class d_empleado {
     public static c_empleado insertarEmpleado(c_empleado emp) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO empleado (nombres, apellidos,dni,sexo, direccion, ciudad, cargo, telefono, celular, correo, web, fnaci) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, emp.getNombres());
        ps.setString(2, emp.getApellidos());
        ps.setInt(3, emp.getDni());
        ps.setString(4, emp.getSexo());
        ps.setString(5, emp.getDireccion());
        ps.setString(6, emp.getCiudad());
        ps.setString(7, emp.getCargo());
        ps.setString(8, emp.getTelefono());
        ps.setString(9, emp.getCelular());
        ps.setString(10, emp.getCorreo());
        ps.setString(11, emp.getWeb());
        ps.setString(12, emp.getFnaci());
        ps.executeUpdate();
        cnn.close();
        ps.close();
        return emp;
    }
    public static c_empleado buscarEmpleadoNumDoc(String dni) throws SQLException {
        return buscarEmpleadoNumDoc(dni, null);
    }
     public static c_empleado buscarEmpleadoNumDoc(String dni, c_empleado emp) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from empleado where dni=?");
        ps.setString(1, dni);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (emp == null) {
                emp = new c_empleado(){};
            }
            emp.setIdempleado(rs.getInt("idempleado"));
            emp.setNombres(rs.getString("nombres"));
            emp.setApellidos(rs.getString("apellidos"));
            emp.setDni(Integer.parseInt(rs.getString("dni")));
            emp.setSexo(rs.getString("sexo"));
            emp.setDireccion(rs.getString("direccion"));
            emp.setCiudad(rs.getString("ciudad"));
            emp.setCargo(rs.getString("cargo"));
            emp.setTelefono(rs.getString("telefono"));
            emp.setCelular(rs.getString("celular"));
            emp.setCorreo(rs.getString("correo"));
            emp.setWeb(rs.getString("web"));
            emp.setFnaci(rs.getString("fnaci"));
        }
        cnn.close();
        ps.close();
        return emp;
    }
    public static boolean eliminarEmpleado(String dni) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("delete from empleado WHERE dni=?");
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

     public static boolean actualizarEmpleado(c_empleado emp) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("UPDATE empleado SET nombres=?, apellidos=?, dni=?, sexo=?, direccion=?, ciudad=?, cargo=?,telefono=?, celular=?, correo=?, web=?, fnaci=? WHERE dni=" + emp.getDni());
        ps.setString(1, emp.getNombres());
        ps.setString(2,emp.getApellidos());
        ps.setInt(3, emp.getDni());
        ps.setString(4, emp.getSexo());
        ps.setString(5, emp.getDireccion());
        ps.setString(6, emp.getCiudad());
        ps.setString(7,emp.getCargo());
        ps.setString(8, emp.getTelefono());
        ps.setString(9, emp.getCelular());
        ps.setString(10,emp.getCorreo());
        ps.setString(11, emp.getWeb());
        ps.setString(12, emp.getFnaci());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

     public static ArrayList<c_empleado> mostrarEmpleado() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<c_empleado> lista = new ArrayList<c_empleado>();

        ps = cnn.prepareStatement("SELECT nombres,apellidos,dni,direccion,ciudad,cargo,correo,celular FROM empleado");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            c_empleado emp = new c_empleado(){};
            emp.setNombres(rs.getString("nombres"));
            emp.setApellidos(rs.getString("apellidos"));
            emp.setDni(rs.getInt("dni"));
            emp.setDireccion(rs.getString("direccion"));
            emp.setCiudad(rs.getString("ciudad"));
            emp.setCargo(rs.getString("cargo"));
            emp.setCorreo(rs.getString("correo"));
            emp.setCelular(rs.getString("celular"));
            lista.add(emp);
        }
        cnn.close();
        ps.close();
        return lista;
    }
}
