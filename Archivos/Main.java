package valle.grande.edu.pe;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Vehiculo auto1 = new Auto("Toyota", "Corolla");
        Vehiculo auto2 = new Auto("Hyundai", "New Santa Fe Mx5");
        Vehiculo motocicleta1 = new Motocicleta("Honda", "CBR");
        Vehiculo motocicleta2 = new Motocicleta("BMW", "GS ADVENTURE");

        // Llamar al método encender() en cada objeto
        // Aunque la variable es de tipo Vehiculo, el método ejecutado es el de la clase hija
        // Ejemplo de polimorfismo
        System.out.println("\n");
        Thread.sleep(1000);
        System.out.println("--- Encendiendo autos ---");
        auto1.encender();
        auto2.encender();
        System.out.println("\n");
        Thread.sleep(1000);
        System.out.println("--- Encendiendo motocicletas ---");
        motocicleta1.encender();
        motocicleta2.encender();
    }
    
}
