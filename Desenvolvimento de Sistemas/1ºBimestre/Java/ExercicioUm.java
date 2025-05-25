import javax.swing.JOptionPane;

public class ExercicioUm {
    public static void main(String[] args) {
        
        double preco1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro preço do produto: "));
        double preco2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo preço do produto: "));
        double preco3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro preço do produto: "));
        double preco4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto preço do produto: "));
        
        double media = CalculoMedia(preco1, preco2, preco3, preco4);
        double maior = verificar(preco1, preco2, preco3, preco4);
        double menor = verificar2(preco1, preco2, preco3, preco4);
        
        JOptionPane.showMessageDialog(null, "A média do preço desse produto é de: R$ " +media);
        JOptionPane.showMessageDialog(null, "O maior preço do preço é de: R$ " +maior);       
        JOptionPane.showMessageDialog(null, "O menor preço do preço é de: R$ " +menor);
    }
    
    public static double verificar(double p1, double p2, double p3, double p4) {
        if (p1 > p2 && p1 > p3 && p1 > p4) {
            return p1;
        }
        
        else if (p2 > p1 && p2 > p3 && p2 > p4) {
            return p2;
    }
        
        else if (p3 > p1 && p3 > p2 && p3 > p4) {
            return p3;
        }
        
        else {
            return p4;
        }
    }
    
    public static double CalculoMedia(double p1, double p2, double p3, double p4) {
        
        return (p1 + p2 + p3 + p4) / 4;     
    }
    
    public static double verificar2(double p1, double p2, double p3, double p4) {
        
        if (p1 < p2 && p1 < p3 && p1 < p4) {
            return p1;
        }
        
        else if (p2 < p1 && p2 < p3 && p2 < p4) {
            return p2;
    }
        
        else if (p3 < p1 && p3 < p2 && p3 < p4) {
            return p3;
        }
        
        else {
            return p4;
        }
        
    }
}
