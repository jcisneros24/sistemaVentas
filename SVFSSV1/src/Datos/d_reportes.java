package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Logica.c_reportes;

public class d_reportes {
	
	 public static ArrayList<c_reportes> mostrarStock() throws SQLException {
	        Connection cnn = BD.getConnection();
	        PreparedStatement ps = null;
	        ArrayList<c_reportes> lista = new ArrayList<c_reportes>();

	        ps = cnn.prepareStatement("SELECT  a.codarticulo, a.descripcion, s.stockinicial, s.stockactual FROM stock s INNER JOIN articulos a ON a.codarticulo=s.codarticulo WHERE estado='ACTIVO'");
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            c_reportes r = new c_reportes(){};
	            r.setCodarticulo(rs.getString("codarticulo"));
	            r.setDescripcion(rs.getString("descripcion"));
	            r.setStockinicial(rs.getDouble("stockinicial"));
	            r.setStockactual(rs.getDouble("stockactual"));
	            lista.add(r);
	        }
	        cnn.close();
	        ps.close();
	        return lista;
	    }

	 public static ArrayList<c_reportes> mostrarVentas() throws SQLException {
	        Connection cnn = BD.getConnection();
	        PreparedStatement ps = null;
	        ArrayList<c_reportes> lista = new ArrayList<c_reportes>();

	        ps = cnn.prepareStatement("SELECT v.numcompro,c.apellidos,e.dni, v.fechaventa, a.descripcion, dv.pvunt,dv.cantidad, dv.total  FROM ventas v INNER JOIN cliente c ON c.dni=v.dnicliente INNER JOIN empleado e ON e.dni=v.dniempleado INNER JOIN detaventa dv ON dv.numcompro=v.numcompro INNER JOIN articulos a ON a.codarticulo=dv.codarticulo");
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            c_reportes r = new c_reportes(){};
	            r.setCodarticulo(rs.getString("numcompro"));
	            r.setApellidos(rs.getString("apellidos"));
	            r.setDni(rs.getInt("dni"));
	            r.setFecha(rs.getString("fechaventa"));
	            r.setDescripcion(rs.getString("descripcion"));
	            r.setPvunt(rs.getDouble("pvunt"));
	            r.setCantidad(rs.getInt("cantidad"));
	            r.setTotal(rs.getDouble("total"));
	            lista.add(r);
	        }
	        cnn.close();
	        ps.close();
	        return lista;
	    }

}
