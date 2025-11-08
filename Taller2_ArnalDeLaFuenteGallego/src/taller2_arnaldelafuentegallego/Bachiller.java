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
public class Bachiller extends Curso {

    // Atributos
    private String tipoBachiller; // (primero o segundo)

    public Bachiller(String tipoBachiller, String nombreCurso, List<Asignatura> asignaturas, String codigoAsignatura) {
        super(nombreCurso, asignaturas, codigoAsignatura);
        this.tipoBachiller = tipoBachiller;
    }


    // Procedimientos
    void mostrarInfoBachiller() {
        // muestra si es primero o segundo
    }
}
