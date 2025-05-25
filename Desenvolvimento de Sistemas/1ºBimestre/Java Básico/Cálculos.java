package com.mycompany.pj_26022025;

import javax.swing.JOptionPane;

public class Cálculos {
    public static void main(String[] args) {
        int opcao;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
            "1 – Soma\n" +
            "2 – Subtração\n" +
            "3 – Divisão\n" +
            "4 – Multiplicação\n" +
            "5 – Resto da Divisão\n" +
            "6 – Dobro\n" +
            "7 – Quadrado\n" +
            "8 – Cubo\n" +
            "9 – Raiz Quadrada\n" +
            "0 – Sair"
        ));
            
        switch(opcao){
            case 1:
                calculos2Num('+');
                break;
            case 2:
                calculos2Num('-');
                break;
            case 3:
                calculos2Num('/');
                break;
            case 4:
                calculos2Num('*');
                break;
            case 5:
                calculos2Num('%');
                break;
            case 6:
                calculos1Num("Dobro");
                break;
            case 7:
                calculos1Num("Quadrado");
                break;
            case 8:
                calculos1Num("Cubo");
                break;
            case 9:
                RaizQuadrada();
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Progama Encerrado!!");
                break;
        }        
        if(opcao > 9 || opcao < 0){
            JOptionPane.showMessageDialog(null, "Inválido");
        }            
            
    } while( opcao != 0);

    }
    public static void calculos2Num(char option){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        double res = 0;
        
        switch (option){
            case '+':
            res = n1 + n2;
            break;
            case '-':
            res = n1 - n2;
            break;
            case '/':
            if(n2 != 0){
                res = n1/n2;
            }
            else{
                JOptionPane.showMessageDialog(null, "IMPOSSIVEL DIVIDIR POR ZERO");
            }
            break;
            case '*':
            res = n1*n2;
            break;
            case '%':
            res = n1%n2;
            break;
    }
    JOptionPane.showMessageDialog(null, "Resultado: " + res);
}
    public static void calculos1Num(String operador){
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        double res = 0;
        
        switch(operador){
            case "Dobro":
            res = num*2;
            break;
            case "Quadrado":
            res = Math.pow(num, 2);
            break;
            case "Cubo":
            res = Math.pow(num, 3);
            break;   
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + res);
    }
    public static void RaizQuadrada(){
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        
        if (num >= 0) {
            double res = Math.sqrt(num);
            JOptionPane.showMessageDialog(null, "Resultado: " + res);
        } else {
            JOptionPane.showMessageDialog(null, "Não é possivel calcular raiz quadrada de número negativo");
        }
    }
}