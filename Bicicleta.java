public class Bicicleta extends Vehiculo {
    private int velocidades;
    
    public Bicicleta(String marca, int velocidades) {
        super(marca, "Bicicleta", 40);
        this.velocidades = velocidades;
    }
    
    @Override
    public void acelerar() {
        System.out.println(marca + " bicicleta pedaleando con " + velocidades + " velocidades");
    }
}
