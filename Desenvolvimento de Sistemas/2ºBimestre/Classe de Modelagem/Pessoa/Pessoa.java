package pessoa;
import javax.swing.JOptionPane;
public class Pessoa {
    public static void main(String[] args) {
    }
    private String nome;
    private String endereco;
    private double salario;
    private String telefone;
    private String email;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, double salario, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inserirDadosPessoa() {
        setNome(JOptionPane.showInputDialog("Digite o nome:"));
        setEndereco(JOptionPane.showInputDialog("Digite o endereço:"));

        try {
            setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:")));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Salário inválido. Será definido como 0.");
            setSalario(0.0);
        }

        setTelefone(JOptionPane.showInputDialog("Digite o telefone:"));
        setEmail(JOptionPane.showInputDialog("Digite o e-mail:"));
    }

    public void apresentarPessoa() {
        String mensagem = "=== Dados da Pessoa ===\n";
        mensagem += "Nome: " + getNome() + "\n";
        mensagem += "Endereço: " + getEndereco() + "\n";
        mensagem += "Salário: R$ " + getSalario() + "\n";
        mensagem += "Telefone: " + getTelefone() + "\n";
        mensagem += "Email: " + getEmail();

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
  
