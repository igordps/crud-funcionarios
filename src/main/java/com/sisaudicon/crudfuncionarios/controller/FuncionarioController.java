package com.sisaudicon.crudfuncionarios.controller;

import com.sisaudicon.crudfuncionarios.model.Funcionario;
import com.sisaudicon.crudfuncionarios.model.dao.FuncionarioDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author igord
 */
public class FuncionarioController {

    private final FuncionarioDAO dao;

    public FuncionarioController() {
        dao = new FuncionarioDAO();
    }

    public boolean inserirFuncionario(Funcionario funcionario) throws SQLException {
        return dao.inserir(funcionario);
    }

    public List<Funcionario> listarTodos() throws SQLException {
        return dao.listarTodos();
    }

    public boolean excluirFuncionario(Long id) throws SQLException {
        return dao.excluir(id);
    }

    public boolean atualizar(Funcionario funcionario) throws SQLException {
        return dao.atualizar(funcionario);
    }

}
