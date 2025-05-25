package provads;

import javax.swing.JOptionPane;

public class Exerc1 {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota (0 a 10)"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota (0 a 10)"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota (0 a 10)"));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a quarta nota (0 a 10)"));
        
        if(n1 <= 10 && n1 >= 0 && n2 <= 10 && n2 >= 0 && n3 <= 10 && n3 >= 0 && n4 <= 10 && n4 >= 0){
        double media = CalcularMédia(n1, n2, n3, n4);
        double maiorN = verificarMaior(n1, n2, n3, n4);
        double menorN = verificarMenor(n1, n2, n3, n4);
        
        JOptionPane.showMessageDialog(null,
                "Sua média foi: " + media + "\n"
                + "Sua maior nota foi: " + maiorN + "\n"
                + "Sua menor nota foi: " + menorN);
        }
        else{
            JOptionPane.showMessageDialog(null, "INVÁLIDO");
        }
    }
    
    public static double CalcularMédia(double nt1, double nt2, double nt3, double nt4){
        double med = (nt1 + nt2 + nt3 + nt4)/4;
        return med;
    }
    
    public static double verificarMaior(double nt1, double nt2, double nt3, double nt4){
        if(nt1 >= nt2 && nt1 >= nt3 && nt1 >= nt4){
            return nt1;
        }
        else if(nt2 >= nt1 && nt2 >= nt3 && nt2 >= nt4){
            return nt2;
        }
        else if(nt3 >= nt1 && nt3 >= nt2 && nt3 >= nt4){
            return nt3;
        }
        else{
            return nt4;
        }
    }
   
    public static double verificarMenor(double nt1, double nt2, double nt3, double nt4){
        if(nt1 <= nt2 && nt1 <= nt3 && nt1 <= nt4){
            return nt1;
        }
        else if(nt2 <= nt1 && nt2 <= nt3 && nt2 <= nt4){
            return nt2;
        }
        else if(nt3 <= nt1 && nt3 <= nt2 && nt3 <= nt4){
            return nt3;
        }
        else{
            return nt4;
        }
    }
    
}