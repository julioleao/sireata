package br.edu.utfpr.dv.sireata.dao;

import java.sql.SQLException;

import br.edu.utfpr.dv.sireata.model.ObjectDAO;

public abstract class StrategyDAO {

    protected Salvar salvar;

    public int salvar(ObjectDAO objDAO) throws SQLException {
        return salvar.salvar(objDAO);
    }
}
