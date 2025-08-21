package ams;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Cadastro extends JFrame {
    private JTextField txtNom = new JTextField();
    private JTextField txtMatric = new JTextField();
    private JTextField txtRestr = new JTextField();
    private JComboBox<String> lstPeriodo = new JComboBox<>(new String[]{"Matutino", "Vespertino", "Noturno"});
    private JRadioButton rdbEtim = new JRadioButton("Etim");
    private JRadioButton rdbMtec = new JRadioButton("Mtec");
    private JRadioButton rdbTecnico = new JRadioButton("Técnico");
    private ButtonGroup bgCurso = new ButtonGroup();
    private JRadioButton rdb1s = new JRadioButton("1ª série");
    private JRadioButton rdb2s = new JRadioButton("2ª série");
    private JRadioButton rdb3s = new JRadioButton("3ª série");
    private ButtonGroup bgSerie = new ButtonGroup();
    private final JButton btnLimpar = new JButton("Limpar");
    private final JButton btnApresentar = new JButton("Apresentar Dados");
    private final JButton btnSair = new JButton("Sair");
    public Cadastro() {
        setTitle("Formulário de Cadastro");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        JLabel lblTitulo = new JLabel("Dados Cadastrais do Aluno");
        lblTitulo.setBounds(120, 10, 200, 20);
        add(lblTitulo);
        addComponente(new JLabel("Nome:"), 20, 50, 100, 20);
        txtNom.setBounds(130, 50, 200, 20);
        add(txtNom);       
        addComponente(new JLabel("Matrícula:"), 20, 80, 100, 20);
        txtMatric.setBounds(130, 80, 100, 20);
        add(txtMatric);   
        addComponente(new JLabel("Curso:"), 20, 120, 100, 20);
        configurarRadios(rdbEtim, 130, 120);
        configurarRadios(rdbMtec, 230, 120);
        configurarRadios(rdbTecnico, 330, 120);
        bgCurso.add(rdbEtim);
        bgCurso.add(rdbMtec);
        bgCurso.add(rdbTecnico);      
        addComponente(new JLabel("Série:"), 20, 160, 100, 20);
        configurarRadios(rdb1s, 130, 160);
        configurarRadios(rdb2s, 230, 160);
        configurarRadios(rdb3s, 330, 160);
        bgSerie.add(rdb1s);
        bgSerie.add(rdb2s);
        bgSerie.add(rdb3s);    
        addComponente(new JLabel("Período:"), 20, 200, 100, 20);
        lstPeriodo.setBounds(130, 200, 120, 20);
        add(lstPeriodo);      
        addComponente(new JLabel("Restrições Médicas:"), 20, 240, 150, 20);
        txtRestr.setBounds(150, 240, 200, 20);
        add(txtRestr);
        btnLimpar.setBounds(50, 300, 120, 30);
        btnApresentar.setBounds(180, 300, 150, 30);
        btnSair.setBounds(150, 350, 100, 30);       
        add(btnLimpar);
        add(btnApresentar);
        add(btnSair);
        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtNom.setText("");
                txtMatric.setText("");
                txtRestr.setText("");
                bgCurso.clearSelection();
                bgSerie.clearSelection();
                lstPeriodo.setSelectedIndex(0);
            }
        });
        btnApresentar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomee = txtNom.getText();
                String matrice = txtMatric.getText();
                String restre = txtRestr.getText();
                String perioe = lstPeriodo.getSelectedItem().toString();
                String cursoe = "";
                if(rdbEtim.isSelected()) cursoe = "Etim";
                else if(rdbMtec.isSelected()) cursoe = "Mtec";
                else if(rdbTecnico.isSelected()) cursoe = "Técnico";  
                String seriee = "";
                if(rdb1s.isSelected()) seriee = "1ª série";
                else if(rdb2s.isSelected()) seriee = "2ª série";
                else if(rdb3s.isSelected()) seriee = "3ª série";
                Mostrar mostra = new Mostrar(nomee, matrice, restre, perioe, cursoe, seriee);
                mostra.setVisible(true);
                dispose();
            }
        });
         btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    private void addComponente(JComponent comp, int x, int y, int w, int h) {
        comp.setBounds(x, y, w, h);
        add(comp);
    }
    private void configurarRadios(JRadioButton radio, int x, int y) {
        radio.setBounds(x, y, 100, 20);
        add(radio);
    } 
public static void main(String[] args) {
    Cadastro cadastro = new Cadastro();
    cadastro.setVisible(true);
}
}