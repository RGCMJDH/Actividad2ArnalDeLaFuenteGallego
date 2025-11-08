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
abstract class Asignatura {
    // Atributos
    private String nombreAsignatura;
    private String codigoAsignatura;
    private List<Estudiante> estudiantesMatriculado;

    public Asignatura(String nombreAsignatura, String codigoAsignatura, List<Estudiante> estudiantesMatriculado) {
        this.nombreAsignatura = nombreAsignatura;
        this.codigoAsignatura = codigoAsignatura;
        this.estudiantesMatriculado = estudiantesMatriculado;
    }

    
    
    // Procedimientos
    void matricularEstudiante(Estudiante e) {
        // añade un estudiante a la lista de matriculados.
    }

    void darDeBajaEstudiante(Estudiante e) {
        // elimina un estudiante de la asignatura.
    }

    void ordenarEstudiantesPorNombre() {
        // ordena los estudiantes matriculados por nombre.
    }
}
