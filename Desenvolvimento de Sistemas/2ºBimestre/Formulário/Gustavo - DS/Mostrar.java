package ams;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Mostrar extends JFrame {
    private final JLabel lblNome = new JLabel();
    private final JLabel lblmatric = new JLabel();
    private final JLabel lblcurso = new JLabel();
    private final JLabel lblserie = new JLabel();
    private final JLabel lblperiod = new JLabel();
    private final JLabel lblrestr = new JLabel();
    private final JButton btnVoltar = new JButton("Voltar");
    private final JButton btnSair = new JButton("Sair");
    public Mostrar(String nome, String matr, String restr, String period, String curso, String serie) {
        setTitle("Dados Cadastrais");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        addComponente(new JLabel("Nome:"), 20, 20, 100, 20);
        lblNome.setBounds(130, 20, 200, 20);
        add(lblNome);      
        addComponente(new JLabel("Matrícula:"), 20, 50, 100, 20);
        lblmatric.setBounds(130, 50, 100, 20);
        add(lblmatric);     
        addComponente(new JLabel("Curso:"), 20, 80, 100, 20);
        lblcurso.setBounds(130, 80, 100, 20);
        add(lblcurso);   
        addComponente(new JLabel("Série:"), 20, 110, 100, 20);
        lblserie.setBounds(130, 110, 100, 20);
        add(lblserie);   
        addComponente(new JLabel("Período:"), 20, 140, 100, 20);
        lblperiod.setBounds(130, 140, 100, 20);
        add(lblperiod);     
        addComponente(new JLabel("Restrições Médicas:"), 20, 170, 150, 20);
        lblrestr.setBounds(150, 170, 180, 20);
        add(lblrestr);
        btnVoltar.setBounds(50, 220, 100, 30);
        btnSair.setBounds(180, 220, 100, 30);       
        add(btnVoltar);
        add(btnSair);
        lblNome.setText(nome);
        lblmatric.setText(matr);
        lblrestr.setText(restr);
        lblperiod.setText(period);
        lblcurso.setText(curso);
        lblserie.setText(serie);
        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cadastro cadastro = new Cadastro();
                cadastro.setVisible(true);
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
}