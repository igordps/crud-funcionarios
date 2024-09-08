package com.sisaudicon.crudfuncionarios.model.tablemodel;

import com.sisaudicon.crudfuncionarios.model.Funcionario;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author igord
 */
public class FuncionarioTableModel extends AbstractTableModel{
    
    private final String[] columns = {"Código","Nome","Dt.Admissão","Valor Salário","Status"};
    private final List<Funcionario> rows;
    
    public FuncionarioTableModel(List<Funcionario> rows) {
        this.rows = rows;
    }        

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        switch (columnIndex) {

            case 0:
                return Long.class;
            case 1:
                return String.class;
            case 2:
                return Date.class;
            case 3:
                return BigDecimal.class;
            case 4:
                return Boolean.class;
            default:
                throw new IllegalArgumentException("Coluna com índice inválido!");
        }        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario model = rows.get(rowIndex);
        
        switch (columnIndex) {

            case 0:
                return model.getId();
            case 1:
                return model.getNome();
            case 2:
                return (model.getDataAdmissao()!=null ? model.getDataAdmissao() : "");
            case 3:
                return (model.getValorSalario()!=null ? model.getValorSalario() : "");
            case 4:
                return model.isStatus();
            default:
                throw new IllegalArgumentException("Coluna com índice inválido!");
        }       
    }
    
    // Recupera um objeto da tabela na posicao selecionada
    public Funcionario getRow(int index) {
        return this.rows.get(index);
    }
    
    // Recupera todos os objetos da tabela
    public List<Funcionario> getRows() {
        return this.rows;
    }
    
    // Arualiza a tabela
    public void update() {
        fireTableDataChanged();
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }    
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public void removeAll(){
        rows.clear();
    }        
    
}
