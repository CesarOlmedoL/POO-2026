package module;

import patterns.strategy.MetodoPago;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


/**
 * Estrategia concreta: pago con tarjeta de crédito/débito.
 * Incluye validación de fecha de vencimiento (MM/AA).
 */

public class PagoTarjeta implements MetodoPago {
    private String titular;
    private String fechaVencimiento; // formato: MM/AA

    public PagoTarjeta(String titular, String fechaVencimiento) {
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Valida que la tarjeta no esté vencida.
     *
     * @return true si la tarjeta está vigente, false si está vencida o tiene formato inválido
     */
    private boolean validarVencimiento() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
            YearMonth vencimiento = YearMonth.parse(fechaVencimiento, formatter);
            YearMonth hoy = YearMonth.now();
            return !vencimiento.isBefore(hoy);
        } catch (DateTimeParseException e) {
            System.out.println("  ⚠️  Formato de fecha inválido. Use MM/AA (ej: 08/27)");
            return false;
        }
    }

    @Override
    public void pagar(double monto) {
        System.out.println("💳 Procesando pago con tarjeta...");
        System.out.println("   Titular : " + titular);
        System.out.println("   Vence   : " + fechaVencimiento);

        if (validarVencimiento()) {
            System.out.printf("   ✅ Pago aprobado: $%.2f%n", monto);
        } else {
            System.out.println("   ❌ Pago rechazado: la tarjeta está VENCIDA.");
        }
    }
}
