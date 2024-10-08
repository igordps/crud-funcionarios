package com.sisaudicon.crudfuncionarios.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author igord
 */
public class Funcionario {
    private Long id;
    private String nome;
    private BigDecimal valorSalario;
    private Date dataAdmissao;
    private boolean status;

    public Funcionario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(BigDecimal valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
