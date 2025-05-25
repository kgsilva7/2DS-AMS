import javax.swing.JOptionPane; 

public class ExercicioExtra {

    public static void main(String[] args) {  

        JOptionPane.showMessageDialog(null, "Olá, professora! Me chamo Felipe Vivêncio e tenho 17 anos.");

        //Pede a idade e armazena na variável "idade", convertendo a entrada para um inteiro.
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Primeiramente, gostaria de saber sua idade. Por favor, informe-a:"));

        //Pede o nome da professora e armazena na variável "nome".
        String nome = JOptionPane.showInputDialog("Ok. E qual é o seu primeiro nome?");
        
        JOptionPane.showMessageDialog(null, "Perfeito, professora " + nome + "! Agora, iremos fazer um jogo.");
        
        //Exibe uma mensagem. O número máximo será a idade informada pela professora.
        JOptionPane.showMessageDialog(null, "Quero que a senhora pense em um número entre 1 e " + idade + ", e eu vou tentar adivinhar.");

        //Inicializa as variáveis que definem o intervalo de números possíveis. O "min" é o valor mínimo (1) e "max" é o valor máximo (que é idade digitada).
        int min = 1;
        int max = idade;
        int tentativa;  //Variável que vai armazenar o valor que o programa tentará adivinhar.
        String resposta;  //Variável que vai armazenar a resposta da professora.

        //Um loop que vai continuar até o intervalo ser reduzido a um único número
        while (min <= max) {  
            tentativa = (min + max) / 2;  //O código adivinha o número no meio do intervalo atual.
            
            //Pede à professora para dizer se o número é maior, menor ou se o número no output está certo.
            resposta = JOptionPane.showInputDialog("O número que você pensou é " + tentativa + "? Digite 'maior', 'menor' ou 'sim'");

            //Caso a professora tenha respondido "sim", o código acerta e encerra o loop.
            if (resposta.equalsIgnoreCase("sim")) {
                JOptionPane.showMessageDialog(null, "Oba, consegui adivinhar! Então o número é " + tentativa + "!");
                break;  //Sai do loop após adivinhar.
            } 
            //Se a resposta for "maior", ajusta o valor mínimo.
            else if (resposta.equalsIgnoreCase("maior")) {
                min = tentativa + 1;  //Aumenta o valor mínimo do intervalo.
            } 
            //Se a resposta for "menor", ajusta o valor máximo.
            else if (resposta.equalsIgnoreCase("menor")) {
                max = tentativa - 1;  //Diminui o valor máximo do intervalo.
            } 
            else {
                JOptionPane.showMessageDialog(null, "Resposta inválida. Você deve digitar 'maior', 'menor' ou 'sim'.");
            }
        }

        JOptionPane.showMessageDialog(null, "Obrigado por jogar, professora " + nome + "!");
    }
}
