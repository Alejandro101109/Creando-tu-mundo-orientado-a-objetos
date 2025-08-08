package valle.grande.edu.pe;

public class Auto extends Vehiculo {
    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    // Implementación del método encender() para la clase Auto (polimorfismo)
    @Override
    public void encender() {
        System.out.println("El auto " + getMarca() + " " + getModelo() + " ha encendido el motor de combustión.");
    }
}
