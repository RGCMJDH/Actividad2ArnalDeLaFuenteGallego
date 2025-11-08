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
public class Optativa extends Asignatura {
    // Atributos
    private String perfil; // (por ejemplo, teórico o práctico)

    public Optativa(String perfil, String nombreAsignatura, String codigoAsignatura, List<Estudiante> estudiantesMatriculado) {
        super(nombreAsignatura, codigoAsignatura, estudiantesMatriculado);
        this.perfil = perfil;
    }


    // Procedimientos
    public void mostrarInfoOpcional() {
        // muestra la información del perfil de la asignatura opcional.
    }
}