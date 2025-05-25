import java.util.Scanner;

public class NumeroDecrescente {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        
        int numero = 0;  //Declara uma variável que armazenará o número digitado pelo usuário.
        
        //Exibe uma mensagem pedindo ao usuário para digitar um número inteiro.
        System.out.println("Digite um número inteiro: ");
        
        //Lê o número digitado pelo usuário e armazena na variável 'numero'.
        numero = ler.nextInt();
        
        //Laço 'while' que vai repetir enquanto o número for maior ou igual a zero.
        while (numero >= 0) {
            
            //Exibe o valor atual de 'numero'.
            System.out.println(numero);
            
            //Decrementa o valor de 'numero' em 1 a cada iteração, fazendo com que o número vá até 0 e depois termine o laço.
            numero--;
        }
    }
}
