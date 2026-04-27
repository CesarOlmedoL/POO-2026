package module;

import patterns.strategy.MetodoPago;

/**
 * Estrategia concreta: pago con tarjeta de crédito/débito.
 */

public class PagoTarjeta implements MetodoPago {

    @Override
    public void pagar(double monto) {
        System.out.println("💳 Pagando con tarjeta: $" + monto);
    }
}
