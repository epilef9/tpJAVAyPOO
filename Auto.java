// Clase derivada - Auto
public class Auto extends Vehiculo {
    private int puertas;
    
    public Auto(String marca, int velocidadMaxima, int puertas) {
        super(marca, "Auto", velocidadMaxima);
        this.puertas = puertas;
    }
    
    // Sobrescribir método (Polimorfismo)
    @Override
    public void acelerar() {
        System.out.println("🚗 " + marca + " auto acelerando a " + velocidadMaxima + " km/h con " + puertas + " puertas");
    }
}
