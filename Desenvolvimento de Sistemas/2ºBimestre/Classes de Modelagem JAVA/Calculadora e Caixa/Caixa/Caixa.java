package pj_09042025.Caixa;

import javax.swing.JOptionPane;

public class Caixa {
    private double saldo;
    
    public Caixa(){
        this(0.0);
    }
    
    public Caixa(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Entrar(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor para entrada"));
        this.setSaldo(this.saldo + valor);
    }
    public void Retirar(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor para retirada"));
        this.setSaldo(this.saldo - valor);
    }
}
