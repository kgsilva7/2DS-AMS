import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

public class Interface extends JFrame {
    Container tela;
    JMenuBar menuBar;
    JMenu menuOperacoes, menuSobre, menuSair;
    JMenuItem itemSomar, itemSubtrair, itemMultiplicar, itemDividir, itemSobre, itemSair;
    JToolBar toolBar;
    JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnSair;
    JPopupMenu popupMenu;
    JMenuItem popupSobre, popupSair;
    ImageIcon icone;

    public Interface() {
        super("Calculadora");

        tela = getContentPane();
        tela.setLayout(null);

        setSize(800, 600);
        setLocationRelativeTo(null);

        criarMenu();
        criarToolbar();
        criarPopup();

        setVisible(true);
    }

    private void criarMenu() {
    ImageIcon originalIcon = new ImageIcon(getClass().getResource("/img/Sair.png"));
    Image imagemRedimensionada = originalIcon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
    icone = new ImageIcon(imagemRedimensionada);


    menuBar = new JMenuBar();

    menuOperacoes = new JMenu("Operações");
    itemSomar = new JMenuItem("Somar");
    itemSubtrair = new JMenuItem("Subtrair");
    itemMultiplicar = new JMenuItem("Multiplicar");
    itemDividir = new JMenuItem("Dividir");

    itemSomar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            abrirFormularioOperacao('S');
        }
    });
    itemSubtrair.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            abrirFormularioOperacao('R');
        }
    });
    itemMultiplicar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            abrirFormularioOperacao('M');
        }
    });
    itemDividir.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            abrirFormularioOperacao('D');
        }
    });

    menuOperacoes.add(itemSomar);
    menuOperacoes.add(itemSubtrair);
    menuOperacoes.add(itemMultiplicar);
    menuOperacoes.add(itemDividir);

    menuSobre = new JMenu("Sobre");
    itemSobre = new JMenuItem("Sobre");
    itemSobre.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            abrirSobre();
        }
    });
    menuSobre.add(itemSobre);

    menuSair = new JMenu("Sair");
    itemSair = new JMenuItem("Sair");
    itemSair.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            confirmarSair();
        }
    });
    menuSair.add(itemSair);

    menuBar.add(menuOperacoes);
    menuBar.add(menuSobre);
    menuBar.add(menuSair);

    setJMenuBar(menuBar);
    }

    private void criarToolbar() {
        toolBar = new JToolBar();

        btnSomar = new JButton("+");
        btnSubtrair = new JButton("-");
        btnMultiplicar = new JButton("x");
        btnDividir = new JButton("÷");
        btnSair = new JButton(icone);

        btnSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirFormularioOperacao('S');
            }
        });
        btnSubtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirFormularioOperacao('R');
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirFormularioOperacao('M');
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirFormularioOperacao('D');
            }
        });
        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                confirmarSair();
            }
        });

        toolBar.add(btnSomar);
        toolBar.add(btnSubtrair);
        toolBar.add(btnMultiplicar);
        toolBar.add(btnDividir);
        toolBar.addSeparator();
        toolBar.add(btnSair);

        toolBar.setBounds(10, 10, 780, 40);
        tela.add(toolBar);
        
        Font fonteNegrito = new Font("Arial", Font.BOLD, 16);

        btnSomar.setFont(fonteNegrito);
        btnSubtrair.setFont(fonteNegrito);
        btnMultiplicar.setFont(fonteNegrito);
        btnDividir.setFont(fonteNegrito);
    }

    private void criarPopup() {
        popupMenu = new JPopupMenu();
        popupSobre = new JMenuItem("Sobre");
        popupSair = new JMenuItem("Sair");

        popupSobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirSobre();
            }
        });
        popupSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                confirmarSair();
            }
        });

        popupMenu.add(popupSobre);
        popupMenu.add(popupSair);

        addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(Interface.this, e.getX(), e.getY());
                }
            }

            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(Interface.this, e.getX(), e.getY());
                }
            }
        });
    }

    private void abrirFormularioOperacao(char operacao) {
        FormOperacao dialog = new FormOperacao(this, operacao);
        dialog.setVisible(true);
    }

    private void abrirSobre() {
        JanelaSobre sobre = new JanelaSobre(this);
        sobre.setVisible(true);
    }

    private void confirmarSair() {
        int resp = JOptionPane.showConfirmDialog(this,
                "Deseja realmente sair?", "Confirmação",
                JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}

class FormOperacao extends JDialog {
    private JLabel t1, t2, res1;
    private JTextField num1, num2;
    private JButton calcular, limpar; 
    private char operacao;

    public FormOperacao(JFrame parent, char operacao) {
        super(parent, "Operação", true);
        this.operacao = operacao;

        setLayout(null);
        setSize(350, 250);
        setLocationRelativeTo(parent);

        t1 = new JLabel("1° Número");
        t2 = new JLabel("2° Número");
        res1 = new JLabel("Resultado:");

        num1 = new JTextField();
        num2 = new JTextField();

        calcular = new JButton("Calcular");
        limpar = new JButton("Limpar");

        t1.setBounds(20, 20, 100, 25);
        num1.setBounds(130, 20, 150, 25);

        t2.setBounds(20, 60, 100, 25);
        num2.setBounds(130, 60, 150, 25);

        calcular.setBounds(20, 110, 100, 30);
        limpar.setBounds(180, 110, 100, 30);

        res1.setBounds(20, 160, 300, 30);

        add(t1);
        add(num1);
        add(t2);
        add(num2);
        add(calcular);
        add(limpar);
        add(res1);

        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularOperacao();
            }
        });

        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1.setText("");
                num2.setText("");
                res1.setText("Resultado:");
            }
        });
    }

    private void calcularOperacao() {
        double n1, n2;
        try {
            n1 = Double.parseDouble(num1.getText());
            n2 = Double.parseDouble(num2.getText());
        } catch (NumberFormatException ex) {
            res1.setText("Digite números válidos!");
            return;
        }

        double resultado = 0;
        switch (operacao) {
            case 'S':
                resultado = n1 + n2;
                break;
            case 'R':
                resultado = n1 - n2;
                break;
            case 'M':
                resultado = n1 * n2;
                break;
            case 'D':
                if (n2 == 0) {
                    res1.setText("Não é possível dividir por zero!");
                    return;
                }
                resultado = n1 / n2;
                break;
            default:
                res1.setText("Operação inválida!");
                return;
        }
        res1.setText("Resultado: " + resultado);
    }
}

class JanelaSobre extends JDialog {
    public JanelaSobre(JFrame parent) {
        super(parent, "Sobre", true);
        setLayout(new FlowLayout());
        setSize(300, 150);
        setLocationRelativeTo(parent);

        JLabel label = new JLabel(
                "<html>Nome: Antonio B. de Sena Neto<br>Turma: 2º ADS AMS<br>Data: 26/06/2025</html>");
        add(label);
    }
    
public static void main(String[] args) {
        Interface app = new Interface();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}