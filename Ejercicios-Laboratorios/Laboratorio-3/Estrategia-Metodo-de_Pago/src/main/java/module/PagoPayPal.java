package module;

import patterns.strategy.MetodoPago;

/**
 * Estrategia concreta adicional: pago mediante PayPal.
 * Demuestra la extensibilidad del patrón Strategy.
 */


public class PagoPayPal implements MetodoPago {

    private String correo;

    public PagoPayPal(String correo) {
        this.correo = correo;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("🌐 Pagando con PayPal (" + correo + "): $" + monto);
    }
}
