package Vehiculos;

public class Carro extends Vehiculos{
    
    public Carro(String marca, String placa, int numeroDeRuedas) {
        super(marca, placa, 4);
        
    }
    
    @Override
    public String getTipo() {
        return "Carro";
    }
}
