import javax.swing.JOptionPane;

public class SomaMultipl {
    public static void main(String[] args) {
        
        int sImpares = 0;  //Variável para armazenar a soma dos números ímpares.
        int mPares = 1;  //Variável para armazenar a multiplicação dos números pares (começa com 1 para não afetar a multiplicação).

        //Laço que vai de 0 até 30.
        for (int i = 0; i <= 30; i++) {
            
            //Verifica se o número 'i' é par (divisível por 2).
            if (i % 2 == 0) {
                mPares *= i;  //Se for par, multiplica 'i' ao valor acumulado de 'mPares'.
            } else { 
                sImpares += i;  //Se for ímpar, soma 'i' ao valor acumulado de 'sImpares'.
            }
        }

        //Exibe a soma dos números ímpares entre 0 e 30.
        JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre 0 e 30 é: " + sImpares);

        //Exibe a multiplicação dos números pares entre 0 e 30.
        JOptionPane.showMessageDialog(null, "A multiplicação dos números pares entre 0 e 30 é: " + mPares);
    }
}
