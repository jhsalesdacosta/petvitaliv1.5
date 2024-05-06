/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TelaRecepcionista;

import ClassesDoRecepcionista.CadProdutos;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author paje9
 */
public class TelaCadProdutos extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeCadPro
     */
    public TelaCadProdutos() {
        super("Cadastro de Produtos");
        initComponents();
         this.setLocationRelativeTo(null);
         String caminhoImagem = "/icon/iconepet.png";
        
         // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        // Define o ícone da janela
        this.setIconImage(icon.getImage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCadProdVoltarParaMenu = new javax.swing.JButton();
        cadastroNomeDoProduto = new javax.swing.JTextField();
        cadastroValidadeDeProduto = new javax.swing.JTextField();
        labelNomeDoProduto = new javax.swing.JLabel();
        labelValidadeDoProduto = new javax.swing.JLabel();
        labelTipoDeProduto = new javax.swing.JLabel();
        cadastroTipoDeProduto = new javax.swing.JComboBox<>();
        buttonCadProdConfirmar = new javax.swing.JButton();
        cadastroCódigoDoProduto = new javax.swing.JTextField();
        labelCódigoDoProduto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonCadProdVoltarParaMenu.setText("Voltar");
        buttonCadProdVoltarParaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadProdVoltarParaMenuActionPerformed(evt);
            }
        });

        cadastroNomeDoProduto.setAlignmentX(0.0F);
        cadastroNomeDoProduto.setAlignmentY(0.0F);

        cadastroValidadeDeProduto.setAlignmentX(0.0F);
        cadastroValidadeDeProduto.setAlignmentY(0.0F);
        cadastroValidadeDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroValidadeDeProdutoActionPerformed(evt);
            }
        });

        labelNomeDoProduto.setText("Nome do Produto");
        labelNomeDoProduto.setAlignmentY(0.0F);

        labelValidadeDoProduto.setText("Validade");
        labelValidadeDoProduto.setAlignmentY(0.0F);

        labelTipoDeProduto.setText("Tipo de Produto");
        labelTipoDeProduto.setAlignmentY(0.0F);

        cadastroTipoDeProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Limpeza", "Medicamento", "Utencílio", "Ração" }));
        cadastroTipoDeProduto.setAlignmentX(0.0F);
        cadastroTipoDeProduto.setAlignmentY(0.0F);
        cadastroTipoDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroTipoDeProdutoActionPerformed(evt);
            }
        });

        buttonCadProdConfirmar.setText("Confirmar");
        buttonCadProdConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadProdConfirmarActionPerformed(evt);
            }
        });

        labelCódigoDoProduto.setText("Código do Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCadProdVoltarParaMenu)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTipoDeProduto)
                            .addComponent(cadastroTipoDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCódigoDoProduto)
                            .addComponent(cadastroCódigoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonCadProdConfirmar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cadastroValidadeDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelValidadeDoProduto)
                                .addComponent(labelNomeDoProduto)
                                .addComponent(cadastroNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeDoProduto)
                    .addComponent(labelCódigoDoProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroCódigoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValidadeDoProduto)
                    .addComponent(labelTipoDeProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroValidadeDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroTipoDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadProdVoltarParaMenu)
                    .addComponent(buttonCadProdConfirmar))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroTipoDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroTipoDeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroTipoDeProdutoActionPerformed

    private void buttonCadProdVoltarParaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadProdVoltarParaMenuActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCadProdVoltarParaMenuActionPerformed

    private void buttonCadProdConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadProdConfirmarActionPerformed
        /*String nomeAnimal = CampoNomedoPet.getText();
        String nomeCliente = CampoNomedoTutor.getText();
        String tipoConsulta = (String) CaixaDeTipodeConsultas.getSelectedItem();

        // Aqui você pode adicionar a lógica para agendar a consulta com os dados fornecidos

        // Por enquanto, apenas exibimos uma mensagem com os dados
        JOptionPane.showMessageDialog(this, "Consulta agendada:\n\n"
                                        + "Nome do Animal: " + nomeAnimal + "\n"
                                        + "Nome do Cliente: " + nomeCliente + "\n"
                                        + "Tipo de Consulta: " + tipoConsulta); */
        
        
        CadProdutos nomeProduto = new CadProdutos();
        CadProdutos tipoProduto = new CadProdutos();
        CadProdutos validadeProduto = new CadProdutos();
        CadProdutos codProduto = new CadProdutos ();
        
        String nomeProd = cadastroNomeDoProduto.getText();
        String validadeProd = cadastroValidadeDeProduto.getText();
        int tipoProd = cadastroTipoDeProduto.getSelectedIndex();
        String codProd = (String) cadastroCódigoDoProduto.getText();
        
        if (!cadastroCódigoDoProduto.getText().isEmpty() && !cadastroValidadeDeProduto.getText().isEmpty() && !cadastroNomeDoProduto.getText().isEmpty() /*&& cadastroTipoDeProduto.getSelectedIndex().isEmpty()*/) {
            JOptionPane.showMessageDialog(this, "Produto cadastrado!:\n\n"
                                        + "Cód. do Produto: " + codProd + "\n"
                                        + "Nome do Produto: " + nomeProd + "\n"
                                        + "Tipo do Produto: " + tipoProd + "\n"
                                        + "Validade do Produto: " + validadeProd)
                                        ;    
        } else {
           JOptionPane.showMessageDialog(null, "Produto não cadastrado!\n\nPreencha os campos corretamente.");
        }
        
        

        
        
        
        if (!cadastroCódigoDoProduto.getText().isEmpty()) {
            codProduto.setCodProduto(cadastroCódigoDoProduto.getText());
            
        }else{
            JOptionPane.showMessageDialog(null, "Campo Código do Produto Inválido");
        }
               
        if (!cadastroNomeDoProduto.getText().isEmpty()) {
            nomeProduto.setNomeProduto(cadastroNomeDoProduto.getText());
            
        }else{
            JOptionPane.showMessageDialog(null, "Campo Nome Inválido");
        }
        
        if (cadastroTipoDeProduto == null || tipoProd == 0) {
            JOptionPane.showMessageDialog(null, "Campo Tipo de Produto Inválido");
            
        } else{
            tipoProduto.setTipoDeProduto((String) cadastroTipoDeProduto.getSelectedItem());

        } 
        
        if (!cadastroValidadeDeProduto.getText().isEmpty()) {
            validadeProduto.setValidadeProduto(cadastroValidadeDeProduto.getText());
            
        }else{
            JOptionPane.showMessageDialog(null, "Campo Validade Inválido");
        }
    }//GEN-LAST:event_buttonCadProdConfirmarActionPerformed

    private void cadastroValidadeDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroValidadeDeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroValidadeDeProdutoActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadProdConfirmar;
    private javax.swing.JButton buttonCadProdVoltarParaMenu;
    private javax.swing.JTextField cadastroCódigoDoProduto;
    private javax.swing.JTextField cadastroNomeDoProduto;
    private javax.swing.JComboBox<String> cadastroTipoDeProduto;
    private javax.swing.JTextField cadastroValidadeDeProduto;
    private javax.swing.JLabel labelCódigoDoProduto;
    private javax.swing.JLabel labelNomeDoProduto;
    private javax.swing.JLabel labelTipoDeProduto;
    private javax.swing.JLabel labelValidadeDoProduto;
    // End of variables declaration//GEN-END:variables
}
