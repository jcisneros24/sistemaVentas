package com.hiveit.pe.sistemaventas.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.hiveit.pe.sistemaventas.bean.articulosBean;

import Logica.c_articulos;

public interface BdworkDao{
	
	/*Tabla Articulos*/
	articulosBean insertarArticulo (articulosBean a) throws SQLException;
	articulosBean buscarArtCod(String codarticulo) throws SQLException;
	articulosBean buscarArtCod(String codarticulo, articulosBean a) throws SQLException;
	boolean eliminarArticulo(String codarticulo) throws SQLException;
	boolean actualizarArticulo(c_articulos a) throws SQLException;
	ArrayList<articulosBean> mostrarArticulosConsulta() throws SQLException;
	ArrayList<articulosBean> mostrarArticulosMantenimiento() throws SQLException;

}
