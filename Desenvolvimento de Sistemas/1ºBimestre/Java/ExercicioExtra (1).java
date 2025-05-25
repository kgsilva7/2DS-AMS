
import javax.swing.JOptionPane;

public class ExercicioExtra {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe o nome do jogador:");

        double pontuacao1 = lerPontuacao("Informe a pontuação da primeira partida:");
        double pontuacao2 = lerPontuacao("Informe a pontuação da segunda partida:");

        double media = calcularMedia(pontuacao1, pontuacao2);

        String resultado;
        if (media >= 50) {
            resultado = "Aprovado para o torneio.";
        } else {
            resultado = "Reprovado. Tente novamente.";
        }

        JOptionPane.showMessageDialog(null, "Jogador: " + nome
                + "\nMédia de pontos: " + media
                + "\nStatus: " + resultado);
    }

    public static double lerPontuacao(String mensagem) {
        return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
    }

    public static double calcularMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }
}
