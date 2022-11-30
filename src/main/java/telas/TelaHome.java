/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import telas.Agenda.TelaSelecionarMedico;
import telas.Funcionario.TelaBuscarFuncionario;
import telas.Funcionario.TelaCadastrarFuncionario;
import telas.Funcionario.TelaEditarFuncionario;
import telas.Paciente.TelaBuscarPaciente;
import telas.Paciente.TelaCadastrarPaciente;
import telas.Paciente.TelaEditarPaciente;
import telas.Prontuario.TelaNovoProntuario;
import telas.Prontuario.TelaSelecionarPaciente;
import telas.Usuario.TelaBuscarUsuario;
import telas.Usuario.TelaCadastrarUsuario;
import telas.Usuario.TelaEditarUsuario;

/**
 *
 * @author neidi
 */
public class TelaHome extends javax.swing.JFrame {

    /**
     * Creates new form HomeGUI
     */
    public TelaHome() {
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
        ItemMenuBuscarUsuario = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        ItemMenuCadastrarFuncionario = new javax.swing.JMenuItem();
        ItemMenuEditarFuncionario = new javax.swing.JMenuItem();
        ItemMenuBuscarFuncionario = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        ItemMenuCadastrarPaciente = new javax.swing.JMenuItem();
        ItemMenuEditarPaciente = new javax.swing.JMenuItem();
        ItemMenuBuscarPaciente = new javax.swing.JMenuItem();
        ItemMenuRegistrarProntuario = new javax.swing.JMenuItem();
        ItemMenuVisualizarProntuario = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        ItemMenuAgendarConsulta = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenu();
        ItemMenuSairFechar = new javax.swing.JMenuItem();
        ItemMenuSairEntrar = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setName("Home"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setName("Home"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/home.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(528, 528, 528)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1450, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(405, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365))
        );

        jMenuBar2.setPreferredSize(new java.awt.Dimension(793, 80));

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/user.png"))); // NOI18N
        jMenu4.setText("Usuários");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        ItemMenuCadastrarUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/new24.png"))); // NOI18N
        ItemMenuCadastrarUsuario.setText("Cadastrar Usuario");
        ItemMenuCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuCadastrarUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(ItemMenuCadastrarUsuario);

        ItemMenuEditarUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/editar24.png"))); // NOI18N
        ItemMenuEditarUsuario.setText("Editar Usuario");
        ItemMenuEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuEditarUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(ItemMenuEditarUsuario);

        ItemMenuBuscarUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/list.png"))); // NOI18N
        ItemMenuBuscarUsuario.setText("Buscar Usuario");
        ItemMenuBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuBuscarUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(ItemMenuBuscarUsuario);

        jMenuBar2.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/doctor.png"))); // NOI18N
        jMenu5.setText("Funcionários");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        ItemMenuCadastrarFuncionario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/new24.png"))); // NOI18N
        ItemMenuCadastrarFuncionario.setText("Cadastrar Funcionário");
        ItemMenuCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMenu5.add(ItemMenuCadastrarFuncionario);

        ItemMenuEditarFuncionario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuEditarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/editar24.png"))); // NOI18N
        ItemMenuEditarFuncionario.setText("Editar Funcionário");
        ItemMenuEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuEditarFuncionarioActionPerformed(evt);
            }
        });
        jMenu5.add(ItemMenuEditarFuncionario);

        ItemMenuBuscarFuncionario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuBuscarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/list.png"))); // NOI18N
        ItemMenuBuscarFuncionario.setText("Buscar Funcionário");
        ItemMenuBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuBuscarFuncionarioActionPerformed(evt);
            }
        });
        jMenu5.add(ItemMenuBuscarFuncionario);

        jMenuBar2.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/user_1.png"))); // NOI18N
        jMenu6.setText("Paciente");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        ItemMenuCadastrarPaciente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuCadastrarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/new24.png"))); // NOI18N
        ItemMenuCadastrarPaciente.setText("Cadastrar Paciente");
        ItemMenuCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuCadastrarPacienteActionPerformed(evt);
            }
        });
        jMenu6.add(ItemMenuCadastrarPaciente);

        ItemMenuEditarPaciente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuEditarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/editar24.png"))); // NOI18N
        ItemMenuEditarPaciente.setText("Editar Paciente ");
        ItemMenuEditarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuEditarPacienteActionPerformed(evt);
            }
        });
        jMenu6.add(ItemMenuEditarPaciente);

        ItemMenuBuscarPaciente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuBuscarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/list.png"))); // NOI18N
        ItemMenuBuscarPaciente.setText("Buscar Paciente");
        ItemMenuBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuBuscarPacienteActionPerformed(evt);
            }
        });
        jMenu6.add(ItemMenuBuscarPaciente);

        ItemMenuRegistrarProntuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuRegistrarProntuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/new24.png"))); // NOI18N
        ItemMenuRegistrarProntuario.setText("Registrar Prontuário");
        ItemMenuRegistrarProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuRegistrarProntuarioActionPerformed(evt);
            }
        });
        jMenu6.add(ItemMenuRegistrarProntuario);

        ItemMenuVisualizarProntuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuVisualizarProntuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/check-form.png"))); // NOI18N
        ItemMenuVisualizarProntuario.setText("Visualizar Prontuário");
        ItemMenuVisualizarProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuVisualizarProntuarioActionPerformed(evt);
            }
        });
        jMenu6.add(ItemMenuVisualizarProntuario);

        jMenuBar2.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/calendar.png"))); // NOI18N
        jMenu7.setText("Agenda");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        ItemMenuAgendarConsulta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuAgendarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/calendar.png"))); // NOI18N
        ItemMenuAgendarConsulta.setText("Agendar Consultas");
        ItemMenuAgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuAgendarConsultaActionPerformed(evt);
            }
        });
        jMenu7.add(ItemMenuAgendarConsulta);

        jMenuBar2.add(jMenu7);

        MenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/logout.png"))); // NOI18N
        MenuSair.setText("Sair");
        MenuSair.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        ItemMenuSairFechar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuSairFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/sair.png"))); // NOI18N
        ItemMenuSairFechar.setText("Sair e Fechar sistema");
        ItemMenuSairFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuSairFecharActionPerformed(evt);
            }
        });
        MenuSair.add(ItemMenuSairFechar);

        ItemMenuSairEntrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ItemMenuSairEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/login.png"))); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 2674, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Home");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemMenuBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuBuscarUsuarioActionPerformed
         TelaBuscarUsuario telabusca = new TelaBuscarUsuario();
         telabusca.setVisible(true);
                
    }//GEN-LAST:event_ItemMenuBuscarUsuarioActionPerformed

    private void ItemMenuCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuCadastrarPacienteActionPerformed
        TelaCadastrarPaciente telacadastra = new TelaCadastrarPaciente();
        telacadastra.setVisible(true);
    }//GEN-LAST:event_ItemMenuCadastrarPacienteActionPerformed

    private void ItemMenuBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuBuscarPacienteActionPerformed
        TelaBuscarPaciente telabusca = new TelaBuscarPaciente();
        telabusca.setVisible(true);
    }//GEN-LAST:event_ItemMenuBuscarPacienteActionPerformed



    private void ItemMenuCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuCadastrarUsuarioActionPerformed
          TelaCadastrarUsuario telacadastra = new TelaCadastrarUsuario();
          telacadastra.setVisible(true);
                        // TODO add your handling code here:
    }//GEN-LAST:event_ItemMenuCadastrarUsuarioActionPerformed

    private void ItemMenuEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuEditarUsuarioActionPerformed
         TelaEditarUsuario telaedita = new TelaEditarUsuario();
         telaedita.setVisible(true);
                
    }//GEN-LAST:event_ItemMenuEditarUsuarioActionPerformed

    private void ItemMenuSairFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuSairFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ItemMenuSairFecharActionPerformed

    private void ItemMenuSairEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuSairEntrarActionPerformed
        this.dispose();
        
        TelaLogin telalogin = new TelaLogin();
        telalogin.setVisible(true);
    }//GEN-LAST:event_ItemMenuSairEntrarActionPerformed

    private void ItemMenuCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuCadastrarFuncionarioActionPerformed
        TelaCadastrarFuncionario telacadastra = new TelaCadastrarFuncionario();
        telacadastra.setVisible(true);
    }//GEN-LAST:event_ItemMenuCadastrarFuncionarioActionPerformed

    private void ItemMenuEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuEditarFuncionarioActionPerformed
        TelaEditarFuncionario telaedita = new TelaEditarFuncionario();
        telaedita.setVisible(true);
    }//GEN-LAST:event_ItemMenuEditarFuncionarioActionPerformed

    private void ItemMenuBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuBuscarFuncionarioActionPerformed
        TelaBuscarFuncionario telabusca = new TelaBuscarFuncionario();
        telabusca.setVisible(true);
    }//GEN-LAST:event_ItemMenuBuscarFuncionarioActionPerformed

    private void ItemMenuAgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuAgendarConsultaActionPerformed
        TelaSelecionarMedico selecionarMedico = new TelaSelecionarMedico();
        selecionarMedico.setVisible(true);
    }//GEN-LAST:event_ItemMenuAgendarConsultaActionPerformed

    private void ItemMenuEditarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuEditarPacienteActionPerformed
        TelaEditarPaciente telaedita = new TelaEditarPaciente();
        telaedita.setVisible(true);
    }//GEN-LAST:event_ItemMenuEditarPacienteActionPerformed

    private void ItemMenuRegistrarProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuRegistrarProntuarioActionPerformed
        TelaNovoProntuario telaprontuario = new TelaNovoProntuario();
        telaprontuario.setVisible(true);
    }//GEN-LAST:event_ItemMenuRegistrarProntuarioActionPerformed

    private void ItemMenuVisualizarProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuVisualizarProntuarioActionPerformed
        TelaSelecionarPaciente selecionarPaciente = new TelaSelecionarPaciente();
        selecionarPaciente.setVisible(true);
    }//GEN-LAST:event_ItemMenuVisualizarProntuarioActionPerformed
     private void ItemMenuVisualizarProntPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                               
        // TODO add your handling code here:
    } 

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
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemMenuAgendarConsulta;
    private javax.swing.JMenuItem ItemMenuBuscarFuncionario;
    private javax.swing.JMenuItem ItemMenuBuscarPaciente;
    private javax.swing.JMenuItem ItemMenuBuscarUsuario;
    private javax.swing.JMenuItem ItemMenuCadastrarFuncionario;
    private javax.swing.JMenuItem ItemMenuCadastrarPaciente;
    private javax.swing.JMenuItem ItemMenuCadastrarUsuario;
    private javax.swing.JMenuItem ItemMenuEditarFuncionario;
    private javax.swing.JMenuItem ItemMenuEditarPaciente;
    private javax.swing.JMenuItem ItemMenuEditarUsuario;
    private javax.swing.JMenuItem ItemMenuRegistrarProntuario;
    private javax.swing.JMenuItem ItemMenuSairEntrar;
    private javax.swing.JMenuItem ItemMenuSairFechar;
    private javax.swing.JMenuItem ItemMenuVisualizarProntuario;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
