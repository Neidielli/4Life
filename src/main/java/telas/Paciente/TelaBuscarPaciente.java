/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas.Paciente;

import DAO.PacienteDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Paciente;

/**
 *
 * @author tayna
 */
public class TelaBuscarPaciente extends javax.swing.JFrame {

    public void listaPaciente(){
        try{
            PacienteDAO dao = new PacienteDAO();
            List<Paciente> pac = dao.listaPac();
            
            DefaultTableModel model = (DefaultTableModel)tabelaBuscaPac.getModel();
            model.setNumRows(0);
            
            for(Paciente p : pac){
                model.addRow(new Object []{
                p.getId(),
                p.getNome(),
                p.getCpf(),
                p.getData_nascimento(),
                p.getTelefone(),
                p.getCidade(),
                p.getEstado()
            });
            }
            
        }catch(Exception exc){
            
        }
    }
    public TelaBuscarPaciente() {
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

        jPanel1 = new javax.swing.JPanel();
        tituloPag = new javax.swing.JLabel();
        buttonSairPac = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CBoxTipoPac = new javax.swing.JComboBox<>();
        txtBuscaPac = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaBuscaPac = new javax.swing.JTable();
        buttonEditarPac = new javax.swing.JButton();
        buttonExcluirPac = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paciente - Tela de Busca");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tituloPag.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        tituloPag.setForeground(new java.awt.Color(51, 51, 51));
        tituloPag.setIcon(new javax.swing.ImageIcon("C:\\Users\\tayna\\Google Drive\\GRADUAÇÃO\\6º Período\\Oficina de Integração 2\\4Life\\imagens\\icons\\team.png")); // NOI18N
        tituloPag.setText("BUSCAR PACIENTE");
        tituloPag.setIconTextGap(5);

        buttonSairPac.setBackground(new java.awt.Color(0, 51, 51));
        buttonSairPac.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        buttonSairPac.setForeground(new java.awt.Color(255, 255, 255));
        buttonSairPac.setText("Sair");
        buttonSairPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairPacActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 0), null));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar por:");

        CBoxTipoPac.setBackground(new java.awt.Color(204, 204, 204));
        CBoxTipoPac.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        CBoxTipoPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Código" }));

        txtBuscaPac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaPacKeyReleased(evt);
            }
        });

        tabelaBuscaPac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOME DO PACIENTE", "CPF", "DATA DE NASC.", "TELEFONE", "CIDADE", "ESTADO"
            }
        ));
        tabelaBuscaPac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaBuscaPacMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaBuscaPac);
        if (tabelaBuscaPac.getColumnModel().getColumnCount() > 0) {
            tabelaBuscaPac.getColumnModel().getColumn(0).setMaxWidth(170);
            tabelaBuscaPac.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        buttonEditarPac.setBackground(new java.awt.Color(0, 102, 52));
        buttonEditarPac.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        buttonEditarPac.setForeground(new java.awt.Color(255, 255, 255));
        buttonEditarPac.setText("Editar");
        buttonEditarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPacActionPerformed(evt);
            }
        });

        buttonExcluirPac.setBackground(new java.awt.Color(211, 0, 0));
        buttonExcluirPac.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        buttonExcluirPac.setForeground(new java.awt.Color(255, 255, 255));
        buttonExcluirPac.setText("Deletar");
        buttonExcluirPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CBoxTipoPac, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscaPac, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonEditarPac, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonExcluirPac, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBoxTipoPac)
                    .addComponent(txtBuscaPac, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditarPac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExcluirPac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPag, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSairPac, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloPag, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSairPac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setBounds(260, 115, 834, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairPacActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonSairPacActionPerformed

    private void buttonExcluirPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPacActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir paciente?", "CONFIRMAÇÃO DE EXCLUSÃO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(confirma == JOptionPane.YES_OPTION){
            if(tabelaBuscaPac.getSelectedRow() != -1){
                Paciente paciente = new Paciente();
                PacienteDAO dao = new PacienteDAO();

                paciente.setId((int) tabelaBuscaPac.getValueAt(tabelaBuscaPac.getSelectedRow(), 0));
                dao.deletar(paciente);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione um paciente para excluir!");
            }
        }
    }//GEN-LAST:event_buttonExcluirPacActionPerformed

    private void buttonEditarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPacActionPerformed
        Paciente pac = new Paciente();
        
        TelaEditarPaciente telaEditarPaciente = new TelaEditarPaciente();
        telaEditarPaciente.setVisible(true); // abre a tela de edição novamente
        
        int linha = tabelaBuscaPac.getSelectedRow();  //pega o código da linha selecionada e passa para a tela de edição.
        
        pac.setId(Integer.parseInt(tabelaBuscaPac.getValueAt(linha,0).toString())); 
        
        TelaEditarPaciente.recebeId(pac); // tela de edicão recebe o id do paciente
        this.dispose();
        
    }//GEN-LAST:event_buttonEditarPacActionPerformed

    private void tabelaBuscaPacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaBuscaPacMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaBuscaPacMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listaPaciente();
    }//GEN-LAST:event_formWindowActivated

    private void txtBuscaPacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaPacKeyReleased
        DefaultTableModel model = (DefaultTableModel) tabelaBuscaPac.getModel();
        model.setNumRows(0);
        
        String tipo = "";
        String escolha = CBoxTipoPac.getSelectedItem().toString();
        
        if(escolha.equals("Nome")){
            tipo = " "+"nome";
        }
        if(escolha.equals("Código")){
            tipo = " "+"id";
        }
        String arg = txtBuscaPac.getText();
        
        try{
            ResultSet rs = PacienteDAO.carregaTabela(tipo, arg);
            DefaultTableModel dtm = (DefaultTableModel) tabelaBuscaPac.getModel();
            
            //pega os dados da linha no banco de dados.
            while(rs.next()){
                String Coluna0=rs.getString("id");
                String Coluna1=rs.getString("nome");
                String Coluna2=rs.getString("cpf");
                String Coluna3=rs.getString("data_nascimento");
                String Coluna4=rs.getString("telefone");
                String Coluna5=rs.getString("cidade");
                String Coluna6=rs.getString("estado");
                
                dtm.addRow(new String[]{Coluna0,Coluna1,Coluna2,Coluna3,Coluna4,Coluna5,Coluna6});
            }           
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(this,"ERRO!"+erro, "Preencher Item", 2);
        }
        tabelaBuscaPac.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_txtBuscaPacKeyReleased

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
            java.util.logging.Logger.getLogger(TelaBuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBoxTipoPac;
    private javax.swing.JButton buttonEditarPac;
    private javax.swing.JButton buttonExcluirPac;
    private javax.swing.JButton buttonSairPac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaBuscaPac;
    private javax.swing.JLabel tituloPag;
    private javax.swing.JTextField txtBuscaPac;
    // End of variables declaration//GEN-END:variables
}
