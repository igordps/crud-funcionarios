package com.sisaudicon.crudfuncionarios.controller;

import com.sisaudicon.crudfuncionarios.model.Login;
import com.sisaudicon.crudfuncionarios.model.dao.LoginDAO;

/**
 *
 * @author igord
 */
public class LoginController {
    
    private final LoginDAO dao;

    public LoginController() {
        dao = new LoginDAO();
    }

    public boolean salvarLogin(String nome, String email, String senha) {
        Login login = new Login(nome, email, senha);
        try {
            return dao.salvar(login);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Login buscarLogin(String email, String senha) {
        try {
            return dao.buscarLogin(email, senha);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }    
    
}
