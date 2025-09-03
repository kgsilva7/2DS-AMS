package controle;
import java.awt.*;
import java.text.*;
import javax.swing.*;
import conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    public class Login extends JFrame {
    Conexao con_cliente;
    JPasswordField tsen;
    JLabel rusu, rsen, rti;
    JTextField tusu;
    JButton logar;
    public Login() {
        con_cliente = new Conexao();
        con_cliente.conecta();
        setTitle(" *** Login de Acesso *** ");
        Container tela = getContentPane();
        setLayout(null);
        rti = new JLabel("Acesso ao Sistema ");
        rusu = new JLabel("Usuário: ");
        rsen = new JLabel("Senha: ");
        tusu = new JTextField();
        tsen = new JPasswordField();
        logar = new JButton("Logar");
        rti.setBounds(150, 50, 150, 30);
        rusu.setBounds(50, 100, 100, 30);
        rsen.setBounds(50, 150, 100, 30);
        tusu.setBounds(150, 100, 200, 30);
        tsen.setBounds(150, 150, 200, 30);
        logar.setBounds(150, 200, 100, 30);
        tela.add(rti);
        tela.add(rusu);
        tela.add(rsen);
        tela.add(tusu);
        tela.add(tsen);
        tela.add(logar);
        logar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String pesquisa = "select * from tblusuario where usuario like '" + tusu.getText() + "' && senha = " + tsen.getText() + "";
                    con_cliente.executaSQL(pesquisa);             
                    if (con_cliente.resultset.first()) { 
                        Formulario mostra = new Formulario();
                        mostra.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, 
                            "\n Usuário não cadastrado!!!!",
                            "Mensagem do Programa",
                            JOptionPane.INFORMATION_MESSAGE);
                        con_cliente.desconecta();
                        System.exit(0);
                    }
                } catch (SQLException errosql) {
                    JOptionPane.showMessageDialog(null,
                        "\n Os dados digitados não foram localizados!! \n " + errosql,
                        "Mensagem do Programa",
                        JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        new Login();
    }
  }