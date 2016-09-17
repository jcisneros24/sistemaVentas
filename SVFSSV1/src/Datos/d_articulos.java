package Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Logica.c_articulos;
	
public class d_articulos {
     public static c_articulos insertarArticulo(c_articulos a) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO articulos (codarticulo, descripcion,color,codfam,codmedida,proveedor,estado,fingreso) VALUES (?,?,?,?,?,?,?,?)");
        ps.setString(1, a.getCodarticulo());
        ps.setString(2, a.getDescripcion());
        ps.setString(3, a.getColor());
        ps.setString(4, a.getCodfam());
        ps.setString(5, a.getCodmedida());
        ps.setString(6, a.getCodprove());
        ps.setString(7, a.getEstado());
        ps.setString(8, a.getFingreso());
        ps.executeUpdate();
        cnn.close();
        ps.close();
        return a;
    }

    public static c_articulos buscarArtCod(String codarticulo) throws SQLException {
        return buscarArtCod(codarticulo, null);
    }

     public static c_articulos buscarArtCod(String codarticulo, c_articulos a) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from articulos where codarticulo=?");
        ps.setString(1, codarticulo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (a == null) {
                a = new c_articulos() {};
            }
            a.setIdarticulo(rs.getInt("idarticulo"));
            a.setCodarticulo(rs.getString("codarticulo"));
            a.setDescripcion(rs.getString("descripcion"));
            a.setColor(rs.getString("color"));
            a.setCodfam(rs.getString("codfam"));
            a.setCodmedida(rs.getString("codmedida"));
            a.setCodprove(rs.getString("proveedor"));
            a.setEstado(rs.getString("estado"));
            a.setFingreso(rs.getString("fingreso"));
        }
        cnn.close();
        ps.close();
        return a;
    }
    public static boolean eliminarArticulo(String codarticulo) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("delete from articulos WHERE codarticulo=?");
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

     public static boolean actualizarArticulo(c_articulos a) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("UPDATE articulos SET codarticulo=?, descripcion=?,color=?,codfam=?, codmedida=?, proveedor=?,estado=?, fingreso=? WHERE idarticulo=" + a.getIdarticulo());
        ps.setString(1, a.getCodarticulo());
        ps.setString(2,a.getDescripcion());
        ps.setString(3,a.getColor());
        ps.setString(4, a.getCodfam());
        ps.setString(5, a.getCodmedida());
        ps.setString(6,a.getCodprove());
        ps.setString(7, a.getEstado());
        ps.setString(8, a.getFingreso());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }

     public static ArrayList<c_articulos> mostrarArticulosConsulta() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<c_articulos> lista = new ArrayList<c_articulos>();

        ps = cnn.prepareStatement("SELECT *from articulos ");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
        	c_articulos a = new c_articulos() {};
            a.setCodarticulo(rs.getString("codarticulo"));
            a.setDescripcion(rs.getString("descripcion"));
            a.setColor(rs.getString("color"));
            a.setCodfam(rs.getString("codfam"));
            a.setCodmedida(rs.getString("codmedida"));
            a.setCodprove(rs.getString("proveedor"));
            a.setEstado(rs.getString("estado"));
            a.setFingreso(rs.getString("fingreso"));
            lista.add(a);
        }
        cnn.close();
        ps.close();
        return lista;
    }
     public static ArrayList<c_articulos> mostrarArticulosMantenimiento() throws SQLException {
         Connection cnn = BD.getConnection();
         PreparedStatement ps = null;
         ArrayList<c_articulos> lista = new ArrayList<c_articulos>();
         ps = cnn.prepareStatement("SELECT * FROM articulos");
         ResultSet rs = ps.executeQuery();
         while (rs.next()) {
         	c_articulos a = new c_articulos() {};
             a.setCodarticulo(rs.getString("codarticulo"));
             a.setDescripcion(rs.getString("descripcion"));
             a.setColor(rs.getString("color"));
             a.setCodfam(rs.getString("codfam"));
             a.setCodmedida(rs.getString("codmedida"));
             a.setCodprove(rs.getString("proveedor"));
             a.setEstado(rs.getString("estado"));
             a.setFingreso(rs.getString("fingreso"));
             lista.add(a);
         }
         cnn.close();
         ps.close();
         return lista;
     }
}
