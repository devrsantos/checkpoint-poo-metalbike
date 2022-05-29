import entities.Cliente;
import entities.Colaborador;
import entities.Fornecedor;
import entities.Vendas;

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

        Vendas v1 = new Vendas(2000.00, true);
        v1.venda(v1.getValorProduto(), v1.isClubeVantagens(), 1);
        System.out.println(v1.mensagem());
        v1.venda(v1.getValorProduto(), v1.isClubeVantagens(), 2);
        System.out.println(v1.mensagem());

    }
}
