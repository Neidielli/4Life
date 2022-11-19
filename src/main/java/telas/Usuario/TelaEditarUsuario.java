/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas.Usuario;

import DAO.UsuarioDAO;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author tayna
 */
public class TelaEditarUsuario extends javax.swing.JFrame {
    
    public static void recebeId(Usuario user){
        CodUser.setText(String.valueOf(user.getId()));
        CodUser.requestFocus();
    }

    /**
     * Creates new form TelaEditarUsuario
     */
    public TelaEditarUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroUser = new javax.swing.JLabel();
        ButtonSairUser = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmailUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSenhaUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCPFuser = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefoneUser = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        CodUser = new javax.swing.JTextField();
        buttonSalvarEdtUser = new javax.swing.JButton();
        buttonCancelarEdtUser = new javax.swing.JButton();
        buttonPesquisarUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuário - Tela de Edição");

        cadastroUser.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        cadastroUser.setForeground(new java.awt.Color(51, 51, 51));
        cadastroUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/user_1.png"))); // NOI18N
        cadastroUser.setText("EDITAR USUÁRIO");
        cadastroUser.setIconTextGap(5);

        ButtonSairUser.setBackground(new java.awt.Color(0, 51, 51));
        ButtonSairUser.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ButtonSairUser.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSairUser.setText("Sair");
        ButtonSairUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairUserActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Email:");

        jLabel3.setText("Senha:");

        txtSenhaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaUserActionPerformed(evt);
            }
        });

        jLabel4.setText("CPF:");

        try {
            txtCPFuser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Telefone:");

        try {
            txtTelefoneUser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Código:");

        buttonSalvarEdtUser.setBackground(new java.awt.Color(0, 102, 52));
        buttonSalvarEdtUser.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        buttonSalvarEdtUser.setForeground(new java.awt.Color(255, 255, 255));
        buttonSalvarEdtUser.setText("Salvar");
        buttonSalvarEdtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarEdtUserActionPerformed(evt);
            }
        });

        buttonCancelarEdtUser.setBackground(new java.awt.Color(211, 0, 0));
        buttonCancelarEdtUser.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        buttonCancelarEdtUser.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancelarEdtUser.setText("Cancelar");
        buttonCancelarEdtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarEdtUserActionPerformed(evt);
            }
        });

        buttonPesquisarUser.setBackground(new java.awt.Color(0, 102, 52));
        buttonPesquisarUser.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        buttonPesquisarUser.setForeground(new java.awt.Color(255, 255, 255));
        buttonPesquisarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/search.png"))); // NOI18N
        buttonPesquisarUser.setText("Pesquisar");
        buttonPesquisarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CodUser, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonPesquisarUser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmailUser)
                            .addComponent(txtNomeUser)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCPFuser, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(buttonSalvarEdtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonCancelarEdtUser))
                                    .addComponent(txtTelefoneUser)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPesquisarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFuser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelarEdtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalvarEdtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastroUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonSairUser, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroUser, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSairUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(686, 441));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSairUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairUserActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonSairUserActionPerformed

    private void buttonCancelarEdtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarEdtUserActionPerformed
        CodUser.setText("");
        txtNomeUser.setText("");
        txtCPFuser.setText("");
        txtEmailUser.setText("");
        txtTelefoneUser.setText("");
        txtSenhaUser.setText("");
    }//GEN-LAST:event_buttonCancelarEdtUserActionPerformed

    private void buttonSalvarEdtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarEdtUserActionPerformed
        try {
            Usuario usuario = new Usuario();

            usuario.setNome(txtNomeUser.getText());
            usuario.setCpf(txtCPFuser.getText());
            usuario.setEmail(txtEmailUser.getText());
            usuario.setTelefone(txtTelefoneUser.getText());
            usuario.setSenha(txtSenhaUser.getText());
            usuario.setId(Integer.parseInt(CodUser.getText()));
            
            UsuarioDAO udao = new UsuarioDAO();
            udao.editar(usuario);
            
            JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");

            // limpa os campos novamente
            CodUser.setText("");
            txtNomeUser.setText("");
            txtCPFuser.setText("");
            txtEmailUser.setText("");
            txtTelefoneUser.setText("");
            txtSenhaUser.setText("");

        }
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!" + erro);
        }
    }//GEN-LAST:event_buttonSalvarEdtUserActionPerformed

    private void txtSenhaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaUserActionPerformed

    private void buttonPesquisarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarUserActionPerformed
        Usuario usuario = new Usuario();
        
        if(CodUser.getText().equals("")){
            TelaBuscarUsuario telaBusca = new TelaBuscarUsuario();
            telaBusca.setVisible(true);
        }
        else{
            usuario.setId(Integer.parseInt(CodUser.getText()));
            UsuarioDAO udao = new UsuarioDAO();
            
            try{
                if(udao.pesquisaUser(usuario)){
                    if(usuario != null){
                        txtNomeUser.setText(usuario.getNome().trim());
                        txtCPFuser.setText(usuario.getCpf().trim());
                        txtEmailUser.setText(usuario.getEmail().trim());
                        txtTelefoneUser.setText(usuario.getTelefone().trim());
                        txtSenhaUser.setText(usuario.getSenha().trim());
                    }
                }
            }
            catch(Exception exc){
                JOptionPane.showMessageDialog(null, "Erro ao pesquisar usuário!" +exc);
            }
        }
    }//GEN-LAST:event_buttonPesquisarUserActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSairUser;
    static javax.swing.JTextField CodUser;
    private javax.swing.JButton buttonCancelarEdtUser;
    private javax.swing.JButton buttonPesquisarUser;
    private javax.swing.JButton buttonSalvarEdtUser;
    private javax.swing.JLabel cadastroUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtCPFuser;
    private javax.swing.JTextField txtEmailUser;
    private javax.swing.JTextField txtNomeUser;
    private javax.swing.JTextField txtSenhaUser;
    private javax.swing.JFormattedTextField txtTelefoneUser;
    // End of variables declaration//GEN-END:variables
}
