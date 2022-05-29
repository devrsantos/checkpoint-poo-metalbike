package entities;

public class Pessoa {
    String nome;
    private String email;
    private String contato;
    private String cpf;

    public Pessoa() {}
    public Pessoa(String nome, String email, String contato, String cpf) {
        this.nome = nome;
        this.email = email;
        this.contato = contato;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getContato() {
        return contato;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", contato='" + contato + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
