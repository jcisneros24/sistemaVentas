package com.hiveit.pe.sistemaventas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.hiveit.pe.sistemaventas.bean.articulosBean;
import com.hiveit.pe.sistemaventas.connection.ConDB;

import Logica.c_articulos;

public class BdWorkDaoImp implements BdworkDao{
	ConDB conDB;	

	/*Implementacion tabla Articulos*/
	@Override
	public articulosBean insertarArticulo(articulosBean a) throws SQLException {
		Connection cnn = conDB.getConnection();
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

	@Override
	public articulosBean buscarArtCod(String codarticulo) throws SQLException {
		return buscarArtCod(codarticulo, null);
	}

	@Override
	public articulosBean buscarArtCod(String codarticulo, articulosBean a) throws SQLException {
		Connection cnn = conDB.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("select * from articulos where codarticulo=?");
        ps.setString(1, codarticulo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            if (a == null) {
                a = new articulosBean() {};
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

	@Override
	public boolean eliminarArticulo(String codarticulo) throws SQLException {
			Connection cnn = conDB.getConnection();
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

	@Override
	public boolean actualizarArticulo(c_articulos a) throws SQLException {
		Connection cnn = conDB.getConnection();
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

	@Override
	public ArrayList<articulosBean> mostrarArticulosConsulta() throws SQLException {
		Connection cnn = conDB.getConnection();
        PreparedStatement ps = null;
        ArrayList<articulosBean> lista = new ArrayList<articulosBean>();

        ps = cnn.prepareStatement("SELECT *from articulos ");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
        	articulosBean a = new articulosBean() {};
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

	@Override
	public ArrayList<articulosBean> mostrarArticulosMantenimiento() throws SQLException {
		Connection cnn = conDB.getConnection();
        PreparedStatement ps = null;
        ArrayList<articulosBean> lista = new ArrayList<articulosBean>();
        ps = cnn.prepareStatement("SELECT * FROM articulos");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
        	articulosBean a = new articulosBean() {};
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
	/*Implementacion tabla Articulos*/	
}
