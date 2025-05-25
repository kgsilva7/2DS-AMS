package com.mycompany.pj_26022025;

import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args) {

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua altura?"));
        String sexo = JOptionPane.showInputDialog("Qual é o seu sexo? (masculino/feminino)");
        
        double pesoIdeal = calcularPesoIdeal(altura, sexo);

        if(altura != 0 && sexo != " "){
            JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + pesoIdeal + " kg");
        }
        else{
            JOptionPane.showMessageDialog(null, "Inválido");
        }
        
    }

    public static double calcularPesoIdeal(double h, String genero) {
        if (genero.equals("masculino")) {
            return (72.7 * h) - 58;
        } else if (genero.equals("feminino")) {
            return (62.1 * h) - 44.7;
        }
        return 0;
    }
}    