
import javax.swing.JOptionPane;

public class ExercicioTres {

    public static void main(String[] args) {

        double h = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura (ex: 1.69) : "));
        String sexo = JOptionPane.showInputDialog("Informe seu gênero. Digite 'M' para masculino, 'F' para feminino: ");
        
        double pesoIdeal = calcularPesoIdeal(h, sexo);
        
        JOptionPane.showMessageDialog(null, "De acordo com o seu IMC, o seu peso ideal seria " + pesoIdeal + "kg.");

    }

    static double calcularPesoIdeal(double h, String sexo) {
        
        if (sexo.equals("M")) {
            return (72.7 * h) - 58;
        } else if (sexo.equals("F")) {
            return (62.1 * h) - 44.7;
        } else {
            JOptionPane.showMessageDialog(null, "Sexo inválido.");
            return 0;
        }
    }
}
