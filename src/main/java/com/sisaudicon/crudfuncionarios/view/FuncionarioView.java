package com.sisaudicon.crudfuncionarios.view;

import com.sisaudicon.crudfuncionarios.controller.FuncionarioController;
import com.sisaudicon.crudfuncionarios.model.Funcionario;
import com.sisaudicon.crudfuncionarios.model.tablemodel.FuncionarioTableModel;
import com.sisaudicon.crudfuncionarios.util.documentfilter.NumericTextFieldFilter;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author igord
 */
public class FuncionarioView extends javax.swing.JFrame {

    private final FuncionarioController controller;
    private static final NumberFormat nf = NumberFormat.getInstance();
    private Funcionario model;
    private FuncionarioTableModel tableModel;

    /**
     * Creates new form LoginView
     */
    public FuncionarioView() {
        controller = new FuncionarioController();
        initComponents();
        
        ((AbstractDocument) jTextFieldValorSalario.getDocument()).setDocumentFilter(new NumericTextFieldFilter());
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);   
        
        carregarTableModelFuncionarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanelFormulario = new javax.swing.JPanel();
        jLabeNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelDtAdmissao = new javax.swing.JLabel();
        jDateChooserDtAdmissao = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
        jLabelValorSalario = new javax.swing.JLabel();
        jTextFieldValorSalario = new javax.swing.JTextField();
        jLabelStatus = new javax.swing.JLabel();
        jCheckBoxStatus = new javax.swing.JCheckBox();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Funcionários");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jPanelFormulario.setBackground(new java.awt.Color(0, 102, 204));
        jPanelFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de funcionários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabeNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabeNome.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNome.setBorder(null);

        jLabelDtAdmissao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDtAdmissao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDtAdmissao.setText("Data de Admissão:");

        jDateChooserDtAdmissao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelValorSalario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelValorSalario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValorSalario.setText("Valor do Salário:");

        jTextFieldValorSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldValorSalario.setBorder(null);
        jTextFieldValorSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorSalarioActionPerformed(evt);
            }
        });

        jLabelStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelStatus.setText("Status");

        jCheckBoxStatus.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome)
                            .addComponent(jLabeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelDtAdmissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooserDtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelValorSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(jTextFieldValorSalario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeNome)
                    .addComponent(jLabelDtAdmissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNome)
                    .addComponent(jDateChooserDtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabelStatus))
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabelValorSalario)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jCheckBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValorSalario)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBotoes.setBackground(new java.awt.Color(0, 102, 204));

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_adicionar.png"))); // NOI18N
        jButtonNovo.setText("Adicionar");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonAlterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_alterar.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_excluir.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTabela.setBackground(new java.awt.Color(0, 102, 204));
        jPanelTabela.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funcionários Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableFuncionario.setToolTipText("Dê um clique duplo para carregar um funcionário para Alteração ou Exclusão");
        jTableFuncionario.setRowHeight(20);
        jTableFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFuncionario);

        javax.swing.GroupLayout jPanelTabelaLayout = new javax.swing.GroupLayout(jPanelTabela);
        jPanelTabela.setLayout(jPanelTabelaLayout);
        jPanelTabelaLayout.setHorizontalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelTabelaLayout.setVerticalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        if (validacoesPreenchimentoFormulario()) {
            try{                
                Funcionario funcionario = getFuncionarioByFormulario();
                controller.inserirFuncionario(funcionario);
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Erro ao adicionar funcionário, verificar console para maiores detalhes", "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();                
            }
            carregarTableModelFuncionarios();
            limparCamposFormulario();
        }
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if (model != null && validacoesPreenchimentoFormulario()) {
            try {
                Funcionario funcionario = getFuncionarioByFormulario();
                funcionario.setId(model.getId());
                
                controller.atualizar(funcionario);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao excluir funcionário, verificar console para maiores detalhes", "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
            
            carregarTableModelFuncionarios();
            limparCamposFormulario();
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (model != null) {
            try {
                controller.excluirFuncionario(model.getId());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao excluir funcionário, verificar console para maiores detalhes", "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
            
            carregarTableModelFuncionarios();
            limparCamposFormulario();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionarioMouseClicked
        if (evt.getClickCount() == 2 && jTableFuncionario.getRowCount() > 0) {
            getFuncionario();
        }
    }//GEN-LAST:event_jTableFuncionarioMouseClicked

    private void jTextFieldValorSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorSalarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JCheckBox jCheckBoxStatus;
    private com.toedter.calendar.JDateChooser jDateChooserDtAdmissao;
    private javax.swing.JLabel jLabeNome;
    private javax.swing.JLabel jLabelDtAdmissao;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelValorSalario;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPanel jPanelTabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableFuncionario;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldValorSalario;
    // End of variables declaration//GEN-END:variables

    private boolean validacoesPreenchimentoFormulario() {
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Preenchimento do campo Nome é obrigatório!", "Informe o Nome", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (jTextFieldValorSalario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Preenchimento do campo Valor Salário é obrigatório!", "Informe o Valor do Salário", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (jDateChooserDtAdmissao.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Seleção do campo Data de Admissão é obrigatória!", "Selecione a Data de Admissão", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    private Funcionario getFuncionarioByFormulario() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(jTextFieldNome.getText());
            funcionario.setDataAdmissao(jDateChooserDtAdmissao.getDate());
            funcionario.setValorSalario(new BigDecimal(jTextFieldValorSalario.getText().replaceAll("[.]", "").replace(",", ".")).setScale(2, BigDecimal.ROUND_HALF_UP));
            funcionario.setStatus(jCheckBoxStatus.isSelected());

            return funcionario;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Valor do Salário com formato inválido, favor corrigir", "Salário inválido", JOptionPane.ERROR_MESSAGE);
            jTextFieldValorSalario.requestFocusInWindow();
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao carregar listagem de funcionários, verificar console para maiores detalhes", "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    private void getFuncionario() {
        if (jTableFuncionario.getRowCount() > 0) {
            model = tableModel.getRow(jTableFuncionario.convertRowIndexToModel(jTableFuncionario.getSelectedRow()));

            if (model != null) {
                jButtonNovo.setEnabled(false);
                jButtonAlterar.setEnabled(true);
                jButtonExcluir.setEnabled(true);

                jTextFieldNome.setText(model.getNome());
                jDateChooserDtAdmissao.setDate(model.getDataAdmissao());
                jTextFieldValorSalario.setText(nf.format(model.getValorSalario()));
                jCheckBoxStatus.setSelected(model.isStatus());
            }
        }
    }

    private void carregarTableModelFuncionarios() {
        try {
            tableModel = new FuncionarioTableModel(controller.listarTodos());
            jTableFuncionario.setModel(tableModel);
            formatarJTable(jTableFuncionario);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao carregar listagem de funcionários, verificar console para maiores detalhes", "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void limparCamposFormulario() {
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);

        jTextFieldNome.setText("");
        jTextFieldValorSalario.setText("");
        jDateChooserDtAdmissao.setDate(null);
        jCheckBoxStatus.setSelected(false);
    }
    
    public static void formatarJTable(JTable table) {

        table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        
        List<Integer> larguraColunas = Arrays.asList(30, 200, 50, 50,30);

        for (int i = 0; i < larguraColunas.size(); i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(larguraColunas.get(i));
        }

    }    
}
