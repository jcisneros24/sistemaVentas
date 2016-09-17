package Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Logica.c_updatestock;

public class d_updatestock {
     public static boolean actualizarStock(c_updatestock s) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("UPDATE stock SET stockactual=? WHERE idstock=" + s.getIdstock());
        ps.setDouble(1, s.getStockfinal());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated >0) {
            return true;
        } else {
            return false;
        }
    }

}
