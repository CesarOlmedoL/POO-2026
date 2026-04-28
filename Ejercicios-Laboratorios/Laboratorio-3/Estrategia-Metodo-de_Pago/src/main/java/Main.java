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
        Compra c1 = new Compra(new PagoTarjeta("Ana López ", "12/25"));
        c1.realizarPago(50.00);

        // Compra usando efectivo
        Compra c2 = new Compra(new PagoEfectivo(40));
        c2.realizarPago(35.00);

        // Compra usando PayPal
        Compra c3 = new Compra(new PagoPayPal("usuario@email.com"));
        c3.realizarPago(75.50);

        System.out.println("\n--- Cambiando estrategia en tiempo de ejecución ---\n");

        // Cambiar el método de pago sin modificar la clase Compra
        Compra c4 = new Compra(new PagoTarjeta("Luis Sosa", "11/28"));
        c4.realizarPago(100.00);

        c4.setMetodo(new PagoEfectivo(100)); // ← se cambia la estrategia
        c4.realizarPago(100.50);
    }
}
