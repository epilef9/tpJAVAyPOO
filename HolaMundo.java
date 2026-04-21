public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE VEHÍCULOS ===\n");
        
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Auto("Toyota", 200, 4);
        vehiculos[1] = new Auto("Ferrari", 300, 2);
        vehiculos[2] = new Bicicleta("Trek", 21);
        
        System.out.println("--- Información de Vehículos ---");
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
        }
        
        System.out.println("\n--- Aceleración de Vehículos ---");
        for (Vehiculo v : vehiculos) {
            v.acelerar();  
        }
    }
}