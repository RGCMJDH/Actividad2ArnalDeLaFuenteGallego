/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2_arnaldelafuentegallego;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Taller2_ArnalDeLaFuenteGallego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Taller2_ArnalDeLaFuenteGallego().inicio();
    }

    private Scanner scan;
    private Llista listaCursos = new Llista();

    private void inicio() {
        scan = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ CURSOS ===");
            System.out.println("1. Dar de alta curso");
            System.out.println("2. Listar cursos");
            System.out.println("3. Buscar curso por código");
            System.out.println("4. Agregar asignatura a un curso");
            System.out.println("5. Eliminar asignatura de un curso");
            System.out.println("6. Eliminar curso");
            System.out.println("0. Salir");
            System.out.print("Elige opción: ");

            String input = scan.nextLine().trim();
            try {
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1 -> {
                    darDeAltaCurso();
                }
                case 2 -> {
                    listaCursos.imprimeCursos();
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 0 -> {
                }
                default -> {
                }
            }
        } while (opcion != 0);

        scan.close();
    }

    // Atributo en tu clase gestora
// private final List<Curso> cursos = new ArrayList<>();
// private Scanner scan;
    private void darDeAltaCurso() {

        System.out.println("¿Quieres que sea Bachiller (1) o FP (2)?");
        int opc = scan.nextInt();
        scan.nextLine(); // <- limpia el \n que dejó nextInt

        System.out.print("Nombre del curso: ");
        String nombreCurso = scan.nextLine();

        System.out.print("Código del curso: ");
        String codigoCurso = scan.nextLine();

        System.out.print("¿Cuántas asignaturas tendrá el curso? ");
        int numAsign = scan.nextInt();
        scan.nextLine(); // si luego vas a seguir con más nextLine()

        List<Asignatura> asignaturas = new ArrayList<>();
        Curso curso = null;
        
        switch (opc) {
            case 1:
                System.out.print("Tipo de Bachiller (Primero/Segundo): ");
                String tipoBach = scan.nextLine();
                for (int i = 1; i <= numAsign; i++) {
                    System.out.println("Asignatura " + i + ":");
                    System.out.print("  Nombre: ");
                    String nom = scan.nextLine();
                    System.out.print("  Código: ");
                    String cod = scan.nextLine();
                    System.out.print("  Créditos: ");
                    int cred = scan.nextInt();
                    
                    // Creamos como Obligatoria (ajusta si tienes también 'Opcional')
                    asignaturas.add(new Obligatoria(cred, nom, cod, new ArrayList<>()));
                }  
                curso = new Bachiller(tipoBach, nombreCurso, asignaturas, codigoCurso);
                listaCursos.meteCurso(curso);
                System.out.println("Bachiller dado de alta: " + nombreCurso + " (" + tipoBach + ")");
                break;
        
            case 2:
                System.out.print("Especialidad FP (Informática, Mecánica, etc.): ");
                String especialidad = scan.nextLine();
                for (int i = 1; i <= numAsign; i++) {
                    System.out.println("Asignatura " + i + ":");
                    System.out.print("  Nombre: ");
                    String nom = scan.nextLine();
                    System.out.print("  Código: ");
                    String cod = scan.nextLine();
                    System.out.print("  Especialidad: ");
                    String especialidadFP = scan.nextLine();
                    
                    // Creamos como Obligatoria (ajusta si tienes también 'Opcional')
                    asignaturas.add(new Optativa(especialidadFP, nom, cod, new ArrayList<>()));
                    // Tu firma real:
                    // FP(String especialidadFP, String nombreCurso, List<Asignatura> asignaturas, String codigoAsignatura)
                    curso = new FP(especialidad, nombreCurso, asignaturas, codigoCurso);
                    listaCursos.meteCurso(curso);
                    System.out.println("FP dado de alta: " + nombreCurso + " (" + especialidad + ")");
                }   break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

}
