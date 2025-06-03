import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Principal extends JFrame{
    private final JTextField txtNum1;
    private final JTextField txtNum2;
    private final JLabel lblResultado;
    private final JLabel lblRodape;
    private final JButton btnSoma; 
    private final JButton btnSub; 
    private final JButton btnMult; 
    private final JButton btnDiv; 
    private final JButton btnLimpar;
    private final JButton btnHabilitar;
    private final JButton btnDesabilitar;
    private final JButton btnOcultar;
    private final JButton btnExibir;
    private final JButton btnSair;

    public Principal() {
        super("Mini Calculadora");
        Container tela = getContentPane();
        tela.setLayout(null);

        setSize(350, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setBackground(new Color(240, 240, 240));

        JLabel lblNum1 = new JLabel("1º Número:");
        JLabel lblNum2 = new JLabel("2º Número:");
        txtNum1 = new JTextField();
        txtNum2 = new JTextField();
        lblResultado = new JLabel("Resultado: ");
        lblRodape = new JLabel("Desenvolvido por: Gustavo Alexandre da Silva 2º AMS");

        btnSoma = criarBotao("+", Color.WHITE, new Color(59, 89, 182));
        btnSub = criarBotao("-", Color.WHITE, new Color(59, 89, 182));
        btnMult = criarBotao("*", Color.WHITE, new Color(59, 89, 182));
        btnDiv = criarBotao("/", Color.WHITE, new Color(59, 89, 182));
        btnLimpar = criarBotao("Limpar", Color.BLACK, new Color(220, 220, 220));
        btnHabilitar = criarBotao("Habilitar", Color.BLACK, new Color(144, 238, 144));
        btnDesabilitar = criarBotao("Desabilitar", Color.BLACK, new Color(255, 160, 122));
        btnOcultar = criarBotao("Ocultar", Color.BLACK, new Color(245, 245, 220));
        btnExibir = criarBotao("Exibir", Color.BLACK, new Color(224, 255, 255));
        btnSair = criarBotao("Sair", Color.WHITE, new Color(255, 69, 0));
        lblNum1.setBounds(20, 20, 100, 20);
        txtNum1.setBounds(120, 20, 200, 25);
        lblNum2.setBounds(20, 60, 100, 20);
        txtNum2.setBounds(120, 60, 200, 25);
        lblResultado.setBounds(20, 100, 300, 25);
        btnSoma.setBounds(20, 140, 50, 30);
        btnSub.setBounds(80, 140, 50, 30);
        btnMult.setBounds(140, 140, 50, 30);
        btnDiv.setBounds(200, 140, 50, 30);
        btnLimpar.setBounds(260, 140, 70, 30); 
        btnHabilitar.setBounds(20, 190, 100, 30);
        btnDesabilitar.setBounds(130, 190, 100, 30);
        btnOcultar.setBounds(20, 240, 100, 30);
        btnExibir.setBounds(130, 240, 100, 30);
        btnSair.setBounds(240, 240, 90, 30);
        lblRodape.setBounds(20, 280, 300, 20);
        btnSoma.setMnemonic(KeyEvent.VK_A);    
        btnSub.setMnemonic(KeyEvent.VK_S);     
        btnMult.setMnemonic(KeyEvent.VK_M);    
        btnDiv.setMnemonic(KeyEvent.VK_D);    
        btnLimpar.setMnemonic(KeyEvent.VK_L);  
        btnSair.setMnemonic(KeyEvent.VK_X);    
        btnSoma.addActionListener(e -> calcular('+'));
        btnSub.addActionListener(e -> calcular('-'));
        btnMult.addActionListener(e -> calcular('*'));
        btnDiv.addActionListener(e -> calcular('/'));
        btnLimpar.addActionListener(e -> limpar());
        btnHabilitar.addActionListener(e -> lblResultado.setEnabled(true));
        btnDesabilitar.addActionListener(e -> lblResultado.setEnabled(false));
        btnOcultar.addActionListener(e -> lblResultado.setVisible(false));
        btnExibir.addActionListener(e -> lblResultado.setVisible(true));
        btnSair.addActionListener(e -> System.exit(0));
        adicionarComponentes(tela, lblNum1, txtNum1, lblNum2, txtNum2, lblResultado,
                btnSoma, btnSub, btnMult, btnDiv, btnLimpar, btnHabilitar,
                btnDesabilitar, btnOcultar, btnExibir, btnSair, lblRodape);
    }
    private JButton criarBotao(String texto, Color fonte, Color fundo) {
        JButton btn = new JButton(texto);
        btn.setForeground(fonte);
        btn.setBackground(fundo);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Arial", Font.BOLD, 12));
        return btn;
    }
    private void adicionarComponentes(Container tela, Component... componentes) {
        for (Component comp : componentes) {
            tela.add(comp);
        }
    }
    private void calcular(char operador) {
        try {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            String operacao = "";
            double resultado = 0;
            switch (operador) {
                case '+': 
                    resultado = num1 + num2;
                    operacao = "soma";
                break;
                case '-':
                    resultado = num1 - num2;
                    operacao = "subtração";
                break;
                case '*':
                    resultado = num1 * num2;
                    operacao = "multiplicação";
                break;
                case '/':
                    if (num2 == 0) throw new ArithmeticException();
                    resultado = num1 / num2;
                    operacao = "divisão";
                    break;
            }
            lblResultado.setText("A " + operacao + " é: " + String.format("%.2f", resultado));    
        } catch (NumberFormatException ex) {
            lblResultado.setText("Erro!");
        } catch (ArithmeticException ex) {
            lblResultado.setText("Divisão por zero!");
        }
    }
    private void limpar() {
        txtNum1.setText("");
        txtNum2.setText("");
        lblResultado.setText("Resultado:");
        txtNum1.requestFocus();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
}