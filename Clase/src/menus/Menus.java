/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import java.util.Scanner;

/**
 *
 * @author Alex Recacha
 */
public class Menus {
    
    public static int menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion<1 || opcion>8) {            
            System.out.println("--------------------------------");
            System.out.println("1- Matricular Alumno.");
            System.out.println("2- Poner Nota a un Alumno.");
            System.out.println("3- Borrar a un Alumno.");
            System.out.println("4- Borrar TODOS los Alumnos.");
            System.out.println("5- Calcular Número de Suspensos.");
            System.out.println("6- Obtener la Mejor Nota.");
            System.out.println("7- Comprobar Matriculacion.");
            System.out.println("8- Salir.");
            System.out.println("--------------------");
        }
        System.out.println("Dime la opcion");
        
        return opcion;
    }
    
}
