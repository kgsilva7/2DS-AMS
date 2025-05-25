import javax.swing.JOptionPane;

public class ExercicioQuatro {

    public static void main(String[] args) {
        int escolha;
        
        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    "1- Soma\n"
                    + "2- Subtração\n"
                    + "3- Divisão\n"
                    + "4- Multiplicação\n"
                    + "5- Resto da Divisão\n"
                    + "6- Dobro\n"
                    + "7- Quadrado\n"
                    + "8- Cubo\n"
                    + "9- Raiz Quadrada\n"
                    + "0- Sair"
            ));
            
            switch (escolha) {
                case 1:
                    MatBásica('+');
                    break;
                case 2:
                    MatBásica('-');
                    break;
                case 3:
                    MatBásica('/');
                    break;
                case 4:
                    MatBásica('*');
                    break;
                case 5:
                    MatBásica('%');
                    break;
                case 6:
                    MatAvan("Dobro");
                    break;
                case 7:
                    MatAvan("Quadrado");
                    break;
                case 8:
                    MatAvan("Cubo");
                    break;
                case 9:
                    Raiz();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando Programa!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
            
        } while (escolha != 0);
    }

    static void MatBásica(char opdr) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número:"));
        double resultado = 0;

        switch (opdr) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '/':
                resultado = n1 / n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '%':
                resultado = n1 % n2;
                break;
        }
        
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
    }

    static void MatAvan(String opdr) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Insira o número:"));
        double resultado = 0;

        switch (opdr) {
            case "Dobro":
                resultado = n * 2;
                break;
            case "Quadrado":
                resultado = Math.pow(n, 2);
                break;
            case "Cubo":
                resultado = Math.pow(n, 3);
                break;
        }
        
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
    }

    static void Raiz() {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Insira o número:"));

        if (n >= 0) {
            double resultado = Math.sqrt(n);
            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido. A raiz quadrada de um número negativo não é real.");
        }
    }
}
