package ams;
public class DadosPessoais {
    private String nome;
    private int idade;
    private String sexo;
    private String interesses;
    private String estado_civil;
    public DadosPessoais() {
        this("", 0, "", "", "");
    }  
    public DadosPessoais(String nome, int idade, String sexo, String interesses, String estado_civil) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.interesses = interesses;
        this.estado_civil = estado_civil;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getInteresses() {
        return interesses;
    }
    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }
    public String getEstadoCivil() {
        return estado_civil;
    }
    public void setEstadoCivil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
    public String formatarDados() {
        return "Dados: \nNome: " + getNome().toUpperCase() + 
               "\nIdade: " + getIdade() + 
               "\nSexo: " + getSexo() + 
               "\nInteresses: " + getInteresses() + 
               "\nEstado Civil: " + getEstadoCivil();
    }
}