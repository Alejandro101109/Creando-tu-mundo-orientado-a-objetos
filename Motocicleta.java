package valle.grande.edu.pe;

public class Motocicleta extends Vehiculo {
    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    // Implementación del método encender() para la clase Motocicleta (polimorfismo)
    @Override
    public void encender() {
        System.out.println("La motocicleta " + getMarca() + " " + getModelo() + " ha encendido el motor de 2 tiempos.");
    }
}
