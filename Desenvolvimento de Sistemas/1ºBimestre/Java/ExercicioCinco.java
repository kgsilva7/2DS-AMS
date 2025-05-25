import javax.swing.JOptionPane;
        
public class ExercicioCinco {
    public static void main(String[] args) {
        
        double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do triângulo: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do triângulo: "));
        
        double hipotenusa = calculoHipotenusa(base, altura);
        
        JOptionPane.showMessageDialog(null, "A hipotenusa do triângulo é: " + hipotenusa + "." );
    }
    
    static double calculoHipotenusa(double base, double altura) {
            return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        }
}
