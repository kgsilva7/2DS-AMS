import javax.swing.JOptionPane;  

public class ComparaNumero {  

    public static void main(String[] args) {  

        //Declaração das variáveis que irão armazenar os números informados pelo usuário.
        double n1 = 0, n2 = 0;

        //Solicita ao usuário o primeiro número e armazena na variável n1, convertendo a entrada para tipo double.
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: "));
        
        //Solicita ao usuário o segundo número e armazena na variável n2, convertendo a entrada para tipo double.
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número: "));
        
        //Verifica se os dois números são iguais.
        if (n1 == n2) {
            // Se sim, exibe uma mensagem dizendo que os dois números são iguais e que não há ordem crescente/decrescente.
            JOptionPane.showMessageDialog(null, "Os dois números são iguais, portanto, não há ordem crescente/decrescente.");
        }
        
        // Caso os números não sejam iguais, entra nesta condição.
        else if (n1 > n2) {
            //Exibe uma mensagem dizendo que os números são diferentes entre si.
            JOptionPane.showMessageDialog(null, "Os números informados são diferentes um do outro.");
            //Exibe os números em ordem decrescente (n1 é maior que n2, então n1 vem antes).
            JOptionPane.showMessageDialog(null, "Números em ordem decrescente: " + n1 + " " + n2);
        }
    }
}
