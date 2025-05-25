package com.mycompany.pj_26022025;

import javax.swing.JOptionPane;

public class Diferença {
    
    public static void main(String[] args) {
        
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

        diferenca(num1, num2);
}
    public static void diferenca(double n1, double n2){
        
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "A diferença entre os números é: " + (n1 - n2));
        }
        else if(n2 > n1) {
            JOptionPane.showMessageDialog(null, "A diferença entre os números é: " + (n2 - n1));
        }
        else{
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        }
    }
}