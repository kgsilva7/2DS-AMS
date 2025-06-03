import javax.swing.JOptionPane;
public class Calculadora {
    private double numero1;
    private double numero2;
    private double resultado;

    public Calculadora() {
        this(0, 0, 0);
    }
    public Calculadora(double numero1, double numero2, double resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }
    public double getNumero1() {
        return numero1;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public double getNumero2() {
        return numero2;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public void somar() {
        this.setNumero1(Double.parseDouble(JOptionPane.showInputDialog("Escreva o primeiro número: ")));
        this.setNumero2(Double.parseDouble(JOptionPane.showInputDialog("Escreva o segundo número: ")));
        this.setResultado(this.getNumero1() + this.getNumero2());
        JOptionPane.showMessageDialog(null, "A soma é:\n" + getResultado());
    }
    public void subtrair(double a, double b) {
        this.setNumero1(a);
        this.setNumero2(b);
        this.setResultado(this.getNumero1() - this.getNumero2());
        JOptionPane.showMessageDialog(null, "A subtração é:\n" + getResultado());
    }
    public double multiplicar() {
        this.setNumero1(Double.parseDouble(JOptionPane.showInputDialog("Escreva o primeiro número: ")));
        this.setNumero2(Double.parseDouble(JOptionPane.showInputDialog("Escreva o segundo número: ")));
        this.setResultado(this.getNumero1() * this.getNumero2());
        return getResultado();
    }
    public double dividir(double a, double b) {
        this.setNumero1(a);
        this.setNumero2(b);
        this.setResultado(this.getNumero1() / this.getNumero2());
        return this.getResultado();
    }
}