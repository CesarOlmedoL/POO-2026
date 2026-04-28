package module;

import patterns.strategy.MetodoPago;

/**
 * Estrategia concreta: pago en efectivo.
 * Calcula el cambio si el cliente paga con más dinero del requerido.
 */
public class PagoEfectivo implements MetodoPago {
    private double montoPagado; // dinero que entrega el cliente

    public PagoEfectivo(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("💵 Procesando pago en efectivo...");
        System.out.printf("   Total a pagar : $%.2f%n", monto);
        System.out.printf("   Monto entregado: $%.2f%n", montoPagado);

        if (montoPagado < monto) {
            double faltante = monto - montoPagado;
            System.out.printf("   ❌ Pago incompleto. Faltan: $%.2f%n", faltante);
        } else if (montoPagado == monto) {
            System.out.println("   ✅ Pago exacto. No requiere cambio.");
        } else {
            double cambio = montoPagado - monto;
            System.out.printf("   ✅ Pago recibido. Cambio a devolver: $%.2f%n", cambio);
        }
    }
}
