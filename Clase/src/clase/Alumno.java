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
public class Alumno {

    private String nombre;
    private ArrayList<Nota> vNotas;

    /**
     *
     * @param nombre
     * @param modulos
     */
    public Alumno(String nombre, ArrayList<Nota> modulos) {
        this.nombre = nombre;
        this.vNotas = modulos;
        
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

   
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    @Override
    public String toString() {
        return "Nombre: " + nombre + super.toString();
    }

    /**
     * 
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
        for (int i = 0; i < getvNotas().size(); i++) {
            if (nombre.equalsIgnoreCase(nom) && getvNotas().get(i).getModulo().equalsIgnoreCase(mod)) {
                getvNotas().get(i).setCalificacion(nota);
            }
        }
    }
    /**
     * 
     */
    public void obtenerMejorNota() {
        double mayor = 0;
        for (Nota n : getvNotas()) {
            if (n != null && n.getCalificacion() > mayor) {
                mayor = n.getCalificacion();
            }
        }
        System.out.println("La mayor nota ha sido: " + mayor);
    }
    /**
     * 
     */
    public void obtenerCalificacionModulo() {
        Scanner sc = new Scanner(System.in);
        String mod, nom;
        System.out.println("Dime el alumno");
        nom = sc.nextLine();
        System.out.println("Sobre qué modulo quieres saber la nota");
        mod = sc.nextLine();

        for (Nota n : getvNotas()) {
            if (n != null && nombre.equalsIgnoreCase(nom) && n.getModulo().equalsIgnoreCase(mod)) {
                System.out.println(n.getCalificacion());
            }
        }

    }

    /**
     * @return the vNotas
     */
    public ArrayList<Nota> getvNotas() {
        return vNotas;
    }

    /**
     * @param vNotas the vNotas to set
     */
    public void setvNotas(ArrayList<Nota> vNotas) {
        this.vNotas = vNotas;
    }

}
