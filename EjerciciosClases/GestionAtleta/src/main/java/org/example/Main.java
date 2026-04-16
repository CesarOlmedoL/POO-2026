package org.example;

import org.example.catalogo.Deporte;
import org.example.modelo.Entrenador;
import org.example.modelo.Equipo;
import org.example.modelo.Nadador;

public class Main {
    public static void main(String[] args) {

        Nadador nadador1 = new Nadador("Florencia", 20, Deporte.NATACION,
                55, 1.70, new double[]{2, 4, 6, 7, 3, 5, 2},
                0.0, 0.0, "Mariposa");

        nadador1.imprimir();
        nadador1.setImc(nadador1.calcularIMC());
        nadador1.setPromHorasEntrenamiento(nadador1.calcularPromedioSemanalEntrenamiento());
        nadador1.cambiarEstilo("Libre (Crol)");
        System.out.print("Clasificación del IMC: ");
        nadador1.clasificarIMC();
        System.out.print("Clasificación del rendimiento: ");
        nadador1.clasificarRendimiento();
        nadador1.entrenar();

        // Creando el equipo
        Equipo equipo1 = new Equipo();
        equipo1.setNombre("Equipo mundial1");
        equipo1.agregarMiembrosEquipo(nadador1);


        // modelo.Entrenador
        Entrenador entrenador1 = new Entrenador("Julio", 4);
        System.out.print("Salario del entrenador: " + entrenador1.calcularSalario());
        entrenador1.asignarAtleta(nadador1);
        entrenador1.imprimir();


    }
}
