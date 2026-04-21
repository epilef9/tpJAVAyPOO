// Clase padre - Vehículo
public class Vehiculo {
    protected String marca;
    protected String tipo;
    protected int velocidadMaxima;
    
    public Vehiculo(String marca, String tipo, int velocidadMaxima) {
        this.marca = marca;
        this.tipo = tipo;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    // Método que será sobrescrito (Polimorfismo)
    public void acelerar() {
        System.out.println(marca + " " + tipo + " acelerando...");
    }
    
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " | Tipo: " + tipo + " | Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}
