package patterns.strategy;

/**
 * Interfaz Strategy: define el comportamiento común de pago.
 * Cualquier clase que implemente esta interfaz debe definir cómo pagar.
 */
public interface MetodoPago {
    void pagar(double monto);
}
