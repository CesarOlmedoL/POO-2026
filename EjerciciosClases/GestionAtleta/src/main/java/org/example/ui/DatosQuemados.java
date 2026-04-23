package org.example.ui;

import org.example.catalogo.Deporte;
import org.example.modelo.*;

import java.util.ArrayList;
import java.util.List;

public class DatosQuemados {
    public static void cargarDatos() {
        Nadador nadador1 = new Nadador("Florencia", 20, Deporte.NATACION,
                55, 1.70, new double[]{2, 4, 6, 7, 3, 5, 2},
                0.0, 0.0, "Mariposa");

        nadador1.imprimir();
        // estableciendo el promHorasCalculadas
        nadador1.setPromHorasEntrenamiento(nadador1.calcularPromedioSemanalEntrenamiento());
        nadador1.cambiarEstilo("Libre (Crol)");
        // estableciendo el imc calculado
        nadador1.setImc(nadador1.calcularIMC());
        // estableciendo la clasificacion IMC
        nadador1.setClasificacionIMC(nadador1.clasificarIMC());
        System.out.print("\nClasificación del IMC: " + nadador1.getClasificacionIMC());
        System.out.print("\nClasificación del rendimiento: ");
        nadador1.clasificarRendimiento();
        nadador1.entrenar();

        // Atleta2
        Atleta nadador2 = new Nadador();
        nadador2.setNombre("Jairo");

        List<Atleta> listaMiembrosEquipos;
        listaMiembrosEquipos = new ArrayList<>();
        // Crear el equipo
        Equipo equipo1 = new Equipo("Tigres", listaMiembrosEquipos);
        equipo1.agregarMiembroEquipo(nadador1);
        equipo1.agregarMiembroEquipo(nadador2);
        equipo1.imprimir();

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Tigres");
        equipo2.agregarMiembroEquipo(nadador2);
        equipo2.imprimir();


        // Crear al entrenador
        Entrenador entrenador1 = new Entrenador("Julio", 4);

        System.out.println("\nDatos del entrenador: ");
        System.out.println("Salario del entrenador $: " + entrenador1.calcularSalario());

        // Agregar atletas al entrenador
        entrenador1.agregarAtleta(nadador1);
        entrenador1.agregarAtleta(nadador2);

        entrenador1.imprimir();

        // Plan de entrenamiento
        PlanEntrenamiento plan1 = new PlanEntrenamiento();

        // Determinar el objetivo del plan de entrenamiento para el nadador1
        String objetivoGenerado = entrenador1.determinarObjetivoPlan(nadador1);
        plan1.setObjetivo(objetivoGenerado);
        System.out.println("\nObjetivo generado para plan de entrenamiento: " + objetivoGenerado + " - Atleta: " + nadador1.getNombre());

        // Agregar ejercicios al plan despues de conocer el objetivo
        plan1.agregarEjerciciosDuracion("Bicicleta", 10.0);
        plan1.imprimir();

        // preescribir plan de entrenamiento al atleta
        entrenador1.preescribirPlan(nadador1, plan1);

        // Imprimiendo el plan de entrenamiento asignado a un atleta
        System.out.println("\nPlan de entrenamiento actual del atleta: " + nadador1.getNombre());
        nadador1.getPlanActual().imprimir();
    }
}
