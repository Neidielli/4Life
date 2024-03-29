/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas.Agenda;

import DAO.AgendaDAO;
import DAO.PacienteDAO;
import DAO.FuncionarioDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import model.Agenda;
import model.Funcionario;
import model.Paciente;

/**
 *
 * @author neidi
 */
public class TelaNovoAgendamento extends javax.swing.JFrame {

    /**
     * Creates new form NovoAgendamento
     */
    public TelaNovoAgendamento() {
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

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        campoIdConsulta = new javax.swing.JTextField();
        campoProcedimento = new java.awt.TextField();
        boxConsulta = new javax.swing.JComboBox<>();
        boxProfissional = new javax.swing.JComboBox();
        boxPaciente = new javax.swing.JComboBox();
        btnAgendar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        campoData = new com.toedter.calendar.JDateChooser();
        campoHora = new javax.swing.JComboBox<>();
        agendamentoCons = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agendamento de Consulta");

        jPanel1.setPreferredSize(new java.awt.Dimension(627, 730));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setText("Código:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setText("Procedimento:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("Profissional:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setText("Paciente:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("Data/Hora:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel14.setText("Tipo de consulta:");

        campoIdConsulta.setEditable(false);
        campoIdConsulta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        campoIdConsulta.setSelectionEnd(-1);
        campoIdConsulta.setSelectionStart(-1);
        campoIdConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdConsultaActionPerformed(evt);
            }
        });

        campoProcedimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        campoProcedimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoProcedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoProcedimentoActionPerformed(evt);
            }
        });

        boxConsulta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boxConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primeira consulta", "Retorno" }));

        boxProfissional.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        boxProfissional.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                boxProfissionalAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        boxProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxProfissionalActionPerformed(evt);
            }
        });

        boxPaciente.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        boxPaciente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                boxPacienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        boxPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPacienteActionPerformed(evt);
            }
        });

        btnAgendar.setBackground(new java.awt.Color(0, 102, 52));
        btnAgendar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(211, 0, 0));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Cancelar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(0, 51, 51));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        campoData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoData.setMinimumSize(new java.awt.Dimension(80, 30));
        campoData.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                campoDataPropertyChange(evt);
            }
        });

        campoHora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30" }));
        campoHora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        agendamentoCons.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        agendamentoCons.setForeground(new java.awt.Color(51, 51, 51));
        agendamentoCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/calendar.png"))); // NOI18N
        agendamentoCons.setText("AGENDAMENTO DE CONSULTA");
        agendamentoCons.setIconTextGap(5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agendamentoCons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxConsulta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoIdConsulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoProcedimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boxProfissional, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boxPaciente, javax.swing.GroupLayout.Alignment.LEADING, 0, 405, Short.MAX_VALUE)))))
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agendamentoCons, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoProcedimento, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boxPaciente)
                        .addGap(1, 1, 1)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(703, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoIdConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdConsultaActionPerformed

    private void campoProcedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoProcedimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoProcedimentoActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        Agenda agenda = new Agenda();
        Paciente paciente = new Paciente();
        Funcionario funcionario = new Funcionario();
        
        agenda.setProcedimento(campoProcedimento.getText());
        // Receber os dados dos combosBox(obj do tipo paciente e do tipo funcionario)
        paciente = (Paciente) boxPaciente.getSelectedItem();
        agenda.setPaciente(paciente);
        funcionario = (Funcionario) boxProfissional.getSelectedItem();
        agenda.setFuncionario(funcionario);
        agenda.setData_hora(campoData.getDate()); // DATE
        agenda.setTipo_consulta(String.valueOf(boxConsulta.getSelectedItem()));
        agenda.setHora(String.valueOf(campoHora.getSelectedItem()));
        
        AgendaDAO dao = new AgendaDAO();
        dao.AgendarConsulta(agenda);
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        campoIdConsulta.setText("");
        campoProcedimento.setText("");
        campoData.setDate(null);
        campoHora.setSelectedItem("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void boxPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxPacienteActionPerformed

    private void boxProfissionalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_boxProfissionalAncestorAdded
        FuncionarioDAO dao = new FuncionarioDAO();
        List<Funcionario> lista = dao.listaFunc(); // metodo lista da classe DAO, e importa a classe model
        
        // primeiro remove todos os dados da combobox para n duplicados os dados
        boxProfissional.removeAll();
        
        //Para cada item da lista, monta um obj do tipo Funcionario e add na comboBox 
        for(Funcionario f:lista) {
            boxProfissional.addItem(f);
        } 
    }//GEN-LAST:event_boxProfissionalAncestorAdded

    private void boxPacienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_boxPacienteAncestorAdded
        PacienteDAO dao = new PacienteDAO();
        List<Paciente> lista = dao.listaPac();
        
        // primeiro remove todos os dados da combobox para n duplicados os dados
        boxPaciente.removeAll();
        
        //Para cada item da lista, monta um obj do tipo Funcionario e add na comboBox 
        for(Paciente p:lista) {
            boxPaciente.addItem(p);
        }
    }//GEN-LAST:event_boxPacienteAncestorAdded

    private void campoDataPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_campoDataPropertyChange
        if(campoData.getDate() != null)   ;     // TODO add your handling code here:
    }//GEN-LAST:event_campoDataPropertyChange

    private void boxProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxProfissionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxProfissionalActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovoAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agendamentoCons;
    private javax.swing.JComboBox<String> boxConsulta;
    private javax.swing.JComboBox boxPaciente;
    private javax.swing.JComboBox boxProfissional;
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    public static com.toedter.calendar.JDateChooser campoData;
    public static javax.swing.JComboBox<String> campoHora;
    private javax.swing.JTextField campoIdConsulta;
    private java.awt.TextField campoProcedimento;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
