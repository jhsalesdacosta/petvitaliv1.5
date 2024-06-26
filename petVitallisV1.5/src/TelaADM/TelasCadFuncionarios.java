package TelaADM;

import ClassesDeCadastro.CadFuncionario;
import TelasLogin.TelaMenu;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

public class TelasCadFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form TelasCadFuncionarios
     */
    public TelasCadFuncionarios() {
        super("Cadastro de Funcionarios");
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
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

        BotaoCadFuncionario = new javax.swing.JButton();
        BotaoConsultarFuncionario = new javax.swing.JButton();
        nomeFuncionario = new javax.swing.JTextField();
        nomefun = new javax.swing.JLabel();
        rgfun = new javax.swing.JLabel();
        rgFuncionario = new javax.swing.JTextField();
        cpffun = new javax.swing.JLabel();
        cpfFuncionario = new javax.swing.JTextField();
        datefun = new javax.swing.JLabel();
        dataNasFuncionario = new javax.swing.JTextField();
        endereçofun = new javax.swing.JLabel();
        enderecoFuncionario = new javax.swing.JTextField();
        numeroresidenciafun = new javax.swing.JLabel();
        residenciaFuncionario = new javax.swing.JTextField();
        pisfun = new javax.swing.JLabel();
        pisFuncionario = new javax.swing.JTextField();
        cepfun = new javax.swing.JLabel();
        cepFuncionario = new javax.swing.JTextField();
        BotaoVoltarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BotaoCadFuncionario.setText("Novo Cadastro");
        BotaoCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadFuncionarioActionPerformed(evt);
            }
        });

        BotaoConsultarFuncionario.setText("Consultar Cadastro");
        BotaoConsultarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConsultarFuncionarioActionPerformed(evt);
            }
        });

        nomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFuncionarioActionPerformed(evt);
            }
        });

        nomefun.setText("Nome");

        rgfun.setText("RG");

        rgFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgFuncionarioActionPerformed(evt);
            }
        });

        cpffun.setText("CPF");

        cpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfFuncionarioActionPerformed(evt);
            }
        });

        datefun.setText("Data de Nascimento");

        dataNasFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNasFuncionarioActionPerformed(evt);
            }
        });

        endereçofun.setText("Endereço");

        enderecoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoFuncionarioActionPerformed(evt);
            }
        });

        numeroresidenciafun.setText("Numero da Residencia");

        residenciaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residenciaFuncionarioActionPerformed(evt);
            }
        });

        pisfun.setText("PIS");

        pisFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pisFuncionarioActionPerformed(evt);
            }
        });

        cepfun.setText("CEP");

        cepFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepFuncionarioActionPerformed(evt);
            }
        });

        BotaoVoltarMenu.setText("Voltar");
        BotaoVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pisfun)
                            .addComponent(datefun))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomefun)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(cpffun, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cpfFuncionario, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pisFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(rgFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rgfun, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dataNasFuncionario, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cepfun)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endereçofun)
                                    .addComponent(numeroresidenciafun)))
                            .addComponent(cepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residenciaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoCadFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoConsultarFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoVoltarMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomefun)
                            .addComponent(endereçofun))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BotaoCadFuncionario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpffun)
                    .addComponent(numeroresidenciafun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residenciaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoConsultarFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rgfun)
                    .addComponent(cepfun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoVoltarMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datefun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataNasFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pisfun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pisFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadFuncionarioActionPerformed
                
        CadFuncionario alo = new CadFuncionario();
        //nome, endereco, cfp, rg, cep, pis, data de nascimento, numero da resdencia
        
        int cpfFun, rgFun, cepFun, pisFun, dataNasFun, numResFun;
               
        if (!nomeFuncionario.getText().isEmpty()) {
            alo.setNome(nomeFuncionario.getText());
            
        }else{
            JOptionPane.showMessageDialog(null, "Campo Nome Inválido");
        }
        
        if (!enderecoFuncionario.getText().isEmpty()) {
            alo.setEndereco(enderecoFuncionario.getText());
        }else{
           JOptionPane.showMessageDialog(null, "Campo Endereço Inválido");
        }
        
        if (!cpfFuncionario.getText().isEmpty()) {
        try {
            cpfFun = (int) Long.parseLong(cpfFuncionario.getText());
            alo.setCpf(cpfFun);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo CPF Inválido");
            //mostra para o usuario aonde está errado
        }
           } else {
        JOptionPane.showMessageDialog(null, "Campo CPF Inválido");
            //mostra para o usuario aonde está errado
          }
        
        if (!rgFuncionario.getText().isEmpty()) {
        try {
            rgFun = (int) Long.parseLong(rgFuncionario.getText());
            alo.setRg(rgFun);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo RG Inválido");
            //mostra para o usuario aonde está errado
        }
           } else {
        JOptionPane.showMessageDialog(null, "Campo RG Inválido");
            //mostra para o usuario aonde está errado
          }
        
        if (!cepFuncionario.getText().isEmpty()) {
        try {
            cepFun = Integer.parseInt(cepFuncionario.getText());
            alo.setCep(cepFun);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo CEP Inválido");
            //mostra para o usuario aonde está errado
        }
           } else {
        JOptionPane.showMessageDialog(null, "Campo CEP Inválido");
            //mostra para o usuario aonde está errado
          }
        
        if (!pisFuncionario.getText().isEmpty()) {
        try {
            pisFun = Integer.parseInt(pisFuncionario.getText());
            alo.setPis(pisFun);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo PIS Inválido");
            //mostra para o usuario aonde está errado
        }
           } else {
        JOptionPane.showMessageDialog(null, "Campo PIS Inválido");
            //mostra para o usuario aonde está errado
          }
        
        if (!dataNasFuncionario.getText().isEmpty()) {
        try {
            dataNasFun = Integer.parseInt(dataNasFuncionario.getText());
            alo.setDataDeNascimento(dataNasFun);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo Data de Nascimento Inválido");
            //mostra para o usuario aonde está errado
        }
           } else {
        JOptionPane.showMessageDialog(null, "Campo Data de Nascimento Inválido");
            //mostra para o usuario aonde está errado
          }
        
        if (!residenciaFuncionario.getText().isEmpty()) {
        try {
            numResFun = Integer.parseInt(residenciaFuncionario.getText());
            alo.setNumeroDaResidencia(numResFun);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo Número de Residencia Inválido");
            //mostra para o usuario aonde está errado
        }
           } else {
        JOptionPane.showMessageDialog(null, "Campo Número de Residencia Inválido");
            //mostra para o usuario aonde está errado
          }
        
        
        //Isso aqui em baixo é só para poder fazer aquele negocio de só aceitar número funcionar certo
        
        String RgFun = rgFuncionario.getText();
        String CepFun = cepFuncionario.getText();
        String PisFun = pisFuncionario.getText();
        String DataNasFun = dataNasFuncionario.getText();
        String NumResFun = residenciaFuncionario.getText();
        String CpfFun = cpfFuncionario.getText();
        
        //Define uma expressão regular para verificar se o texto contém apenas números
        String regexNumerico = "\\d+";  
         
        // Cria um padrão regex 
        //Pattern é uma classe em Java que compila uma expressão regular em um objeto de padrão.
        //Uma expressão regular é uma sequência de caracteres que define um padrão de busca.
        Pattern pattern = Pattern.compile(regexNumerico);
         
        // Cria um Matcher para aplicar o padrão ao texto do campo
        //Matcher é uma classe que realiza a correspondência de padrões em uma sequência de caracteres. 
        //Ela é usada para aplicar um padrão regex a uma determinada string e encontrar todas as ocorrências desse padrão na string.
         Matcher matcherCpfFun = pattern.matcher(CpfFun);
         Matcher matcherRgFun = pattern.matcher(RgFun);
         Matcher matcherPisFun = pattern.matcher(PisFun);
         Matcher matcherDataNasFun = pattern.matcher(DataNasFun);
         Matcher matcherCepFun = pattern.matcher(CepFun);
         Matcher matcherNumResFun = pattern.matcher(NumResFun);
        
        //Aqui basicamente é só para confirmar se todos os dados foram preenchidos
        //Se tiverem sido preechidos corretamente ai finaliza o cadrastro
        
        if (!cpfFuncionario.getText().isEmpty()
            && !rgFuncionario.getText().isEmpty()
            && !pisFuncionario.getText().isEmpty()
            && !cepFuncionario.getText().isEmpty()
            && !residenciaFuncionario.getText().isEmpty()
            && !dataNasFuncionario.getText().isEmpty()    
            && matcherCpfFun.matches()
            && matcherNumResFun.matches()
            && matcherRgFun.matches()
            && matcherCepFun.matches()
            && matcherDataNasFun.matches()
            && matcherPisFun.matches())  { 
            alo.IncluirFun();
        }else{
             JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente");   
        }
        
        // só copiei oq o kaua fez kk
        int cpfCli, rgCli, dataNasCli, pisCli, numResidenciaCli, cepCli;
        
        CadFuncionario cadfun = new CadFuncionario();
        
        cadfun.setNome(nomeFuncionario.getText());
        cadfun.setCpf(cpfCli = (int) Long.parseLong (cpfFuncionario.getText()));
        cadfun.setRg(rgCli = (int)Long.parseLong(rgFuncionario.getText()));
        cadfun.setDataDeNascimento(dataNasCli = (int) Long.parseLong (dataNasFuncionario.getText()));
        cadfun.setPis(pisCli = (int) Long.parseLong (pisFuncionario.getText()));
        cadfun.setEndereco(enderecoFuncionario.getText());
        cadfun.setNumeroDaResidencia(numResidenciaCli = (int) Long.parseLong(residenciaFuncionario.getText()));
        cadfun.setCep(cepCli = (int) Long.parseLong(cepFuncionario.getText()));
        
        cadfun.inserir();
    }//GEN-LAST:event_BotaoCadFuncionarioActionPerformed

    private void dataNasFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNasFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNasFuncionarioActionPerformed

    private void BotaoVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarMenuActionPerformed
        dispose(); 
    }//GEN-LAST:event_BotaoVoltarMenuActionPerformed

    private void nomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncionarioActionPerformed

    private void BotaoConsultarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConsultarFuncionarioActionPerformed
        TelaConsFuncionarios CadProd = new TelaConsFuncionarios ();
        CadProd.setVisible(true);
    }//GEN-LAST:event_BotaoConsultarFuncionarioActionPerformed

    private void cepFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepFuncionarioActionPerformed

    private void cpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfFuncionarioActionPerformed

    private void rgFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgFuncionarioActionPerformed

    private void pisFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pisFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pisFuncionarioActionPerformed

    private void enderecoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoFuncionarioActionPerformed

    private void residenciaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residenciaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_residenciaFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelasCadFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelasCadFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelasCadFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelasCadFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelasCadFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadFuncionario;
    private javax.swing.JButton BotaoConsultarFuncionario;
    private javax.swing.JButton BotaoVoltarMenu;
    private javax.swing.JTextField cepFuncionario;
    private javax.swing.JLabel cepfun;
    private javax.swing.JTextField cpfFuncionario;
    private javax.swing.JLabel cpffun;
    private javax.swing.JTextField dataNasFuncionario;
    private javax.swing.JLabel datefun;
    private javax.swing.JTextField enderecoFuncionario;
    private javax.swing.JLabel endereçofun;
    private javax.swing.JTextField nomeFuncionario;
    private javax.swing.JLabel nomefun;
    private javax.swing.JLabel numeroresidenciafun;
    private javax.swing.JTextField pisFuncionario;
    private javax.swing.JLabel pisfun;
    private javax.swing.JTextField residenciaFuncionario;
    private javax.swing.JTextField rgFuncionario;
    private javax.swing.JLabel rgfun;
    // End of variables declaration//GEN-END:variables

    private static class Cadfuncionario {

        public Cadfuncionario() {
        }
    }
}
