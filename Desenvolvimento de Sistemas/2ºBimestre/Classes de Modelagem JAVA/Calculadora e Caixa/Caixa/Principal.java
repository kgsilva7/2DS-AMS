package pj_09042025.Caixa;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        Caixa cx1 = new Caixa();
        
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite: " + "\n"
                    + "1- Entrada" + "\n"
                    + "2- Retirada" + "\n"
                    + "3- Consultar Saldo" + "\n"
                    + "0- Sair"));
            
            switch(op){
                
                case 1:
                    cx1.Entrar();
                    break;
                case 2:
                    cx1.Retirar();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saldo Atual: " + cx1.getSaldo());     
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Inválido");
                    break;
            }
            
        } while(op != 0);
        
    }
    
}
