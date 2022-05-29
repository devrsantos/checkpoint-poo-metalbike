package entities;

public class Fornecedor extends Produto{
    public String razaoSocial;
    public String cnpj;
    public String representanteComercial;

    public Fornecedor(String razaoSocial, String cnpj, String representanteComercial) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.representanteComercial = representanteComercial;
    }

    public String consulta(String params) {
        if (params == "Peca") {
            String resp = "Tipo da Peça: " + getPecas() + " do fabricante: " + getFabricante();
            return resp;
        }
        if (params == "Modelo") {
            String resp = "Modelo da Peça: " + getModelo() + " do fabricante: " + getFabricante();
            return resp;
        }
        if (params == "Garantia") {
            String resp = "Garantia da Peça: " + getGarantia() + " do fabricante: " + getFabricante();
            return resp;
        }
        else {
            String text = "Verifique o Paramentro Informado";
            return text;
        }
    }

    public void cadastrar(String params) {
        this.setFabricante(params);
    }

    public String cadastrar(String tipo, String desc) {
        if (tipo == "Peca") {
            this.setPecas(desc);
            return null;
        }

        if (tipo == "Modelo") {
            this.setModelo(desc);
            return null;
        }

        if (tipo == "Garantia") {
            this.setGarantia(desc);
            return null;
        }
        else {
            String text = "Verifique o Paramentro Informado";
            return text;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Fornecedor{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", representanteComercial='" + representanteComercial + '\'' +
                '}';
    }
}
