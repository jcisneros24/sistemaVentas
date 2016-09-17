package Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Logica.c_stock;

public class d_stock {
     public static c_stock insertarStock(c_stock s) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO stock (codarticulo,stockinicial, stockactual,stockmin,stockmax) VALUES (?,?,?,?,?)");
        ps.setString(1, s.getCodarticulo());
        ps.setDouble(2, s.getStockinicial());
        ps.setDouble(3, s.getStockactual());
        ps.setDouble(4, s.getStockmin());
        ps.setDouble(5, s.getStockmax());
        ps.executeUpdate();
        cnn.close();
        ps.close();
        return s;
    }

    public static c_stock buscarCodArti(String codarticulo) throws SQLException {
        return buscarCodArti(codarticulo, null);
    }

     public static c_stock buscarCodArti( String codarticulo,c_stock s) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from stock where codarticulo=? ");
        ps.setString(1, codarticulo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (s == null) {
                s = new c_stock(){};
            }
            s.setIdstock(rs.getInt("idstock"));
            s.setCodarticulo(rs.getString("codarticulo"));
            s.setStockinicial(rs.getDouble("stockinicial"));
            s.setStockactual(rs.getDouble("stockactual"));
            s.setStockmin(rs.getDouble("stockmin"));
            s.setStockmax(rs.getDouble("stockmax"));
        }
        cnn.close();
        ps.close();
        return s;
    }
    public static boolean eliminarStocks(String codarticulo) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("delete from stock WHERE codarticulo=?");
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

     public static boolean actualizarStock(c_stock s) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("UPDATE stock SET stockactual=?, stockmin=?, stockmax=? WHERE idstock=" + s.getIdstock());
        ps.setDouble(1, s.getStockactual());
        ps.setDouble(2, s.getStockmin());
        ps.setDouble(3, s.getStockmax());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated >0) {
            return true;
        } else {
            return false;
        }
    }

     public static ArrayList<c_stock> mostrarStock() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<c_stock> lista = new ArrayList<c_stock>();

        ps = cnn.prepareStatement("SELECT codarticulo,stockinicial,stockactual,stockmin,stockmax FROM stock");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            c_stock s = new c_stock(){};
            s.setCodarticulo(rs.getString("codarticulo"));
            s.setStockinicial(rs.getDouble("stockinicial"));
            s.setStockactual(rs.getDouble("stockactual"));
            s.setStockmin(rs.getDouble("stockmin"));
            s.setStockmax(rs.getDouble("stockmax"));
            lista.add(s);
        }
        cnn.close();
        ps.close();
        return lista;
    }
}
