/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex Recacha
 */
public class Grupo {

    private ArrayList<Alumno> vAlumnos;

    public Grupo() {
        this.vAlumnos = new ArrayList();
    }

    /**
     * Matricula un alumno
     *
     * @param nombreAlumno recibe un nombre
     * @param modulos recibe un Array de Nota con los modulos
     */
    public void matricularAlumno(String nombreAlumno, String[] modulos) {
        ArrayList<Nota> vNotas = new ArrayList<>();
        for (String nom:modulos) {
            if (nom!=null){
                vNotas.add(new Nota(nom));
            }
        }
        Alumno a = new Alumno(nombreAlumno, vNotas);

        vAlumnos.add(a);

    }

    /**
     * Modifica la calificacion.
     */
    public void ponerNota() {
        Scanner sc = new Scanner(System.in);
        String nom, mod;
        double nota;
        System.out.println("A quién le quieres poner nota?");
        nom = sc.nextLine();
        System.out.println("En qué modulo");
        mod = sc.nextLine();
        System.out.println("Dime la nota");
        nota = sc.nextDouble();

        for (int i = 0; i < vAlumnos.size(); i++) {
            if (vAlumnos.get(i).getNombre().equalsIgnoreCase(nom)) {
                for (int j = 0; j < vAlumnos.size(); j++) {
                    if (vAlumnos.get(i).getvNotas().get(j).getModulo().equalsIgnoreCase(mod)) {
                        vAlumnos.get(i).getvNotas().get(j).setCalificacion(nota);
                    }
                }
            }
        }
    }

    /**
     * Borra un alumno
     */
    public void borrarAlumno() {
        Scanner sc = new Scanner(System.in);
        String nom;
        System.out.println("A quién le quieres borrar?");
        nom = sc.nextLine();

        for (int i = 0; i < vAlumnos.size(); i++) {
            if (vAlumnos.get(i).getNombre().equalsIgnoreCase(nom)) {
                vAlumnos.remove(i);
            }
        }
    }

    /**
     * Borra el grupo
     */
    public void borrarGrupo() {

        vAlumnos.clear();

    }

    /**
     *
     * @return devuelve el numero de suspensos
     */
    public int numeroDeSuspensos() {
        int aux = 0;
        for (int i = 0; i < vAlumnos.size(); i++) {
            for (int j = 0; j < vAlumnos.size(); j++) {
                if (vAlumnos.get(i).getvNotas().get(j).getCalificacion() < 4);
                aux++;
            }

        }
        return aux;
    }

    /**
     *
     * @return devuelve la mejor nota
     */
    public double obtenerMejorNota() {
        double aux = 0;
        for (int i = 0; i < vAlumnos.size(); i++) {
            for (int j = 0; j < vAlumnos.size(); j++) {
                if (vAlumnos.get(i).getvNotas().get(j).getCalificacion() > aux);
                aux = vAlumnos.get(i).getvNotas().get(j).getCalificacion();
            }

        }
        return aux;
    }

    /**
     * Comprueba si un alumno está matriculado
     *
     * @param alumno recibe un nombre
     */
    public void alumnoMatriculado(String alumno) {

        for (int i = 0; i < vAlumnos.size(); i++) {

            if (vAlumnos.get(i).getNombre().equalsIgnoreCase(alumno)) {
                System.out.println("Está matriculado");
            } else {
                System.out.println("No está matriculado");
            }

        }

    }

    /**
     * @return the vAlumnos
     */
    public ArrayList<Alumno> getvAlumnos() {
        return vAlumnos;
    }

    /**
     * @param vAlumnos the vAlumnos to set
     */
    public void setvAlumnos(ArrayList<Alumno> vAlumnos) {
        this.vAlumnos = vAlumnos;
    }

}
