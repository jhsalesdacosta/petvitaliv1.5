package ConfiSistema;

import javax.swing.JOptionPane;
import ConfiSistema.ConfiguracaoBancoDados;
import ConfiSistema.BancoDeDadosUtil;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JFormattedTextField;
 
public class BancoDeDados extends javax.swing.JFrame {

private ConfiguracaoBancoDados configuracao;

    public BancoDeDados() {
        initComponents();
        configuracao = new ConfiguracaoBancoDados();
        carregarConfiguracoes();
    }

    private void carregarConfiguracoes() {
        String servidor = configuracao.getServidor();
        String usuario = configuracao.getUsuario();
        String senha = configuracao.getSenha();

        ipServidor.setText(servidor);
        usuarioSQL.setText(usuario);
        senhaSQL.setText(senha);
    }

    private void salvarConfiguracoes() {
        String servidor = ipServidor.getText();
        String usuario = usuarioSQL.getText();
        String senha = new String(senhaSQL.getPassword());

        configuracao.salvarConfiguracoes(servidor, usuario, senha);
    }


    private void sairBancoActionPerformed(java.awt.event.ActionEvent evt) {
        dispose(); // Fecha a janela
    }

    private void salvarBancoActionPerformed(java.awt.event.ActionEvent evt) {
        salvarConfiguracoes();
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        TxtServidor = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JLabel();
        ipServidor = (JFormattedTextField) new javax.swing.JTextField();
        usuarioSQL = (JFormattedTextField) new javax.swing.JTextField();
        senhaSQL = new javax.swing.JPasswordField();
        BancoCk = new javax.swing.JButton();
        salvarBanco = new javax.swing.JButton();
        sairBanco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtServidor.setText("Servidor:");

        TxtUsuario.setText("Usuário:");

        TxtSenha.setText("Senha:");

        BancoCk.setText("Testar Conexão");
        BancoCk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BancoCkActionPerformed(evt);
            }
        });

        salvarBanco.setText("Salvar");
        salvarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBancoActionPerformed(evt);
            }
        });

        sairBanco.setText("Sair");
        sairBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtBanco))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sairBanco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salvarBanco))
                            .addComponent(senhaSQL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioSQL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ipBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(TxtServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BancoCk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ipBanco, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 22, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtServidor)
                        .addGap(0, 0, 0)
                        .addComponent(ipBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BancoCk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TxtUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioSQL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TxtBanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ipBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TxtSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaSQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBanco)
                    .addComponent(salvarBanco))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>                        

    private void BancoCkActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String servidor = ipServidor.getText();
        String usuario = usuarioSQL.getText(); // Obter o usuário do campo de texto
        String senha = new String(senhaSQL.getPassword()); // Obter a senha do campo de texto

            if (servidor.isEmpty()) {
            // Exibe uma mensagem de erro se o campo do servidor estiver vazio
                JOptionPane.showMessageDialog(null, "Por favor, insira o servidor do banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
            // Lógica para verificar a conexão com o servidor
                if (BancoDeDadosUtil.verificarConexao(servidor, usuario, senha, "nome_do_seu_banco")) {
                JOptionPane.showMessageDialog(null, "Conexão bem-sucedida com o servidor.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível conectar ao servidor.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

// Método para verificar a conexão com o servidor
    private static boolean verificarConexao(String servidor, String usuario, String senha, String banco) {
        try {
        Connection connection = BancoDeDadosUtil.conectar(servidor, usuario, senha, banco);
        BancoDeDadosUtil.desconectar(connection);
        return true; // Conexão bem-sucedida
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false; // Falha na conexão
    }
}
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtServidor = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JLabel();
        TxtBanco = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JLabel();
        usuarioSQL = new javax.swing.JFormattedTextField();
        ipServidor = new javax.swing.JFormattedTextField();
        ipBanco = new javax.swing.JFormattedTextField();
        senhaSQL = new javax.swing.JPasswordField();
        BancoCk = new javax.swing.JButton();
        salvarBanco = new javax.swing.JButton();
        sairBanco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtServidor.setText("Servidor");

        TxtUsuario.setText("Usuário");

        TxtBanco.setText("Banco de Dados");

        TxtSenha.setText("Senha");

        salvarBanco.setText("Salvar");

        sairBanco.setText("Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ipBanco)
                    .addComponent(TxtSenha)
                    .addComponent(TxtBanco)
                    .addComponent(TxtUsuario)
                    .addComponent(TxtServidor)
                    .addComponent(usuarioSQL)
                    .addComponent(senhaSQL)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ipServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BancoCk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sairBanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvarBanco)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(TxtServidor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BancoCk, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TxtUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioSQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TxtBanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ipBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TxtSenha)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(senhaSQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salvarBanco)
                            .addComponent(sairBanco))
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BancoDeDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BancoDeDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BancoDeDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BancoDeDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BancoDeDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BancoCk;
    private javax.swing.JLabel TxtBanco;
    private javax.swing.JLabel TxtSenha;
    private javax.swing.JLabel TxtServidor;
    private javax.swing.JLabel TxtUsuario;
    private javax.swing.JFormattedTextField ipBanco;
    private javax.swing.JFormattedTextField ipServidor;
    private javax.swing.JButton sairBanco;
    private javax.swing.JButton salvarBanco;
    private javax.swing.JPasswordField senhaSQL;
    private javax.swing.JFormattedTextField usuarioSQL;
    // End of variables declaration//GEN-END:variables
}