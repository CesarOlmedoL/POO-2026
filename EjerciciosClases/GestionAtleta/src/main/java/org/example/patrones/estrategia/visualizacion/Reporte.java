package org.example.patrones.estrategia.visualizacion;

import java.time.LocalDate;

public class Reporte {

    private String asunto;
    private LocalDate fecha;
    private EstrategiaVisualizacion estrategia;


    public Reporte() {
    }
    public Reporte(String asunto, LocalDate fecha) {
        this.asunto = asunto;
        this.fecha = fecha;
    }

    public String getAsunto() {
        return asunto;
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void visualizar(){
        if (estrategia == null) {
            System.out.println("No se encontro estrategia");
        }
        estrategia.visualizar(this);
    }

    public void setEstrategia(EstrategiaVisualizacion estrategia) {
        this.estrategia = estrategia;
    }

}
