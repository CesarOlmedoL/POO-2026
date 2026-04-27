package module;

import patterns.strategy.MetodoPago;

/**
 * Contexto del patrón Strategy.
 * Usa la interfaz MetodoPago como tipo de dato,
 * permitiendo cambiar el comportamiento sin modificar esta clase.
 */
public class Compra {
    private MetodoPago metodo;

    public Compra(MetodoPago metodo) {
        this.metodo = metodo;
    }

    // Permite cambiar la estrategia en tiempo de ejecución
    public void setMetodo(MetodoPago metodo) {
        this.metodo = metodo;
    }

    public void realizarPago(double monto) {
        metodo.pagar(monto);
    }
}
