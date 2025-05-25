import javax.swing.JOptionPane; 

public class OrganizarNumero {

    public static void main(String[] args) {
        
        //Declaração das variáveis n1, n2 e n3 para armazenar os três números inteiros.
        int n1 = 0, n2 = 0, n3 = 0;

        //Solicita ao usuário o primeiro número e armazena o valor na variável n1.
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro de sua escolha:"));

        //Solicita ao usuário o segundo número e armazena o valor na variável n2.
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro de sua escolha:"));

        //Solicita ao usuário o terceiro número e armazena o valor na variável n3.
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número inteiro de sua escolha:"));

        //Verifica se todos os três números são iguais. Se sim, exibe uma mensagem de erro.
        if (n1 == n2 && n2 == n3) {
            JOptionPane.showMessageDialog(null, "Valores inválidos. Os três números são iguais.");
        } else {  //Caso contrário, entra na estrutura de decisão para organizar os números em ordem decrescente.
            
            //Verifica se o número n1 é o maior e os números estão em ordem decrescente: n1 >= n2 >= n3.
            if (n1 >= n2 && n1 >= n3 && n2 >= n3) {
                
                JOptionPane.showMessageDialog(null, "Números em ordem decrescente: " + n1 + ", " + n2 + ", " + n3 + ".");
            }
            //Verifica se o número n1 é o maior e n3 é maior que n2, formando a ordem: n1 >= n3 >= n2.
            else if (n1 >= n2 && n1 >= n3 && n3 >= n2) {
                
                JOptionPane.showMessageDialog(null, "Números em ordem decrescente: " + n1 + ", " + n3 + ", " + n2 + ".");
            }
            //Verifica se o número n2 é o maior e n1 é maior que n3, formando a ordem: n2 >= n1 >= n3.
            else if (n2 >= n1 && n2 >= n3 && n1 >= n3) {
                
                JOptionPane.showMessageDialog(null, "Números em ordem decrescente: " + n2 + ", " + n1 + ", " + n3 + ".");
            }
            //Verifica se o número n2 é o maior e n3 é maior que n1, formando a ordem: n2 >= n3 >= n1.
            else if (n2 >= n1 && n2 >= n3 && n3 >= n1) {
                
                JOptionPane.showMessageDialog(null, "Números em ordem decrescente: " + n2 + ", " + n3 + ", " + n1 + ".");
            }
            //Verifica se o número n3 é o maior e n1 é maior que n2, formando a ordem: n3 >= n1 >= n2.
            else if (n3 >= n1 && n3 >= n2 && n1 >= n2) {
                
                JOptionPane.showMessageDialog(null, "Números em ordem decrescente: " + n3 + ", " + n1 + ", " + n2 + ".");
            }
            //Caso nenhum dos casos anteriores aconteça, resta a ordem: n3 >= n2 >= n1
            else {
                
                JOptionPane.showMessageDialog(null, "Números em ordem decrescente: " + n3 + ", " + n2 + ", " + n1 + ".");
            }
        }
    }
}
