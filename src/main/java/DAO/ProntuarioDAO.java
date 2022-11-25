/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author tayna
 */
public class ProntuarioDAO {
//    int idProntuario;
//    int idPaciente;
//    Date dataNacimento;
//    int idade;
//    String naturalidade;
//    String genero;
//    String profissão;
//    String cpfPaciente;
//    String rgPaciente;
//    String emissorRg;
//    String cidadeAtual;
//    String cep;
//    String estado;
//    String telefone;
//    String email;
//    String convenio;
//    String plano;
//    String numero;
//    String medicação;
//    String alergia;
//    String observação;
//    
//    
//    
//    public boolean AgendarConsulta(Agenda agenda){ 
// 
//        try { 
//            
//            java.util.Date utilDate1 = TelaNovoAgendamento.campoData.getDate(); // DATE
//            java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime()); // DATE
//            
//            // seleciona os campos da tabela
//            String sqlSelect = "select * from consultas where idProfissional='" + agenda.getFuncionario().getId() +"'" +
//                    "and data_hora = '" + sqlDate1 + "'" +
//                    "and hora = '" + TelaNovoAgendamento.campoHora.getSelectedItem() + "'"; 
//            PreparedStatement stmtSelect = connection.prepareStatement(sqlSelect);
//            
//            // o resultado do select será guardado dentro do obj resultSet
//            ResultSet rs = stmtSelect.executeQuery();
//
//            // condição para verificar se o obj resultSet já existe
//            if(rs.next()) {
//                JOptionPane.showMessageDialog(null, "Horário Indisponível",
//                    "ERRO!", JOptionPane.ERROR_MESSAGE);
//                return false;
//            } else {
//                String sql = "INSERT INTO consultas(procedimento,idPaciente,idProfissional,data_hora,tipo_consulta,hora) VALUES(?,?,?,?,?,?)";
//                PreparedStatement pdstmt = connection.prepareStatement(sql);
//
//                java.util.Date utilDate = agenda.getData_hora(); // DATE
//                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // DATE
//
//                pdstmt.setString(1, agenda.getProcedimento());
//
//                pdstmt.setInt(2, agenda.getPaciente().getId()); //precisa captar o objeto
//                pdstmt.setInt(3, agenda.getFuncionario().getId()); // idem
//
//                pdstmt.setDate(4, sqlDate); // DATE
//                pdstmt.setString(5, agenda.getTipo_consulta());
//                pdstmt.setString(6, agenda.getHora());
//
//                JOptionPane.showMessageDialog(null, "Consulta cadastrado com sucesso!! ");
//                pdstmt.execute();
//                pdstmt.close();
//
//                return true;
//            }
//            
//        } catch (SQLException exc) { 
//            System.out.println("Erro ao agendar consulta: " + exc); 
//            throw new RuntimeException(exc);
//        }
//    }
    
}
