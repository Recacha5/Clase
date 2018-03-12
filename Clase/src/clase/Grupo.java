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

    /**
     *
     */
    public Grupo() {
        this.vAlumnos = new ArrayList();
    }

    /**
     * Descripcion
     *
     * @param nombreAlumno
     * @param modulos
     */
    public void matricularAlumno(String nombreAlumno, ArrayList<Nota> modulos) {
        Alumno a = new Alumno(nombreAlumno, modulos);

        for (int i = 0; i < vAlumnos.size(); i++) {

            if (vAlumnos.isEmpty()) {
                vAlumnos.add(a);
            }

        }

    }
    /**
     * 
     */
    public void ponerNota(){
        Scanner sc = new Scanner(System.in);
        String nom, mod;
        System.out.println("A quién le quieres poner nota?");
        nom = sc.nextLine();
        System.out.println("En qué modulo");
        mod = sc.nextLine();

        for (int i = 0; i < vAlumnos.size(); i++) {
            if (vAlumnos.isEmpty() && vAlumnos.equals(nom) && vAlumnos.contains(mod)) {
                
            }
        }
    }
    /**
     * 
     */
    public void borrarAlumno(){
        Scanner sc = new Scanner(System.in);
        String nom;
        System.out.println("A quién le quieres borrar?");
        nom = sc.nextLine();
        
        for (int i = 0; i < vAlumnos.size(); i++) {
            if (!vAlumnos.isEmpty() && vAlumnos.equals(nom)) {
                vAlumnos.remove(i);
            }
        }
    }
    /**
     * 
     */
    public void borrarGrupo(){
        
        vAlumnos.clear();
        
    }
    /**
     * 
     */
    public void numeroDeSuspensos(){
        int aux=0;
        for (int i = 0; i < vAlumnos.size(); i++) {
            
            if (!vAlumnos.isEmpty()) {
                aux++;
            }
            
        }
        System.out.println(aux);
    }
    /**
     * 
     */
    public void obtenerMejorNota(){
        
        
        
    }
    /**
     * 
     * @param alumno 
     */
    public void alumnoMatriculado(Alumno alumno){
        
        for (int i = 0; i < vAlumnos.size(); i++) {
            
            if (!vAlumnos.isEmpty() && vAlumnos.contains(alumno)) {
                System.out.println("Está matriculado");
            }else{
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
