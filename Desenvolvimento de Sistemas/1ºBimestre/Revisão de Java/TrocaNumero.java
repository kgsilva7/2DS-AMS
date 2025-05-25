import javax.swing.JOptionPane;

public class TrocaNumero {

    public static void main(String[] args) { 

        //Declaração da variável Troca, usada para armazenar temporariamente um dos números durante a troca.
        int Troca = 0;

        //Solicita ao usuário o primeiro número (NumA) e o armazena, convertendo a entrada para inteiro.
        int NumA = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro:"));
        
        //Solicita ao usuário o segundo número (NumB) e o armazena, convertendo a entrada para inteiro.
        int NumB = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número inteiro:"));
        
        //A variável "Troca" recebe o valor de NumA, para que ele possa ser trocado depois.
        Troca = NumA;
        
        //A variável "NumA" recebe o valor de NumB, realizando a troca de valores entre as variáveis.
        NumA = NumB;

        //Verifica se os dois números são iguais.
        if (Troca == NumA) {
            //Exibe uma mensagem indicando que os números são iguais e, portanto, não há troca.
            JOptionPane.showInputDialog(null, "Não é possível trocar os valores, visto que ambos números têm o mesmo valor.");
        }
        
        //Se os números forem diferentes, entra no else e exibe as novas variáveis trocadas.
        else if (Troca != NumA) {
            JOptionPane.showMessageDialog(null, "Prossiga para ver se os números foram trocados.");
            //Exibe o novo valor de "NumA", que agora é o valor de "NumB".
            JOptionPane.showMessageDialog(null, "Novo valor do número A: " + NumA + ".");
            //Exibe o novo valor de "NumB", que agora é o valor anterior de "NumA" (armazenado em "Troca").
            JOptionPane.showMessageDialog(null, "Novo valor do número B: " + Troca + ".");
        }
    }
}
