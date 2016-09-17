package Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Logica.c_detaventa;
public class d_detaventa {
     public static c_detaventa insertarDetaVenta(c_detaventa v) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO detaventa (numcompro,codarticulo, cantidad,pvunt,total) VALUES (?,?,?,?,?)");
        ps.setString(1, v.getNumcompro());
        ps.setString(2, v.getCodarticulo());
        ps.setDouble(3, v.getCantidad());
        ps.setDouble(4, v.getPvunt());
        ps.setDouble(5, v.getTotal());
        ps.executeUpdate();
        cnn.close();
        ps.close();
        return v;
    }

     public static ArrayList<c_detaventa> mostrarVenta() throws SQLException {
         Connection cnn = BD.getConnection();
         PreparedStatement ps = null;
         ArrayList<c_detaventa> lista = new ArrayList<c_detaventa>();

         ps = cnn.prepareStatement("SELECT * FROM detaventa");
         ResultSet rs = ps.executeQuery();
         while (rs.next()) {
        	 c_detaventa dv = new c_detaventa() {};
             dv.setNumcompro(rs.getString("numcompro"));
             dv.setCodarticulo(rs.getString("codarticulo"));
             dv.setCantidad(rs.getDouble("cantidad"));
             dv.setPvunt(rs.getDouble("pvunt"));
             dv.setTotal(rs.getDouble("total"));
             lista.add(dv);
         }
         cnn.close();
         ps.close();
         return lista;
     }
}
