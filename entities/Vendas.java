package entities;

public class Vendas extends Pessoa{
    public double valorProduto;
    public double valorFinal;
    public boolean clubeVantagens;
    private double cashback;
    private double desconto;

    public Vendas(double valorProduto, boolean clubeVantagens) {
        this.valorProduto = valorProduto;
        this.clubeVantagens = clubeVantagens;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public boolean isClubeVantagens() {
        return clubeVantagens;
    }

    public void setClubeVantagens(boolean clubeVantagens) {
        this.clubeVantagens = clubeVantagens;
    }

    public double getCashback() {
        return cashback;
    }

    public double setCashback(double valorCompra, boolean clubeVantagens) {
        int adicionalCashback = 0;
        if (clubeVantagens) {
            adicionalCashback = 2;
        }
        if (valorCompra >= 1000.00) {
            int porcCashback = 5 + adicionalCashback;
            this.cashback = (valorCompra / 100) * porcCashback;
            return this.cashback;
        }
        if (valorCompra < 1000.00) {
            int porcCashback = 3 + adicionalCashback;
            this.cashback = (valorCompra / 100) * porcCashback;
            return this.cashback;
        }
        return this.cashback;
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
        return this.desconto;
    }

    public double venda(double valorProduto, boolean clubeVantagens, int categoria) {
        if (categoria == 1) {
            this.valorFinal = valorProduto;
            setCashback(valorProduto, clubeVantagens);
            return this.valorFinal;
        } else if (categoria == 2) {
            double valorDesconto = setDesconto(valorProduto);
            setCashback(0, false);
            this.valorFinal = (valorProduto - valorDesconto);
            return this.valorFinal;
        }
        return this.valorFinal;
    }

    public String mensagem() {
        String msg = "VENDA FINALIZADA\n" +
                "Valor Cashback: " + getCashback() + "\n"+
                "Valor Desconto: " + getDesconto() + "\n"+
                "Valor Total: " + this.valorFinal + "\n";
        return msg;
    }
}
