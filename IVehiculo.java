// declarar interfaz
public interface IVehiculo {
    
            // metodos abstractos
    void acelerar();
    void mostrarInfo();
    
     // get para acceder a los atributos     (encapsulamiento)
    String getMarca();
    String getTipo();
    int getVelocidadMaxima();
}
