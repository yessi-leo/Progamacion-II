/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author yessi
 */
public abstract class Empleado {
    
    protected String nombre;
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public abstract double CalcularSalarioMensual();
    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
    public String getNombre() {
        return nombre;
    }
}