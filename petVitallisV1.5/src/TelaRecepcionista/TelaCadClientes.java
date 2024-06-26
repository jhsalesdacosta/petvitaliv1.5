package TelaRecepcionista;

import ClassesDeCadastro.CadClientes;
import TelasLogin.TelaMenu;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kauan
 */
public class TelaCadClientes extends javax.swing.JFrame {

    /*
     * Creates new form CadClientes
     */
    public TelaCadClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        String caminhoImagem = "/icon/logo PET VITALLI.png";
        
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

        jSpinner1 = new javax.swing.JSpinner();
        CliSalvar = new javax.swing.JButton();
        txtCliSenha = new javax.swing.JPasswordField();
        txtCliConfSenha = new javax.swing.JPasswordField();
        txtCliNome = new javax.swing.JTextField();
        txtCliEmail = new javax.swing.JTextField();
        txtCliNum = new javax.swing.JTextField();
        txtCliCpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ckSenha = new javax.swing.JCheckBox();
        VoltarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastros de Clientes");

        CliSalvar.setText("Salvar");
        CliSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CliSalvarActionPerformed(evt);
            }
        });

        txtCliNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCliNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        jLabel4.setText("Email");

        jLabel5.setText("Número");

        jLabel6.setText("CPF");

        jLabel7.setText("Senha");

        jLabel8.setText("Confirmar senha");

        ckSenha.setText("Mostra senha");
        ckSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckSenhaActionPerformed(evt);
            }
        });

        VoltarMenu.setText("Voltar");
        VoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckSenha)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VoltarMenu)
                        .addGap(114, 114, 114)
                        .addComponent(CliSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                    .addGap(32, 32, 32)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCliNum)
                                .addComponent(txtCliEmail)
                                .addComponent(txtCliCpf)
                                .addComponent(txtCliSenha)
                                .addComponent(txtCliConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(ckSenha)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CliSalvar)
                            .addComponent(VoltarMenu))
                        .addGap(62, 62, 62))))
        );

        setBounds(0, 0, 448, 423);
    }// </editor-fold>//GEN-END:initComponents

    private void ckSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckSenhaActionPerformed
      
        if (ckSenha.isSelected()) {
                    txtCliSenha.setEchoChar((char) 0);
                    txtCliConfSenha.setEchoChar((char) 0);// Mostrar a senha
                } else {
                    txtCliSenha.setEchoChar('*');
                    txtCliConfSenha.setEchoChar('*');// Ocultar a senha
                }
    }//GEN-LAST:event_ckSenhaActionPerformed

    private void CliSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CliSalvarActionPerformed
      
         CadClientes cli = new CadClientes();
     
       
        String Senha, confSenha;
        
        int NumCli, CpfCli;// essa vaviavel é para poder transformar String em número
        
        
        //Os codigo de nome, usuario, email, senha e confirmar senha são praticamente iguais
        //O que  da é o (txt) que sera usado
        //E aonde ele vai setar as coisa(Set)
        
        if (!txtCliNome.getText().isEmpty()) {
            cli.setNome(txtCliNome.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Campo Nome Inválido");
        }
        
        if (!txtCliEmail.getText().isEmpty()) {
            cli.setEmail(txtCliEmail.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Campo Email Inválido");
        }
  
        //Aqui ele só permite número
        //Aqui tambem usamos a variavel NumCli
        
        if (!txtCliNum.getText().isEmpty()) {
        try {
            NumCli = (int) Long.parseLong(txtCliNum.getText());
            
            cli.setNumero(NumCli);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo número Inválido");
           
        }
           } else {
        JOptionPane.showMessageDialog(null, "Campo número Inválido");
          
          }
        
        if (!txtCliCpf.getText().isEmpty()) {
        try {
            CpfCli = (int) Long.parseLong(txtCliCpf.getText());
            
            cli.setCpf(CpfCli);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo CPF Inválido");
           
        }
           } else {
        JOptionPane.showMessageDialog(null, "Campo CPF Inválido");
          
          }
         
        
        
        Senha = txtCliSenha.getText();
        confSenha = txtCliConfSenha.getText();
        
        
        //Esse codigo é um pouco diferente pq ele precisa que a senha e Conf Senha sejam iguais
        
         if (Senha.equals(confSenha) && !Senha.isEmpty()) {
            cli.setSenha(txtCliSenha.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Campo de Senha Inválido");
        }
         
         
         
         //Isso aqui em baixo é só para poder fazer aquele negocio de só aceitar número funcionar certo
        
         String textNum = txtCliNum.getText();
         String textCpf = txtCliCpf.getText();
         
         //Define uma expressão regular para verificar se o texto contém apenas números
         String regexNumerico = "\\d+";  
         
         // Cria um padrão regex 
         //Pattern é uma classe em Java que compila uma expressão regular em um objeto de padrão.
         //Uma expressão regular é uma sequência de caracteres que define um padrão de busca.
         Pattern pattern = Pattern.compile(regexNumerico);
         
         // Cria um Matcher para aplicar o padrão ao texto do campo
         //Matcher é uma classe que realiza a correspondência de padrões em uma sequência de caracteres. 
         //Ela é usada para aplicar um padrão regex a uma determinada string e encontrar todas as ocorrências desse padrão na string.
         Matcher matcherNumCli = pattern.matcher(textNum);
         Matcher matcherCpfCli = pattern.matcher(textCpf);
       
        if (Senha.equals(confSenha) && 
         !txtCliNome.getText().isEmpty() && 
         !txtCliEmail.getText().isEmpty() && 
         !txtCliNum.getText().isEmpty() && 
         !txtCliSenha.getText().isEmpty() &&
         !txtCliConfSenha.getText().isEmpty() && 
         !txtCliCpf.getText().isEmpty() &&
          matcherNumCli.matches() &&
          matcherCpfCli.matches()) {
            cli.IncluiCli();
        }
        else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente");
        }
        
    }                                         
   
    private void ButaoVoltaActionPerformed(java.awt.event.ActionEvent evt) {                                           
  
        dispose();
    }//GEN-LAST:event_CliSalvarActionPerformed
   
    private void VoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarMenuActionPerformed
   
        this.dispose();
       
    }//GEN-LAST:event_VoltarMenuActionPerformed

    private void txtCliNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCliNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCliNomeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CliSalvar;
    private javax.swing.JButton VoltarMenu;
    private javax.swing.JCheckBox ckSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPasswordField txtCliConfSenha;
    private javax.swing.JTextField txtCliCpf;
    private javax.swing.JTextField txtCliEmail;
    private javax.swing.JTextField txtCliNome;
    private javax.swing.JTextField txtCliNum;
    private javax.swing.JPasswordField txtCliSenha;
    // End of variables declaration//GEN-END:variables
}
