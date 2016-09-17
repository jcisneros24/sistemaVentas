package com.hiveit.pe.sistemaventas.dao;

import java.sql.SQLException;

import com.hiveit.pe.sistemaventas.bean.articulosBean;

public interface BdworkDao {
	
	articulosBean insertarArticulo (articulosBean a) throws SQLException;
	     

}
