package Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Logica.c_detacompra;
public class d_detacompra {
     public static c_detacompra insertarDetaCompra(c_detacompra dv) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO detacompra (numcompro,codarticulo, cantidad,pvunt,total) VALUES (?,?,?,?,?)");
        ps.setString(1, dv.getNumcompro());
        ps.setString(2, dv.getCodarticulo());
        ps.setDouble(3, dv.getCantidad());
        ps.setDouble(4, dv.getPvunt());
        ps.setDouble(5, dv.getTotal());
        ps.executeUpdate();
        cnn.close();
        ps.close();
        return dv;
    }
}
