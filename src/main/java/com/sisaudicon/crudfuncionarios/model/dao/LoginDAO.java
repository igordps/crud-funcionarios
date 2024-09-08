package com.sisaudicon.crudfuncionarios.model.dao;

import com.sisaudicon.crudfuncionarios.model.ConnectionFactory;
import com.sisaudicon.crudfuncionarios.model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;

/**
 *
 * @author igord
 */
public class LoginDAO {
    
    public boolean salvar(Login login) throws SQLException {
        String sql = "INSERT INTO login (nome, email, senha) VALUES (?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, login.getNome());
            stmt.setString(2, login.getEmail());
            stmt.setString(3, hashSenha(login.getSenha()));
            return stmt.executeUpdate() > 0;
        }
    }

    private String hashSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(senha.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar hash da senha", e);
        }
    }

    public Login buscarLogin(String email, String senha) throws SQLException {
        String sql = "SELECT * FROM login WHERE email = ? AND senha = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, hashSenha(senha));
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Login(rs.getString("nome"), rs.getString("email"), rs.getString("senha"));
                }
                return null;
            }
        }
    }    
    
}
