/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Alex Recacha
 */
public class Nota {
    
    private String modulo;
    private double calificacion;

    /**
     *
     * @param modulo
     */
    public Nota(String modulo) {
        this.modulo = modulo;
        this.calificacion = 0;
    }

    /**
     * @return the modulo
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * @param modulo the modulo to set
     */
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    /**
     * @return the calificacion
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Módulo: " + modulo + "Calificación: " + calificacion;
    }
    
    
    
}
