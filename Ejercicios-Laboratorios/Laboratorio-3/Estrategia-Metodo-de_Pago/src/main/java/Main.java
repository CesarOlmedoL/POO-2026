import module.Compra;
import module.PagoEfectivo;
import module.PagoPayPal;
import module.PagoTarjeta;

/**
 * Demuestra cómo el patrón Strategy permite cambiar
 * el comportamiento de un objeto sin modificar su código.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Patrón Strategy - Métodos de Pago ===\n");

        // Compra usando tarjeta
        Compra c1 = new Compra(new PagoTarjeta());
        c1.realizarPago(50.00);

        // Compra usando efectivo
        Compra c2 = new Compra(new PagoEfectivo());
        c2.realizarPago(30.00);

        // Compra usando PayPal
        Compra c3 = new Compra(new PagoPayPal("usuario@email.com"));
        c3.realizarPago(75.50);

        System.out.println("\n--- Cambiando estrategia en tiempo de ejecución ---\n");

        // Cambiar el método de pago sin modificar la clase Compra
        Compra c4 = new Compra(new PagoTarjeta());
        c4.realizarPago(100.00);

        c4.setMetodo(new PagoEfectivo()); // ← se cambia la estrategia
        c4.realizarPago(100.00);
    }
}
