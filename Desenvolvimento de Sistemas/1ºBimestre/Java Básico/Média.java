package com.mycompany.pj_26022025;

import javax.swing.JOptionPane;

public class Média {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        double n1 = lernota();
        double n2 = lernota();
        double media = calcularMedia(n1, n2);
        
        if (media >= 7.0) {
            JOptionPane.showMessageDialog(null, "O aluno " + nome + " foi aprovado com uma média de: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "O aluno " + nome + " foi reprovado com uma média de: " + media);
        }
}
    
    public static double lernota(){
        double nt = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
        return nt;
    }

    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
}