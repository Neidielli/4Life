/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package telas.Agenda;

import DAO.AgendaDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Agenda;
import model.Funcionario;

/**
 *
 * @author neidi
 */
public class TelaAgenda extends javax.swing.JFrame {

    public static void recebeNomeMedico(Funcionario func) {
       textNomeMedico.setText(String.valueOf((func)));
       textNomeMedico.requestFocus();
    }
    
    public void Listar(){
        try {
            AgendaDAO dao = new AgendaDAO();
            
            List<Agenda> listaconsultas = dao.listarConsultas(); // chama da classe agendadao // retorna uma lista de usuarios
            // pega a lista e coloca na tabela
            DefaultTableModel model = (DefaultTableModel)tabelaConsultas.getModel();
            model.setNumRows(0); // garante que o obj model n tenha nada
            
            for(Agenda a : listaconsultas) { // cria um obj do tipo u, e percorre a lista
                model.addRow(new Object[]{
                    a.getId_Consulta(),
                    a.getProcedimento(),
                    a.getPaciente().getNome(),
                    a.getFuncionario().getNome(),
                    a.getData_hora(),
                    a.getTipo_consulta(),
                    a.getHora()
                });
            }
        } catch (Exception e) {
        
        }
    }
    /** Creates new form AgendaGUI */
    public TelaAgenda() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        calendarConsulta = new com.toedter.calendar.JCalendar();
        btnAgendar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        textNomeMedico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsultas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(974, 990));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        calendarConsulta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calendarConsulta.setTodayButtonVisible(true);
        calendarConsulta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarConsultaPropertyChange(evt);
            }
        });

        jLayeredPane2.setLayer(calendarConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLayeredPane1.add(jLayeredPane2);
        jLayeredPane2.setBounds(470, 20, 490, 230);

        btnAgendar.setBackground(new java.awt.Color(76, 159, 56));
        btnAgendar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAgendar.setText("Agendar Consulta");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnAgendar);
        btnAgendar.setBounds(210, 190, 240, 60);

        btnVoltar.setBackground(new java.awt.Color(204, 204, 204));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnVoltar);
        btnVoltar.setBounds(50, 190, 130, 60);

        textNomeMedico.setEditable(false);
        textNomeMedico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textNomeMedico.setOpaque(true);
        textNomeMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeMedicoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(textNomeMedico);
        textNomeMedico.setBounds(210, 40, 240, 30);

        tabelaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Procedimento", "Paciente", "Profissional", "Data", "Tipo de Consulta", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaConsultas.setRowHeight(40);
        jScrollPane1.setViewportView(tabelaConsultas);

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 360, 920, 550);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Profissional:");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(50, 40, 130, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose(); // fecha tela atual 
        
        TelaSelecionarMedico telaSelecao = new TelaSelecionarMedico();
        telaSelecao.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void textNomeMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeMedicoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Listar();
    }//GEN-LAST:event_formWindowActivated

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        TelaNovoAgendamento novoAgendamentoGUI = new TelaNovoAgendamento();
        novoAgendamentoGUI.setVisible(true);
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void calendarConsultaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarConsultaPropertyChange
        Listar();
    }//GEN-LAST:event_calendarConsultaPropertyChange

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
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnVoltar;
    public static com.toedter.calendar.JCalendar calendarConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaConsultas;
    public static javax.swing.JTextField textNomeMedico;
    // End of variables declaration//GEN-END:variables

}
