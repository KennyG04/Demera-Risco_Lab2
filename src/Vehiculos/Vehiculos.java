package Vehiculos;

public abstract class Vehiculos {
    private String marca;
    private String placa;
    private int numeroDeRuedas;

    public Vehiculos(String marca, String placa, int numeroDeRuedas) {
        this.marca = marca;
        this.placa = placa;
        this.numeroDeRuedas = numeroDeRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract String getTipo();
}
