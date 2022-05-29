package entities;

public class Colaborador extends Pessoa{
    private int matricula;
    private String formaContrato;
    private String dataAdmissao;

    public Colaborador(
            String nome,
            String email,
            String contato,
            String cpf,
            int matricula,
            String formaContrato,
            String dataAdmissao
    ) {
        super(nome, email, contato, cpf);
        this.matricula = matricula;
        this.formaContrato = formaContrato;
        this.dataAdmissao = dataAdmissao;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getFormaContrato() {
        return formaContrato;
    }
    public String getDataAdmissao() {
        return dataAdmissao;
    }
}
