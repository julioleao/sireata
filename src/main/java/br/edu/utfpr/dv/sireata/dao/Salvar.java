package br.edu.utfpr.dv.sireata.dao;

import java.sql.SQLException;

import br.edu.utfpr.dv.sireata.model.ObjectDAO;

public interface Salvar {

	public int salvar(ObjectDAO objDAO) throws SQLException;
}
