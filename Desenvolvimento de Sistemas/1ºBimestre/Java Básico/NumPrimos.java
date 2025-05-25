package com.mycompany.pj_26022025;

import javax.swing.JOptionPane;

public class NumPrimos {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        boolean Primo = NumeroPrimo(num);
        
        if(Primo == true){
            JOptionPane.showMessageDialog(null, "Este número é primo");
        }
        else{
            JOptionPane.showMessageDialog(null, "Este número não é primo");
        }
        
    }
    public static boolean NumeroPrimo(int n){
        
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
       
        for(int i = 3; n - 1 > i; i++){
            if(n % i == 0){
              return false;
            }
        }
        return true;
        
    }
}  