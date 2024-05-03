package TelasLogin;

import TelaADM.TelaConsFuncionarios;
import TelasLogin.TelaLogin;
import TelaADM.TelasCadFuncionarios;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import TelaRecepcionista.TelaCadProdutos;
import TelaRecepcionista.TelaConsProduto;
import TelaRecepcionista.TelaCadClientes;
import TelaRecepcionista.TelaCadPet;
import TelaRecepcionista.TelaConsClientes;
import TelaRecepcionista.TelaConsPets;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form telaMenu
     */
    public TelaMenu() {
        super("TELA DE MENUS");
        initComponents();
        this.setLocationRelativeTo(null);
        String caminhoImagem = "/icon/iconepet.png";
        
         // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        // Define o ícone da janela
        this.setIconImage(icon.getImage());
        
         }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoNomedoTutor = new javax.swing.JTextField();
        CampoNomedoPet = new javax.swing.JTextField();
        CaixaDeTipodeConsultas = new javax.swing.JComboBox<>();
        ButaoAgendarCons = new javax.swing.JButton();
        painel2 = new javax.swing.JPanel();
        ButaoDeCadClientes = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        cadastros = new javax.swing.JMenu();
        MenuFuncionarios = new javax.swing.JMenu();
        CadFuncionarios = new javax.swing.JMenuItem();
        ConsFuncionarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        CadClientes = new javax.swing.JMenuItem();
        ConsClientes = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        CadProdutos = new javax.swing.JMenuItem();
        ConsProdutos = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        vendas = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        voltar = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 0));

        Painel.setBackground(new java.awt.Color(0, 0, 0));
        Painel.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo da Consulta");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome do Pet");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome do Tutor");

        CaixaDeTipodeConsultas.setForeground(new java.awt.Color(255, 255, 255));
        CaixaDeTipodeConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta de Rotina", "Vacinação", "Tratamento" }));

        ButaoAgendarCons.setText("Agendar Consulta");
        ButaoAgendarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoAgendarConsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoNomedoTutor, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(CampoNomedoPet)
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(CaixaDeTipodeConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addComponent(ButaoAgendarCons)
                        .addGap(173, 173, 173))))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNomedoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNomedoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CaixaDeTipodeConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(ButaoAgendarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel2.setBackground(new java.awt.Color(0, 0, 0));
        painel2.setForeground(new java.awt.Color(0, 0, 0));

        ButaoDeCadClientes.setForeground(new java.awt.Color(0, 0, 0));
        ButaoDeCadClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plano-de-saude-pet-beneficios-para-clinica-veterinaria.png"))); // NOI18N
        ButaoDeCadClientes.setText("CADASTROS DE CLIENTES");
        ButaoDeCadClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CADASTROS DE CLIENTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        ButaoDeCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoDeCadClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addComponent(ButaoDeCadClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addComponent(ButaoDeCadClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 344, Short.MAX_VALUE))
        );

        cadastros.setText("Cadastros/Consultas");

        MenuFuncionarios.setText("Funcionarios");

        CadFuncionarios.setText("Cadastrar");
        CadFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncionariosActionPerformed(evt);
            }
        });
        MenuFuncionarios.add(CadFuncionarios);

        ConsFuncionarios.setText("Consultar");
        ConsFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsFuncionariosActionPerformed(evt);
            }
        });
        MenuFuncionarios.add(ConsFuncionarios);
        MenuFuncionarios.add(jSeparator1);

        cadastros.add(MenuFuncionarios);

        jMenu4.setText("Clientes");

        CadClientes.setText("Cadastrar");
        CadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClientesActionPerformed(evt);
            }
        });
        jMenu4.add(CadClientes);

        ConsClientes.setText("Consultar");
        ConsClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsClientesActionPerformed(evt);
            }
        });
        jMenu4.add(ConsClientes);

        cadastros.add(jMenu4);

        jMenu9.setText("Pets");

        jMenuItem4.setText("Cadastrar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem4);

        jMenuItem5.setText("Consultar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem5);

        cadastros.add(jMenu9);

        jMenu5.setText("Produtos");

        CadProdutos.setText("Cadastrar");
        CadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadProdutosActionPerformed(evt);
            }
        });
        jMenu5.add(CadProdutos);

        ConsProdutos.setText("Consultar");
        ConsProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsProdutosActionPerformed(evt);
            }
        });
        jMenu5.add(ConsProdutos);

        cadastros.add(jMenu5);

        jMenu6.setText("Consultas");

        jMenuItem10.setText("Cadastrar");
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("Consultar");
        jMenu6.add(jMenuItem11);

        cadastros.add(jMenu6);

        barraMenu.add(cadastros);

        relatorios.setText("Relatorios");

        vendas.setText("Vendas");
        relatorios.add(vendas);

        barraMenu.add(relatorios);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        menuSair.add(voltar);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        menuSair.add(sair);

        barraMenu.add(menuSair);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 508, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        dispose();
    }//GEN-LAST:event_menuSairActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed

        TelaLogin Login = new TelaLogin ();
        Login.setVisible(true);
        dispose();

    }//GEN-LAST:event_voltarActionPerformed

    private void ButaoDeCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoDeCadClientesActionPerformed
      
        TelaCadClientes cadclientes = new TelaCadClientes();
        cadclientes.setVisible(true);
        
    }//GEN-LAST:event_ButaoDeCadClientesActionPerformed

    private void ButaoAgendarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoAgendarConsActionPerformed
                                                       
        String nomeAnimal = CampoNomedoPet.getText();
        String nomeCliente = CampoNomedoTutor.getText();
        String tipoConsulta = (String) CaixaDeTipodeConsultas.getSelectedItem();

        // Aqui você pode adicionar a lógica para agendar a consulta com os dados fornecidos

        // Por enquanto, apenas exibimos uma mensagem com os dados
        JOptionPane.showMessageDialog(this, "Consulta agendada:\n\n"
                                        + "Nome do Animal: " + nomeAnimal + "\n"
                                        + "Nome do Cliente: " + nomeCliente + "\n"
                                        + "Tipo de Consulta: " + tipoConsulta);
                                                       
    }//GEN-LAST:event_ButaoAgendarConsActionPerformed

    private void CadFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFuncionariosActionPerformed
     
        TelasCadFuncionarios CadFuncionarios = new TelasCadFuncionarios();
        CadFuncionarios.setVisible(true);
                
    }//GEN-LAST:event_CadFuncionariosActionPerformed

    private void ConsFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsFuncionariosActionPerformed
        TelaConsFuncionarios CadFuncionarios = new TelaConsFuncionarios();
        CadFuncionarios.setVisible(true);
    }//GEN-LAST:event_ConsFuncionariosActionPerformed

    private void CadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadProdutosActionPerformed
        
        TelaCadProdutos CadProdutos = new TelaCadProdutos();
        CadProdutos.setVisible(true);
        
    }//GEN-LAST:event_CadProdutosActionPerformed

    private void ConsProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsProdutosActionPerformed
        
        TelaConsProduto ConsProdutos = new TelaConsProduto();
        ConsProdutos.setVisible(true);
        
    }//GEN-LAST:event_ConsProdutosActionPerformed

    private void CadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClientesActionPerformed
        
        TelaCadClientes CadClientes = new TelaCadClientes();
        CadClientes.setVisible(true);
        
    }//GEN-LAST:event_CadClientesActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaCadPet CadPet = new TelaCadPet();
        CadPet.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void ConsClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsClientesActionPerformed
      TelaConsClientes consCli = new TelaConsClientes();
      consCli.setVisible(true);
    }//GEN-LAST:event_ConsClientesActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      TelaConsPets consPets = new TelaConsPets();
      consPets.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButaoAgendarCons;
    private javax.swing.JButton ButaoDeCadClientes;
    private javax.swing.JMenuItem CadClientes;
    private javax.swing.JMenuItem CadFuncionarios;
    private javax.swing.JMenuItem CadProdutos;
    private javax.swing.JComboBox<String> CaixaDeTipodeConsultas;
    private javax.swing.JTextField CampoNomedoPet;
    private javax.swing.JTextField CampoNomedoTutor;
    private javax.swing.JMenuItem ConsClientes;
    private javax.swing.JMenuItem ConsFuncionarios;
    private javax.swing.JMenuItem ConsProdutos;
    private javax.swing.JMenu MenuFuncionarios;
    private javax.swing.JPanel Painel;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu cadastros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuSair;
    private javax.swing.JPanel painel2;
    private javax.swing.JMenu relatorios;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenuItem vendas;
    private javax.swing.JMenuItem voltar;
    // End of variables declaration//GEN-END:variables
    private JPanel painelDoAdm;
}
