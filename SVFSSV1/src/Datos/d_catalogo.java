package Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Logica.c_catalogo;
	
public class d_catalogo {    
     public static ArrayList<c_catalogo> mostrarArticulosConsulta() throws SQLException {
         Connection cnn = BD.getConnection();
         PreparedStatement ps = null;
         ArrayList<c_catalogo> lista = new ArrayList<c_catalogo>();
         ps = cnn.prepareStatement("SELECT a.codarticulo,a.descripcion,a.codfam,s.stockactual FROM articulos a INNER JOIN stock s ON s.codarticulo=a.codarticulo WHERE estado='ACTIVO'");
         ResultSet rs = ps.executeQuery();
         while (rs.next()) {
        	c_catalogo c = new c_catalogo() {};
         	c.setCodarticulo(rs.getString("codarticulo"));
            c.setDescripcion(rs.getString("descripcion"));
            c.setCodfam(rs.getString("codfam"));
            c.setStockactual(rs.getString("stockactual"));
             lista.add(c);
         }
         cnn.close();
         ps.close();
         return lista;
     }
}
