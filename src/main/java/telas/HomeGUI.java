/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author neidi
 */
public class HomeGUI extends javax.swing.JFrame {

    /**
     * Creates new form HomeGUI
     */
    public HomeGUI() {
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

        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        ItemMenuCadastrarUsuario = new javax.swing.JMenuItem();
        ItemMenuEditarUsuario = new javax.swing.JMenuItem();
        ItemMenuExcluirUsuario = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        ItemMenuCadastrarFuncionario = new javax.swing.JMenuItem();
        ItemMenuEditarFuncionario = new javax.swing.JMenuItem();
        ItemFuncionarioExcluirFuncionario = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenu();
        ItemMenuSairFechar = new javax.swing.JMenuItem();
        ItemMenuSairEntrar = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Home"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1920, 1030));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setName("Home"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\home.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(599, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(512, 512, 512))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        jMenuBar2.setPreferredSize(new java.awt.Dimension(793, 80));

        jMenu4.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\user.png")); // NOI18N
        jMenu4.setText("Usuários");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        ItemMenuCadastrarUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuCadastrarUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\new24.png")); // NOI18N
        ItemMenuCadastrarUsuario.setText("Cadastrar Usuario");
        ItemMenuCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuCadastrarUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(ItemMenuCadastrarUsuario);

        ItemMenuEditarUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuEditarUsuario.setText("Editar Usuario");
        ItemMenuEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuEditarUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(ItemMenuEditarUsuario);

        ItemMenuExcluirUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuExcluirUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\sair.png")); // NOI18N
        ItemMenuExcluirUsuario.setText("Excluir Usuario");
        ItemMenuExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuExcluirUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(ItemMenuExcluirUsuario);

        jMenuBar2.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\team.png")); // NOI18N
        jMenu5.setText("Funcionários");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        ItemMenuCadastrarFuncionario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuCadastrarFuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\new24.png")); // NOI18N
        ItemMenuCadastrarFuncionario.setText("Cadastrar Funcionário");
        ItemMenuCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMenu5.add(ItemMenuCadastrarFuncionario);

        ItemMenuEditarFuncionario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuEditarFuncionario.setText("Editar Funcionário");
        ItemMenuEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuEditarFuncionarioActionPerformed(evt);
            }
        });
        jMenu5.add(ItemMenuEditarFuncionario);

        ItemFuncionarioExcluirFuncionario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemFuncionarioExcluirFuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\sair.png")); // NOI18N
        ItemFuncionarioExcluirFuncionario.setText("Excluir Funcionário");
        ItemFuncionarioExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemFuncionarioExcluirFuncionarioActionPerformed(evt);
            }
        });
        jMenu5.add(ItemFuncionarioExcluirFuncionario);

        jMenuBar2.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\user_1.png")); // NOI18N
        jMenu6.setText("Paciente");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\new24.png")); // NOI18N
        jMenuItem7.setText("Cadastrar Paciente");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem8.setText("Editar Paciente ");
        jMenu6.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\sair.png")); // NOI18N
        jMenuItem9.setText("Excluir Paciente ");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\new24.png")); // NOI18N
        jMenuItem13.setText("Registrar Prontuário");
        jMenu6.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\check-form.png")); // NOI18N
        jMenuItem14.setText("Visualizar Prontuário");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuBar2.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\calendar.png")); // NOI18N
        jMenu7.setText("Agenda");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItem10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\calendar.png")); // NOI18N
        jMenuItem10.setText("Visualizar Agenda");
        jMenu7.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\new24.png")); // NOI18N
        jMenuItem11.setText("Agendar Consultas");
        jMenu7.add(jMenuItem11);

        jMenuBar2.add(jMenu7);

        MenuSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\logout.png")); // NOI18N
        MenuSair.setText("Sair");
        MenuSair.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        ItemMenuSairFechar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuSairFechar.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\sair.png")); // NOI18N
        ItemMenuSairFechar.setText("Sair e Fechar sistema");
        ItemMenuSairFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuSairFecharActionPerformed(evt);
            }
        });
        MenuSair.add(ItemMenuSairFechar);

        ItemMenuSairEntrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuSairEntrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\neidi\\OneDrive\\Área de Trabalho\\UTFPR\\Oficina 2\\4Life\\imagens\\icons\\login.png")); // NOI18N
        ItemMenuSairEntrar.setText("Sair e Entrar com outro Usuario");
        ItemMenuSairEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuSairEntrarActionPerformed(evt);
            }
        });
        MenuSair.add(ItemMenuSairEntrar);

        jMenuBar2.add(MenuSair);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1926, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Home");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemMenuExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuExcluirUsuarioActionPerformed
         UsuarioGUI telausuario = new UsuarioGUI();
         telausuario.setVisible(true);
                
    }//GEN-LAST:event_ItemMenuExcluirUsuarioActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void ItemMenuCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuCadastrarUsuarioActionPerformed
          UsuarioGUI telausuario = new UsuarioGUI();
          telausuario.setVisible(true);
                        // TODO add your handling code here:
    }//GEN-LAST:event_ItemMenuCadastrarUsuarioActionPerformed

    private void ItemMenuEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuEditarUsuarioActionPerformed
         UsuarioGUI telausuario = new UsuarioGUI();
         telausuario.setVisible(true);
                
    }//GEN-LAST:event_ItemMenuEditarUsuarioActionPerformed

    private void ItemMenuSairFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuSairFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ItemMenuSairFecharActionPerformed

    private void ItemMenuSairEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuSairEntrarActionPerformed
        this.dispose();
        
        LoginGUI telalogin = new LoginGUI();
        telalogin.setVisible(true);
    }//GEN-LAST:event_ItemMenuSairEntrarActionPerformed

    private void ItemMenuCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuCadastrarFuncionarioActionPerformed
        tela_funcionario telafuncionario = new tela_funcionario();
        telafuncionario.setVisible(true);
    }//GEN-LAST:event_ItemMenuCadastrarFuncionarioActionPerformed

    private void ItemMenuEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuEditarFuncionarioActionPerformed
        tela_funcionario telafuncionario = new tela_funcionario();
        telafuncionario.setVisible(true);
    }//GEN-LAST:event_ItemMenuEditarFuncionarioActionPerformed

    private void ItemFuncionarioExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemFuncionarioExcluirFuncionarioActionPerformed
        tela_funcionario telafuncionario = new tela_funcionario();
        telafuncionario.setVisible(true);
    }//GEN-LAST:event_ItemFuncionarioExcluirFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemFuncionarioExcluirFuncionario;
    private javax.swing.JMenuItem ItemMenuCadastrarFuncionario;
    private javax.swing.JMenuItem ItemMenuCadastrarUsuario;
    private javax.swing.JMenuItem ItemMenuEditarFuncionario;
    private javax.swing.JMenuItem ItemMenuEditarUsuario;
    private javax.swing.JMenuItem ItemMenuExcluirUsuario;
    private javax.swing.JMenuItem ItemMenuSairEntrar;
    private javax.swing.JMenuItem ItemMenuSairFechar;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
