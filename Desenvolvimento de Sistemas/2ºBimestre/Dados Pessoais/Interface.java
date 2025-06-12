package ams;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Interface extends JFrame {
    private final JTextField campoNome;
    private final JTextField campoIdade;
    private final JRadioButton radioMasculino;
    private final JRadioButton radioFeminino;
    private final JCheckBox checkEsportes;
    private final JCheckBox checkMusica;
    private final JCheckBox checkTecnologia;
    private final JComboBox<String> comboEstadoCivil;
    private final JButton botaoLimpar;
    private final JButton botaoEnviar;
    private final JLabel labelResultado;
    public Interface() {
        super("Formulário de Dados Pessoais");
        Container tela = getContentPane();
        tela.setLayout(null);
        setSize(550, 550);
        setResizable(false);      
        JLabel labelNome = new JLabel("Nome:");
        campoNome = new JTextField();
        JLabel labelIdade = new JLabel("Idade:");
        campoIdade = new JTextField();
        JLabel labelSexo = new JLabel("Sexo:");
        radioMasculino = new JRadioButton("Masculino");
        radioFeminino = new JRadioButton("Feminino");
        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(radioMasculino);
        grupoSexo.add(radioFeminino);       
        JLabel labelInteresses = new JLabel("Interesses:");
        checkEsportes = new JCheckBox("Esportes");
        checkMusica = new JCheckBox("Música");
        checkTecnologia = new JCheckBox("Tecnologia");     
        JLabel labelEstadoCivil = new JLabel("Estado Civil:");
        String[] estados = {"Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)"};
        comboEstadoCivil = new JComboBox<>(estados);    
        botaoLimpar = new JButton("Limpar Dados");
        botaoEnviar = new JButton("Enviar Dados");
        JLabel labelRodape = new JLabel("Desenvolvido por Gustavo Alexandre 2ºAMS");
        labelResultado = new JLabel();
        labelNome.setBounds(50, 30, 100, 20);
        campoNome.setBounds(150, 30, 200, 25);
        labelIdade.setBounds(50, 70, 100, 20);
        campoIdade.setBounds(150, 70, 50, 25);
        labelSexo.setBounds(50, 110, 100, 20);
        radioMasculino.setBounds(150, 110, 100, 20);
        radioFeminino.setBounds(250, 110, 100, 20);
        labelInteresses.setBounds(50, 150, 100, 20);
        checkEsportes.setBounds(150, 150, 100, 20);
        checkMusica.setBounds(150, 180, 100, 20);
        checkTecnologia.setBounds(150, 210, 100, 20);
        labelEstadoCivil.setBounds(50, 250, 100, 20);
        comboEstadoCivil.setBounds(150, 250, 150, 25);
        botaoLimpar.setBounds(100, 300, 120, 30);
        botaoEnviar.setBounds(250, 300, 120, 30);
        labelResultado.setBounds(2, 330, 500, 85);
        labelRodape.setBounds(100, 400, 250, 30);
        radioMasculino.setMnemonic(KeyEvent.VK_M);
        radioFeminino.setMnemonic(KeyEvent.VK_F);
        botaoLimpar.setMnemonic(KeyEvent.VK_L);
        botaoEnviar.setMnemonic(KeyEvent.VK_E);
        botaoLimpar.setToolTipText("Limpar os campos do formulário");
        botaoEnviar.setToolTipText("Exibe os dados");
        tela.add(labelNome);
        tela.add(campoNome);
        tela.add(labelIdade);
        tela.add(campoIdade);
        tela.add(labelSexo);
        tela.add(radioMasculino);
        tela.add(radioFeminino);
        tela.add(labelInteresses);
        tela.add(checkEsportes);
        tela.add(checkMusica);
        tela.add(checkTecnologia);
        tela.add(labelEstadoCivil);
        tela.add(comboEstadoCivil);
        tela.add(botaoLimpar);
        tela.add(botaoEnviar);
        tela.add(labelResultado);
        tela.add(labelRodape);
        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limparDados();
            }
        });
        
        botaoEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enviarDados();
            }
        });
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void limparDados() {
        campoNome.setText("");
        campoIdade.setText("");
        radioMasculino.setSelected(false);
        radioFeminino.setSelected(false);
        checkEsportes.setSelected(false);
        checkMusica.setSelected(false);
        checkTecnologia.setSelected(false);
        comboEstadoCivil.setSelectedIndex(0);
        labelResultado.setText("");
        campoNome.requestFocus();
    }
    private void enviarDados() {
        try {
            String nome = campoNome.getText();
            if (nome.isEmpty()) {
                throw new IllegalArgumentException("Nome não pode ser vazio!");
            } 
            int idade = Integer.parseInt(campoIdade.getText());
            if (idade <= 0) {
                throw new IllegalArgumentException("Idade inválida!");
            }   
            String sexo = "";
            if (radioMasculino.isSelected()) {
                sexo = "Masculino";
            } else if (radioFeminino.isSelected()) {
                sexo = "Feminino";
            } else {
                throw new IllegalArgumentException("Selecione um sexo!");
            }    
            StringBuilder interesses = new StringBuilder();
            if (checkEsportes.isSelected()) {
                interesses.append("Esportes");
            }
            if (checkMusica.isSelected()) {
                if (interesses.length() > 0) interesses.append(", ");
                interesses.append("Música");
            }
            if (checkTecnologia.isSelected()) {
                if (interesses.length() > 0) interesses.append(", ");
                interesses.append("Tecnologia");
            }    
            String estadoCivil = (String) comboEstadoCivil.getSelectedItem();
            DadosPessoais dados = new DadosPessoais();
            dados.setNome(nome);
            dados.setIdade(idade);
            dados.setSexo(sexo);
            dados.setInteresses(interesses.toString());
            dados.setEstadoCivil(estadoCivil);    
            labelResultado.setText(dados.formatarDados());
            JOptionPane.showMessageDialog(
                this, 
                dados.formatarDados(), 
                "Dados Pessoais", 
                JOptionPane.INFORMATION_MESSAGE
            );
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                this, 
                "Idade inválida! Digite um número inteiro positivo.", 
                "Erro", 
                JOptionPane.ERROR_MESSAGE
            );
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(
                this, 
                ex.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    public static void main(String[] args) {
        new Interface();
    }
}