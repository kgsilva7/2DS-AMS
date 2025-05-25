import javax.swing.JOptionPane;

public class ExercicioUm {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Informe o nome do aluno:");
        String materia = JOptionPane.showInputDialog("Informe qual o nome da matéria desejada para descobrir a média:"); // Informação adicional.
        double nota1 = lerNota("Informe a primeira nota:");
        double nota2 = lerNota("Informe a segunda nota:");
        
        double media = calcularMedia(nota1, nota2);
        
        String resultado = (media >= 7.0) ? "Aprovado" : "Reprovado";
        JOptionPane.showMessageDialog(null, "Aluno: " + nome + "\nMatéria: " + materia + " \nMédia: " + media + "\nStatus: " + resultado);
    }

    static double lerNota(String mensagem) {
        return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
    }

    static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
}
