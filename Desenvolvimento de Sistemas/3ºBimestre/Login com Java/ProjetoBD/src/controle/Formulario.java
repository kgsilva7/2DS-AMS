package controle;
import java.awt.*;
import java.text.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import javax.swing.table.DefaultTableModel; 
import java.sql.*;
import conexao.Conexao;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Formulario extends JFrame {
    Conexao con_cliente;    
    JLabel lblCodigo, lblNome, lblEmail, lblTel, lblData, lblPesquisa;
    JTextField txtCod, txtNome, txtEmail, txtPesquisa;
    JFormattedTextField txtTel, txtData;
    MaskFormatter mTel, mData;
    JTable tblClientes; 
    JScrollPane scp_tabela;
    JButton btnPrimeiro, btnAnterior, btnProximo, btnUltimo;
    JButton btnNovo, btnGravar, btnAlterar, btnExcluir, btnPesquisar, btnSair;    
    public Formulario() {
        con_cliente = new Conexao();
        con_cliente.conecta();    
        setTitle("Conexão Java com MySql");
        setResizable(false);
        setLayout(null);
        inicializarComponentes();
        posicionarComponentes();   
        setSize(800, 600);
        setVisible(true);
        setLocationRelativeTo(null);       
        con_cliente.executaSQL("select * from tbclientes order by cod");
        preencherTabela();
        posicionarRegistro();
    }   
    private void inicializarComponentes() {
        lblCodigo = new JLabel("Código:");
        lblNome = new JLabel("Nome:");
        lblEmail = new JLabel("Email:");
        lblTel = new JLabel("Telefone:");
        lblData = new JLabel("Data Nasc:");
        lblPesquisa = new JLabel("Pesquisa por nome:");       
        txtCod = new JTextField();
        txtNome = new JTextField();
        txtEmail = new JTextField();
        txtPesquisa = new JTextField();        
        try {
            mTel = new MaskFormatter("(##)####-####");
            mData = new MaskFormatter("##/##/####");
            txtTel = new JFormattedTextField(mTel);
            txtData = new JFormattedTextField(mData);
        } catch (ParseException e) {
            e.printStackTrace();
        }       
        tblClientes = new JTable();
        scp_tabela = new JScrollPane(tblClientes);       
        btnPrimeiro = new JButton("Primeiro");
        btnAnterior = new JButton("Anterior");
        btnProximo = new JButton("Próximo");
        btnUltimo = new JButton("Último");
        btnNovo = new JButton("Novo");
        btnGravar = new JButton("Gravar");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnPesquisar = new JButton("Pesquisar");
        btnSair = new JButton("Sair");       
        configurarTabela();
        adicionarListeners();
    }   
    private void posicionarComponentes() {
        lblCodigo.setBounds(50, 30, 80, 25);
        lblNome.setBounds(50, 60, 80, 25);
        lblEmail.setBounds(50, 90, 80, 25);
        lblTel.setBounds(50, 120, 80, 25);
        lblData.setBounds(50, 150, 80, 25);
        lblPesquisa.setBounds(400, 420, 150, 25);        
        txtCod.setBounds(140, 30, 100, 25);
        txtNome.setBounds(140, 60, 200, 25);
        txtEmail.setBounds(140, 90, 200, 25);
        txtTel.setBounds(140, 120, 100, 25);
        txtData.setBounds(140, 150, 100, 25);
        txtPesquisa.setBounds(400, 450, 200, 25);        
        btnPrimeiro.setBounds(50, 190, 90, 25);
        btnAnterior.setBounds(140, 190, 80, 25);
        btnProximo.setBounds(230, 190, 90, 25);
        btnUltimo.setBounds(320, 190, 80, 25);       
        btnNovo.setBounds(400, 30, 80, 25);
        btnGravar.setBounds(490, 30, 80, 25);
        btnAlterar.setBounds(580, 30, 80, 25);
        btnExcluir.setBounds(670, 30, 80, 25);
        btnSair.setBounds(670, 70, 80, 25);
        btnPesquisar.setBounds(610, 450, 100, 25);      
        scp_tabela.setBounds(50, 230, 700, 180);       
        add(lblCodigo); add(lblNome); add(lblEmail); add(lblTel); add(lblData); add(lblPesquisa);
        add(txtCod); add(txtNome); add(txtEmail); add(txtTel); add(txtData); add(txtPesquisa);
        add(btnPrimeiro); add(btnAnterior); add(btnProximo); add(btnUltimo);
        add(btnNovo); add(btnGravar); add(btnAlterar); add(btnExcluir); add(btnSair); add(btnPesquisar);
        add(scp_tabela);
    }   
    private void configurarTabela() {
        tblClientes.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] {"Código", "Nome", "Data Nascimento", "Telefone", "Email"}
        ) {
            boolean[] canEdit = new boolean[] {false, false, false, false, false};
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblClientes.setAutoCreateRowSorter(true);
    }   
    private void adicionarListeners() {
        btnPrimeiro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    con_cliente.resultset.first();
                    mostrar_Dados();
                } catch(SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro: " + erro, 
                        "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });     
        btnAnterior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!con_cliente.resultset.isFirst()) {
                        con_cliente.resultset.previous();
                        mostrar_Dados();
                    } else {
                        JOptionPane.showMessageDialog(null, "Você já está no primeiro registro.", 
                            "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch(SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Não foi possível acessar o registro anterior: " + erro, 
                        "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });     
        btnProximo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!con_cliente.resultset.isLast()) {
                        con_cliente.resultset.next();
                        mostrar_Dados();
                    } else {
                        JOptionPane.showMessageDialog(null, "Você já está no último registro.", 
                            "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch(SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Não foi possível acessar o próximo registro: " + erro, 
                        "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });       
        btnUltimo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    con_cliente.resultset.last();
                    mostrar_Dados();
                } catch(SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Não foi possível acessar o último registro: " + erro, 
                        "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });       
        btnNovo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtCod.setText("");
                txtNome.setText("");
                txtEmail.setText("");
                txtTel.setText("");
                txtData.setText("");
                txtCod.requestFocus();
            }
        });       
        btnGravar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = txtNome.getText();
                    String telefone = txtTel.getText();
                    String email = txtEmail.getText();
                    String data_nasc = txtData.getText();            
                    String insert_sql = "insert into tbclientes (nome, telefone, email, dt_nasc) values ('" + 
                                      nome + "', '" + telefone + "', '" + email + "', '" + data_nasc + "')";         
                    con_cliente.statement.executeUpdate(insert_sql);
                    JOptionPane.showMessageDialog(null, "Registro gravado com sucesso!", 
                        "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);                
                    con_cliente.executaSQL("select * from tbclientes order by cod");
                    preencherTabela();                  
                } catch(SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao gravar registro: " + erro, 
                        "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });       
        btnAlterar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (txtCod.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Selecione um registro para alterar!", 
                            "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }                   
                    String nome = txtNome.getText();
                    String telefone = txtTel.getText();
                    String email = txtEmail.getText();
                    String data_nasc = txtData.getText();
                    String codigo = txtCod.getText();                 
                    String update_sql = "update tbclientes set nome='" + nome + "', telefone='" + telefone + 
                                      "', email='" + email + "', dt_nasc='" + data_nasc + 
                                      "' where cod = " + codigo;          
                    con_cliente.statement.executeUpdate(update_sql);
                    JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!", 
                        "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);             
                    con_cliente.executaSQL("select * from tbclientes order by cod");
                    preencherTabela();             
                } catch(SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar registro: " + erro, 
                        "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });       
        btnExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (txtCod.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Selecione um registro para excluir!", 
                            "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }  
                    int confirm = JOptionPane.showConfirmDialog(null, 
                        "Deseja realmente excluir este registro?", "Confirmação", 
                        JOptionPane.YES_NO_OPTION);
                    
                    if (confirm == JOptionPane.YES_OPTION) {
                        String codigo = txtCod.getText();
                        String delete_sql = "delete from tbclientes where cod = " + codigo;
                        con_cliente.statement.executeUpdate(delete_sql);
                        JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!", 
                            "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);                       
                        con_cliente.executaSQL("select * from tbclientes order by cod");
                        preencherTabela();
                        posicionarRegistro();
                    }               
                } catch(SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir registro: " + erro, 
                        "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });       
        btnPesquisar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String pesquisa = "select * from tbclientes where nome like '" + txtPesquisa.getText() + "%'";
                    con_cliente.executaSQL(pesquisa);         
                    if (con_cliente.resultset.next()) {
                        con_cliente.resultset.beforeFirst();
                        preencherTabela();
                    } else {
                        JOptionPane.showMessageDialog(null, "Não existem dados com este parâmetro!!", 
                            "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch(SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Os dados digitados não foram localizados!!: " + erro, 
                        "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });       
        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                con_cliente.desconecta();
                System.exit(0);
            }
        });
    }     
    public void preencherTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        try {
            con_cliente.resultset.beforeFirst();
            while (con_cliente.resultset.next()) {
                modelo.addRow(new Object[] {
                    con_cliente.resultset.getString("cod"),
                    con_cliente.resultset.getString("nome"),
                    con_cliente.resultset.getString("dt_nasc"),
                    con_cliente.resultset.getString("telefone"),
                    con_cliente.resultset.getString("email")                                              
                });
            }
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados da tabela!!: " + erro, 
                "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }  
    public void posicionarRegistro() {
        try {
            con_cliente.resultset.first();
            mostrar_Dados();
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no primeiro registro: " + erro, 
                "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }    
    public void mostrar_Dados() {
        try {
            txtCod.setText(con_cliente.resultset.getString("cod"));     
            txtNome.setText(con_cliente.resultset.getString("nome"));    
            txtEmail.setText(con_cliente.resultset.getString("email"));
            txtTel.setText(con_cliente.resultset.getString("telefone"));
            txtData.setText(con_cliente.resultset.getString("dt_nasc"));
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não localizou dados: " + erro, 
                "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}