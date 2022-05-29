package entities;

public class Cliente extends Pessoa {
    private int registro;

    public Cliente(
            String nome,
            String email,
            String contato,
            String cpf,
            int registro
    ) {
        super(nome, email, contato, cpf);
        this.registro = registro;
    }

    public int getRegistro() {
        return registro;
    }
}
