/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_arnaldelafuentegallego;

import java.util.List;

/**
 *
 * @author alber
 */
abstract class Curso {

    // Atributos
    private String nombreCurso;
    private List<Asignatura> asignaturas;
    private String codigoAsignatura; // Int/String codigoAsignatura

    public Curso(String nombreCurso, List<Asignatura> asignaturas, String codigoAsignatura) {
        this.nombreCurso = nombreCurso;
        this.asignaturas = asignaturas;
        this.codigoAsignatura = codigoAsignatura;
    }

    // Curso - BACH O FP
    // Procedimientos
    private void ordenarAsignaturas() {
        // ordena las asignaturas por identificador o nombre en orden ascendente.
    }

    public void agregarAsignatura(Asignatura a) { // CadaAsignatura

    }

    public void eliminarAsignatura(Asignatura a) {
        // elimina una asignatura del curso junto con los estudiantes matriculados en ella.
    }

    void listarAsignaturas() {
        // muestra todas las asignaturas del curso con sus estudiantes.
    }
}
