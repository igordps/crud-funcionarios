package com.sisaudicon.crudfuncionarios.model.dao;

import com.sisaudicon.crudfuncionarios.model.ConnectionFactory;
import com.sisaudicon.crudfuncionarios.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igord
 */
public class FuncionarioDAO {

    public boolean inserir(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionario (nome, data_admissao, valor_salario, status) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setDate(2, new java.sql.Date(funcionario.getDataAdmissao().getTime()));
            stmt.setBigDecimal(3, funcionario.getValorSalario());
            stmt.setBoolean(4, funcionario.isStatus());
            return stmt.executeUpdate() > 0;
        }
    }

    public List<Funcionario> listarTodos() throws SQLException {
        String sql = "SELECT * FROM funcionario order by id";
        List<Funcionario> funcionarios = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getLong("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setDataAdmissao(rs.getDate("data_admissao"));
                funcionario.setValorSalario(rs.getBigDecimal("valor_salario"));
                funcionario.setStatus(rs.getBoolean("status"));

                funcionarios.add(funcionario);
            }
        }
        return funcionarios;
    }
    
    public boolean atualizar(Funcionario funcionario) throws SQLException {
        String sql = "UPDATE funcionario SET nome = ?, data_admissao = ?, valor_salario = ?, status = ? WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, funcionario.getNome());
            stmt.setDate(2, new java.sql.Date(funcionario.getDataAdmissao().getTime()));
            stmt.setBigDecimal(3, funcionario.getValorSalario());
            stmt.setBoolean(4, funcionario.isStatus());
            stmt.setLong(5, funcionario.getId());

            return stmt.executeUpdate() > 0;
        }
    }    
    
    public boolean excluir(Long id) throws SQLException {
        String sql = "DELETE FROM funcionario WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, id);

            return stmt.executeUpdate() > 0;
        }
    }    

}
