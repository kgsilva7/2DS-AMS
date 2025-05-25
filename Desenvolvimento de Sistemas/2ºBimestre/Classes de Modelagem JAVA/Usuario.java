public class Usuario {
    private String nome;
    private String email;
    private String login;
    private String senha;
    public Usuario() {
        this("", "", "", "");
    }
    public Usuario(String email, String login, String nome, String senha) {
        this.email = email;
        this.login = login;
        this.nome = nome;
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void provarExistencia() {
        System.out.println("Oi, eu existo!");
    }
}