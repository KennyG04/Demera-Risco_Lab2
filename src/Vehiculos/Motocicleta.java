package Vehiculos;

public class Motocicleta extends Vehiculos {
    
    public Motocicleta(String marca, String placa, int numeroDeRuedas) {
        super(marca, placa, 2);
    }
    
    @Override
    public String getTipo() {
        return "Motocicleta";
    }
    
}
