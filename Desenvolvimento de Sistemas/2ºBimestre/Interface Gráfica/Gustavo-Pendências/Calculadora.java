package ams;
public class Calculadora {
    private double valor1;
    private double valor2;
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    public double somar() {
        return valor1 + valor2;
    }
    public double subtrair() {
        return valor1 - valor2;
    }
    public double multiplicar() {
        return valor1 * valor2;
    }
    public double dividir() {
        if (valor2 == 0) throw new ArithmeticException("Divisão por zero");
        return valor1 / valor2;
    }
}