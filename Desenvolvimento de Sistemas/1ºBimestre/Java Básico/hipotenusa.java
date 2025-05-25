package com.mycompany.pj_26022025;

import javax.swing.JOptionPane;

public class hipotenusa {
        public static void main(String[] args) {
            
            double resultado = hipotenusa();
            JOptionPane.showMessageDialog(null, "A hipotenusa é aproximadamente: " + resultado);
            
    }
        public static double hipotenusa(){
            
           double bs = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da base?"));
           double alt = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da altura?"));
            
           double base = Math.pow(bs, 2);
           double altura = Math.pow(alt, 2);
           double hptns = Math.sqrt((base + altura));
           return hptns;
           
        }
}