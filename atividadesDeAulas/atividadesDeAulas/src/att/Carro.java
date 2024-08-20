package att;

public class Carro {
    private String marca;
    private String montadora;
    private int ano;
    private double potencia;

       Carro(String marca, String montadora, int ano, double potencia) {
        marca = this.marca;
        montadora = this.montadora;
        ano = this.ano;
        potencia = this.potencia;
         }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPotencia() {
        return potencia;
    }
    
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }


}
