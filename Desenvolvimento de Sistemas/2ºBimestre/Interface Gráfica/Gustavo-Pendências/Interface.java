package ams;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Interface extends JFrame {
    private final JTextField campoValor1, campoValor2;
    private final JLabel labelResultado, labelTitulo, rotulo1, rotulo2;
    private final JButton botaoSoma, botaoSub, botaoMult, botaoDiv;
    private final JButton botaoLimpar, botaoSair, botaoOcultar, botaoExibir;
    private final JButton botaoDesabilitar, botaoHabilitar;
    public Interface() {
        super("Calculadora - Interface Gráfica");
        Container tela = getContentPane();
        tela.setLayout(null);
        setSize(500, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        rotulo1 = new JLabel("Valor 1:");
        rotulo1.setBounds(30, 30, 100, 25);
        campoValor1 = new JTextField();
        campoValor1.setBounds(100, 30, 100, 25);    
        rotulo2 = new JLabel("Valor 2:");
        rotulo2.setBounds(30, 70, 100, 25);
        campoValor2 = new JTextField();
        campoValor2.setBounds(100, 70, 100, 25);      
        labelTitulo = new JLabel("Resultado:");
        labelTitulo.setBounds(30, 110, 100, 25);
        labelResultado = new JLabel("");
        labelResultado.setBounds(130, 110, 200, 25);
        labelResultado.setFont(new Font("Arial", Font.BOLD, 14));        
        botaoSoma = new JButton("+");
        botaoSub = new JButton("-");
        botaoMult = new JButton("*");
        botaoDiv = new JButton("/");
        botaoLimpar = new JButton("Limpar");
        botaoSair = new JButton("Sair");
        botaoOcultar = new JButton("Ocultar");
        botaoExibir = new JButton("Exibir");
        botaoDesabilitar = new JButton("Desabilitar");
        botaoHabilitar = new JButton("Habilitar");
        botaoSoma.setBounds(30, 160, 60, 30);
        botaoSub.setBounds(100, 160, 60, 30);
        botaoMult.setBounds(170, 160, 60, 30);
        botaoDiv.setBounds(240, 160, 60, 30);
        botaoLimpar.setBounds(310, 160, 100, 30);
        botaoHabilitar.setBounds(30, 210, 100, 30);
        botaoDesabilitar.setBounds(140, 210, 120, 30);
        botaoOcultar.setBounds(270, 210, 100, 30);
        botaoExibir.setBounds(380, 210, 80, 30);
        botaoSair.setBounds(190, 260, 100, 30);    
        botaoSoma.setMnemonic(KeyEvent.VK_S);        
        botaoLimpar.setMnemonic(KeyEvent.VK_L);      
        botaoSair.setMnemonic(KeyEvent.VK_R);              
        JLabel rodape = new JLabel("Desenvolvido por Gustavo Alexandre 2º AMS");
        rodape.setBounds(120, 320, 300, 30);
        rodape.setFont(new Font("Arial", Font.ITALIC, 12));      
        tela.add(rotulo1); tela.add(campoValor1);
        tela.add(rotulo2); tela.add(campoValor2);
        tela.add(labelTitulo); tela.add(labelResultado);
        tela.add(botaoSoma); tela.add(botaoSub); tela.add(botaoMult); tela.add(botaoDiv);
        tela.add(botaoLimpar); tela.add(botaoSair);
        tela.add(botaoHabilitar); tela.add(botaoDesabilitar);
        tela.add(botaoOcultar); tela.add(botaoExibir);
        tela.add(rodape);
        botaoSoma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("soma");
            }
        });
        botaoSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("sub");
            }
        });    
        botaoMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("mult");
            }
        });     
        botaoDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("div");
            }
        }); 
        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpar();
            }
        });    
        botaoSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });   
        botaoOcultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rotulo1.setVisible(false);
                rotulo2.setVisible(false);
            }
        });       
        botaoExibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rotulo1.setVisible(true);
                rotulo2.setVisible(true);
            }
        });
        botaoDesabilitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelTitulo.setEnabled(false);
                labelResultado.setEnabled(false);
            }
        });   
        botaoHabilitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelTitulo.setEnabled(true);
                labelResultado.setEnabled(true);
            }
        });   
        setVisible(true);
    }  
    private void calcular(String operacao) {
        try {
            double v1 = Double.parseDouble(campoValor1.getText());
            double v2 = Double.parseDouble(campoValor2.getText());
            Calculadora calc = new Calculadora();
            calc.setValor1(v1);
            calc.setValor2(v2);
            double resultado = 0;
            switch (operacao) {
                case "soma" -> resultado = calc.somar();
                case "sub" -> resultado = calc.subtrair();
                case "mult" -> resultado = calc.multiplicar();
                case "div" -> resultado = calc.dividir();
            }
            labelResultado.setText(String.format("%.2f", resultado));
        } catch (NumberFormatException ex) {
            labelResultado.setText("Erro: Valores inválidos");
        } catch (ArithmeticException ex) {
            labelResultado.setText("Erro: " + ex.getMessage());
        } catch (Exception ex) {
            labelResultado.setText("Erro inesperado");
        }
    }
    private void limpar() {
        campoValor1.setText("");
        campoValor2.setText("");
        labelResultado.setText("");
        campoValor1.requestFocus();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Interface();
            }
        });
    }
}