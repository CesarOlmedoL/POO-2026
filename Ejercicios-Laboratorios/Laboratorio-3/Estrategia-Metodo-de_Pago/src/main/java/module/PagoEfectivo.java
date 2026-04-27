package module;

import patterns.strategy.MetodoPago;

/**
 * Estrategia concreta: pago en efectivo.
 */
public class PagoEfectivo implements MetodoPago {

    @Override
    public void pagar(double monto) {
        System.out.println("💵 Pagando en efectivo: $" + monto);
    }
}
