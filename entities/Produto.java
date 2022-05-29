package entities;

public class Produto {
    private String pecas;
    private String modelo;
    private String garantia;
    private String fabricante;

    public Produto() {
    }

    public String getPecas() {
        return pecas;
    }

    public String getModelo() {
        return modelo;
    }

    public String getGarantia() {
        return garantia;
    }

    public String getFabricante() { return fabricante; }

    public void setPecas(String pecas) {
        this.pecas = pecas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Produto{" +
                "pecas='" + pecas + '\'' +
                ", modelo='" + modelo + '\'' +
                ", garantia='" + garantia + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
