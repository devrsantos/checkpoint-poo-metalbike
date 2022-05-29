package entities;

public class Pessoa {
    private String nome;
    private String email;
    private String contato;
    private String cpf;
    private double cashback;
    private double desconto;

    public Pessoa(String nome, String email, String contato, String cpf) {
        this.nome = nome;
        this.email = email;
        this.contato = contato;
        this.cpf = cpf;
    }

    public double getCashback() {
        return cashback;
    }

    public double setCashback(double valorCompra) {
        if (valorCompra >= 1000.00) {
            this.cashback = (valorCompra / 100) * 5;
            return this.cashback;
        }
        if (valorCompra < 1000.00) {
            this.cashback = (valorCompra / 100) * 3;
            return this.cashback;
        }
        else {
            return 0; // Converter 0 para Null
        }
    }

    public double getDesconto() {
        return desconto;
    }

    public double setDesconto(double valorCompra) {
        if (valorCompra >= 1000.00) {
            this.desconto = (valorCompra / 100) * 15;
            return this.desconto;
        }
        if (valorCompra < 1000.00) {
            this.desconto = (valorCompra / 100) * 10;
            return this.desconto;
        }
        else {
            return 0; // Converter 0 para Null
        }
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
                ", cashback=" + cashback +
                ", desconto=" + desconto +
                '}';
    }
}
