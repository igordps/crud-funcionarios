package com.sisaudicon.crudfuncionarios.controller;

import com.sisaudicon.crudfuncionarios.model.Login;
import com.sisaudicon.crudfuncionarios.model.dao.LoginDAO;
import java.sql.SQLException;

/**
 *
 * @author igord
 */
public class LoginController {

    private final LoginDAO dao;

    public LoginController() {
        dao = new LoginDAO();
    }

    public boolean inserir(String nome, String email, String senha) throws SQLException {
        Login login = new Login(nome, email, senha);

        return dao.inserir(login);
    }

    public Login buscarLogin(String email, String senha) {
        try {
            return dao.buscarLogin(email, senha);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isEmailCadastrado(String email) throws SQLException {
        return dao.isEmailCadastrado(email);
    }

}
