/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas.Paciente;

import DAO.PacienteDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Paciente;

/**
 *
 * @author tayna
 */
public class TelaEditarPaciente extends javax.swing.JFrame {

    public static void recebeId(Paciente pac) {
        txtCodPac.setText(String.valueOf(pac.getId()));
        txtCodPac.requestFocus();
    }

    /**
     * Creates new form telaEditarPaciente
     */
    public TelaEditarPaciente() {
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
        jPanel2 = new javax.swing.JPanel();
        edicaoPac = new javax.swing.JLabel();
        butSairEDICAOPac = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanelCadastrar = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelCPF = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelCEP = new javax.swing.JLabel();
        labelNum = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        txtNomePacEdt = new javax.swing.JTextField();
        txtCpfPacEdt = new javax.swing.JFormattedTextField();
        txtCodPac = new javax.swing.JTextField();
        txtTelefonePacEdt = new javax.swing.JFormattedTextField();
        txtCepPacEdt = new javax.swing.JFormattedTextField();
        txtNumPacEdt = new javax.swing.JTextField();
        txtCidadeEdt = new javax.swing.JTextField();
        labelDataPac = new javax.swing.JLabel();
        LabelEmailPac = new javax.swing.JLabel();
        LabelRua = new javax.swing.JLabel();
        LabelBairro = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        txtEmailPacEdt = new javax.swing.JTextField();
        txtRuaPacEdt = new javax.swing.JTextField();
        txtBairroPacEdt = new javax.swing.JTextField();
        comboBoxEstadoEdt = new javax.swing.JComboBox<>();
        butSalvarEDICAOPac = new javax.swing.JButton();
        butCancelarEDICAOPac = new javax.swing.JButton();
        buttonPesquisarPac = new javax.swing.JButton();
        DateNascEdtPac = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paciente - Tela de edição");

        edicaoPac.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        edicaoPac.setForeground(new java.awt.Color(51, 51, 51));
        edicaoPac.setIcon(new javax.swing.ImageIcon("C:\\Users\\tayna\\Google Drive\\GRADUAÇÃO\\6º Período\\Oficina de Integração 2\\4Life\\imagens\\icons\\team.png")); // NOI18N
        edicaoPac.setText("EDITAR PACIENTE");
        edicaoPac.setIconTextGap(5);

        butSairEDICAOPac.setBackground(new java.awt.Color(0, 51, 51));
        butSairEDICAOPac.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        butSairEDICAOPac.setForeground(new java.awt.Color(255, 255, 255));
        butSairEDICAOPac.setText("Sair");
        butSairEDICAOPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSairEDICAOPacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edicaoPac, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(butSairEDICAOPac, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(edicaoPac, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addComponent(butSairEDICAOPac))
        );

        labelNome.setText("Nome:");

        labelCPF.setText("CPF:");

        labelID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelID.setText("Código:");

        labelTelefone.setText("Telefone:");

        labelCEP.setText("CEP:");

        labelNum.setText("Número:");

        labelCidade.setText("Cidade:");

        try {
            txtCpfPacEdt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtCodPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodPacActionPerformed(evt);
            }
        });

        try {
            txtTelefonePacEdt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCepPacEdt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelDataPac.setText("Data de nascimento:");

        LabelEmailPac.setText("Email:");

        LabelRua.setText("Rua:");

        LabelBairro.setText("Bairro:");

        jLabelEstado.setText("Estado:");

        comboBoxEstadoEdt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um estado", "ACRE", "ALAGOAS", "AMAPÁ", "AMAZONAS", "BAHIA", "CEARÁ", "DISTRITO FEDERAL", "ESPÍRITO SANTO", "GOIÁS", "MARANHÃO", "MATO GROSSO", "MATO GROSSO DO SUL", "MINAS GERAIS", "PARÁ", "PARAÍBA", "PARANÁ", "PERNAMBUCO", "PIAUÍ", "RIO DE JANEIRO", "RIO GRANDE DO NORTE", "RIO GRANDE DO SUL", "RONDÔNIA", "RORAIMA", "SANTA CATARINA", "SÃO PAULO", "SERGIPE", "TOCANTINS" }));

        butSalvarEDICAOPac.setBackground(new java.awt.Color(0, 102, 52));
        butSalvarEDICAOPac.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        butSalvarEDICAOPac.setForeground(new java.awt.Color(255, 255, 255));
        butSalvarEDICAOPac.setText("Salvar");
        butSalvarEDICAOPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalvarEDICAOPacActionPerformed(evt);
            }
        });

        butCancelarEDICAOPac.setBackground(new java.awt.Color(211, 0, 0));
        butCancelarEDICAOPac.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        butCancelarEDICAOPac.setForeground(new java.awt.Color(255, 255, 255));
        butCancelarEDICAOPac.setText("Cancelar");
        butCancelarEDICAOPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarEDICAOPacActionPerformed(evt);
            }
        });

        buttonPesquisarPac.setBackground(new java.awt.Color(0, 102, 52));
        buttonPesquisarPac.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        buttonPesquisarPac.setForeground(new java.awt.Color(255, 255, 255));
        buttonPesquisarPac.setIcon(new javax.swing.ImageIcon("C:\\Users\\tayna\\Google Drive\\GRADUAÇÃO\\6º Período\\Oficina de Integração 2\\4Life\\imagens\\icons\\search.png")); // NOI18N
        buttonPesquisarPac.setText("Pesquisar");
        buttonPesquisarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarPacActionPerformed(evt);
            }
        });

        DateNascEdtPac.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanelCadastrarLayout = new javax.swing.GroupLayout(jPanelCadastrar);
        jPanelCadastrar.setLayout(jPanelCadastrarLayout);
        jPanelCadastrarLayout.setHorizontalGroup(
            jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butSalvarEDICAOPac, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butCancelarEDICAOPac, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastrarLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastrarLayout.createSequentialGroup()
                                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                                        .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTelefonePacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                                        .addComponent(labelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCepPacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                                        .addComponent(labelNum, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumPacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                                        .addComponent(labelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCidadeEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76)
                                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                                        .addComponent(LabelEmailPac, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEmailPacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                                        .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabelEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelRua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBairroPacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboBoxEstadoEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRuaPacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastrarLayout.createSequentialGroup()
                                .addComponent(labelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCpfPacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)
                                .addComponent(labelDataPac, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DateNascEdtPac, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastrarLayout.createSequentialGroup()
                                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomePacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastrarLayout.createSequentialGroup()
                                .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodPac, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonPesquisarPac)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanelCadastrarLayout.setVerticalGroup(
            jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodPac, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPesquisarPac, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomePacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpfPacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelDataPac, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DateNascEdtPac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmailPac, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailPacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonePacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCepPacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRua, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuaPacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNum, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumPacEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroPacEdt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEstadoEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSalvarEDICAOPac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butCancelarEDICAOPac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanelCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 33, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(235, 95, 806, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void butSairEDICAOPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSairEDICAOPacActionPerformed
        this.dispose();
    }//GEN-LAST:event_butSairEDICAOPacActionPerformed

    private void butSalvarEDICAOPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarEDICAOPacActionPerformed
       try{
            Paciente pac = new Paciente();
            
            pac.setNome(txtNomePacEdt.getText());
            pac.setCpf(txtCpfPacEdt.getText());
            pac.setEmail(txtEmailPacEdt.getText());
            pac.setTelefone(txtTelefonePacEdt.getText());
            pac.setData_nascimento(DateNascEdtPac.getDate());
            pac.setCep(txtCepPacEdt.getText());
            pac.setRua(txtRuaPacEdt.getText());
            pac.setBairro(txtBairroPacEdt.getText());
            pac.setCidade(txtCidadeEdt.getText());
            pac.setEstado(String.valueOf(comboBoxEstadoEdt.getSelectedItem()));
            pac.setNum_endereco(Integer.parseInt(txtNumPacEdt.getText()));
            pac.setId(Integer.parseInt(txtCodPac.getText()));
            
            PacienteDAO pdao = new PacienteDAO();
            pdao.editar(pac);
            
            JOptionPane.showMessageDialog(null, "Paciente atualizado com sucesso!");
            
            //limpa os campos ao salvar alteração do paciente.
            txtCodPac.setText("");
            txtNomePacEdt.setText("");
            txtCpfPacEdt.setText("");
            txtEmailPacEdt.setText("");
            txtTelefonePacEdt.setText("");
            //DateNascEdtPac.setDate("");
            txtCepPacEdt.setText("");
            txtRuaPacEdt.setText("");
            txtBairroPacEdt.setText("");
            txtCidadeEdt.setText("");
            comboBoxEstadoEdt.setSelectedItem("Selecione um estado");
            txtNumPacEdt.setText("");
            
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!" + erro);
        }

    }//GEN-LAST:event_butSalvarEDICAOPacActionPerformed

    private void butCancelarEDICAOPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarEDICAOPacActionPerformed
        txtCodPac.setText("");
        txtNomePacEdt.setText("");
        txtCpfPacEdt.setText("");
        txtEmailPacEdt.setText("");
        txtTelefonePacEdt.setText("");
        //DateNascEdtPac.setText("");
        txtCepPacEdt.setText("");
        txtRuaPacEdt.setText("");
        txtBairroPacEdt.setText("");
        txtCidadeEdt.setText("");
        comboBoxEstadoEdt.setSelectedItem("Selecione um estado");
        txtNumPacEdt.setText("");
    }//GEN-LAST:event_butCancelarEDICAOPacActionPerformed

    private void txtCodPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodPacActionPerformed

    private void buttonPesquisarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarPacActionPerformed
        Paciente paciente = new Paciente();
        
        if(txtCodPac.getText().equals("")){  //chama a tela de Busca Paciente quando o campo estiver vazio.
            TelaBuscarPaciente telaBusca = new TelaBuscarPaciente();
            telaBusca.setVisible(true);
        }
        else{
            paciente.setId(Integer.parseInt(txtCodPac.getText()));
            PacienteDAO pdao = new PacienteDAO();
            
            try{
                if(pdao.pesquisaPac(paciente)){
                    if(paciente != null){
                        txtNomePacEdt.setText(paciente.getNome().trim());
                        txtCpfPacEdt.setText(paciente.getCpf().trim());
                        txtEmailPacEdt.setText(paciente.getEmail().trim());
                        txtTelefonePacEdt.setText(paciente.getTelefone().trim());
                        DateNascEdtPac.setDate(paciente.getData_nascimento());
                        txtCepPacEdt.setText(paciente.getCep().trim());
                        txtRuaPacEdt.setText(paciente.getRua().trim());
                        txtBairroPacEdt.setText(paciente.getBairro().trim());
                        txtCidadeEdt.setText(paciente.getCidade().trim());
                        comboBoxEstadoEdt.setSelectedItem(paciente.getEstado());
                        txtNumPacEdt.setText(Integer.toString(paciente.getNum_endereco()));
                    }
                }
            }
            catch(Exception exc){
                JOptionPane.showMessageDialog(null, "Erro ao pesquisar paciente!" +exc);
            }
        }
    }//GEN-LAST:event_buttonPesquisarPacActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateNascEdtPac;
    private javax.swing.JLabel LabelBairro;
    private javax.swing.JLabel LabelEmailPac;
    private javax.swing.JLabel LabelRua;
    private javax.swing.JButton butCancelarEDICAOPac;
    private javax.swing.JButton butSairEDICAOPac;
    private javax.swing.JButton butSalvarEDICAOPac;
    private javax.swing.JButton buttonPesquisarPac;
    private javax.swing.JComboBox<String> comboBoxEstadoEdt;
    private javax.swing.JLabel edicaoPac;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCadastrar;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelDataPac;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNum;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JTextField txtBairroPacEdt;
    private javax.swing.JFormattedTextField txtCepPacEdt;
    private javax.swing.JTextField txtCidadeEdt;
    static javax.swing.JTextField txtCodPac;
    private javax.swing.JFormattedTextField txtCpfPacEdt;
    private javax.swing.JTextField txtEmailPacEdt;
    private javax.swing.JTextField txtNomePacEdt;
    private javax.swing.JTextField txtNumPacEdt;
    private javax.swing.JTextField txtRuaPacEdt;
    private javax.swing.JFormattedTextField txtTelefonePacEdt;
    // End of variables declaration//GEN-END:variables
}
