import entities.Cliente;
import entities.Colaborador;
import entities.Fornecedor;

public class Program {
    public static void main(String[] args) {

        Fornecedor f1 = new Fornecedor(
                "Caloi",
                "69.461.569/0001-50",
                "Pedro Henrique"
        );

        Cliente cli1 = new Cliente(
                "Renan",
                "email@email.com",
                "14 99656-3654",
                "111.222.333-00",
                1
        );

        Colaborador cob1 = new Colaborador(
                "Jeferson",
                "email@email.com",
                "14 99656-3654",
                "444.555.666-99",
                1,
                "CLT",
                "05-02-2019"
        );

        System.out.println("Informações sobre o Colaborador");
        System.out.println("Nome do Cliente: "+cob1.getNome());
        System.out.println("Matricula do Colaborador: "+cob1.getMatricula());
        System.out.println("Forma de Contrato: "+cob1.getFormaContrato());
        System.out.println("Data de Admissão: "+cob1.getDataAdmissao());
        cob1.setDesconto(2000.00);
        System.out.println("Desconto Adquirido: "+cob1.getDesconto());

        System.out.println("Informações sobre o Cliente");
        System.out.println("Nome do Cliente: "+cli1.getNome());
        System.out.println("Registro do Cliente: "+cli1.getRegistro());
        cli1.setCashback(2000.00);
        System.out.println("CashBack Adquirido: "+cli1.getCashback());


        f1.cadastrar("Peca", "Quadro");
        f1.cadastrar("Garantia", "3 Anos");
        f1.cadastrar("Caloi");
        System.out.println(f1.consulta("Peca"));
        System.out.println(f1.consulta("Garantia"));

        f1.cadastrar("Modelo", "Aluminio");
        f1.cadastrar("Garantia", "1 Anos");
        f1.cadastrar("Houston Bike");
        System.out.println(f1.consulta("Modelo"));
        System.out.println(f1.consulta("Garantia"));

    }
}
