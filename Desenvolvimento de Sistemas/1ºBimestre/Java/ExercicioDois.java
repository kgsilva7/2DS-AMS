import javax.swing.JOptionPane;

public class ExercicioDois {
    public static void main(String[] args) {
        
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número real: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número real: "));
        
        double resultado = diferenca(num1, num2);
        
        JOptionPane.showMessageDialog(null, "A diferença dos números é: " + resultado);
                
    }
    
    static double diferenca(double num3, double num4) 
    {
        
        if (num3 > num4) {
           return num3 - num4;
        }
        
        else {
            return num4 - num3;
        }
    }
}
