// Clase padre - Vehículo
public class Vehiculo implements IVehiculo {
    protected String marca;
    protected String tipo;
    protected int velocidadMaxima;
    
    public Vehiculo(String marca, String tipo, int velocidadMaxima) {
        this.marca = marca;
        this.tipo = tipo;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    // Método que será sobrescrito (Polimorfismo)
    @Override
    public void acelerar() {
        System.out.println(marca + " " + tipo + " acelerando...");
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " | Tipo: " + tipo + " | Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
    
    // Getters para encapsulamiento
    @Override
    public String getMarca() {
        return marca;
    }
    
    @Override
    public String getTipo() {
        return tipo;
    }
    
    @Override
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
