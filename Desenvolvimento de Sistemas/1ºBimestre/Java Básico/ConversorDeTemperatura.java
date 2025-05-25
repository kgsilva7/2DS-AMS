package com.mycompany.pj_26022025;

import javax.swing.JOptionPane;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        
        double graus = Double.parseDouble(JOptionPane.showInputDialog("Qual é a temperatura?"));
        String tipo = JOptionPane.showInputDialog(
                "1 - C -> F\n" +
                "2 - F -> C"
        );
        switch(tipo){
            case "1":
                CelsiusParaFahrenheit(graus);
                break;
            case "2":
                FahrenheitParaCelsius(graus);
                break;
                
        }
    }
    
    public static void CelsiusParaFahrenheit(double C){
        
        double F = (C*9/5) + 32;
        JOptionPane.showMessageDialog(null, "O valor convertido de Celsius para Fahrenheit é: " + F);
    }
    
    public static void FahrenheitParaCelsius(double F){
        double C = (F - 32) * 5/9;
        JOptionPane.showMessageDialog(null, "O valor convertido de Fahrenheit para Celsius é: " + C);
        
    }
}
