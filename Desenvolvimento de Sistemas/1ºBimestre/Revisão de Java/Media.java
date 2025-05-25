import javax.swing.JOptionPane; 

public class Media { 

    public static void main(String[] args) {

        String nome;  //String para armazenar o nome do usuário.
        double n1 = 0, n2 = 0, n3 = 0, n4 = 0;  //Variáveis para armazenar as 4 notas (inicializadas com 0).

        //Solicita ao usuário o nome no output.
        nome = JOptionPane.showInputDialog("Primeiramente, qual o seu nome?");

        //Solicita ao usuário a primeira nota através de uma caixa de diálogo.
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota para descobrir sua média em matemática:"));
        
        //Solicita a segunda nota do usuário.
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua segunda nota para descobrir sua média em matemática:"));

        //Solicita a terceira nota do usuário.
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua terceira nota para descobrir sua média em matemática:"));

        //Solicita a quarta nota do usuário.
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua quarta nota para descobrir sua média em matemática:"));

        //Calcula a média das quatro notas, que é a soma das notas dividida pela quantidade.
        double media = (n1 + n2 + n3 + n4) / 4;

        JOptionPane.showMessageDialog(null, "O seu nome é: " + nome);

        JOptionPane.showMessageDialog(null, "A sua média na matéria de matemática é de: " + media);
    }
}
