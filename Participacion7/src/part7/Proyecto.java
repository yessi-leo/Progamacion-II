/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part7;
import java.util.ArrayList;
/**
 *
 * @author yessi
 */
public class Proyecto {
    private String nombre;
    private String codigo;
    private ArrayList<Empleado> empleados;
    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleados = new ArrayList<Empleado>();
    } 
    public String getNombre() {
        return nombre;
    }  
    public String getCodigo() {
        return codigo;
    }   
    public ArrayList<Empleado> getEmpleados() { 
        return empleados; 
    }    
    public void agrega(Empleado emp) {
        if (!empleados.contains(emp)) {
            empleados.add(emp);
        }
    }   
    public void listaEmpleados() {
        System.out.println("Empleados asignados a " + this.nombre + ":");
        for (Empleado emp : empleados) {
            System.out.println("- " + emp.getNombre());
        }
    }   
    @Override
    public String toString() {
        return "Proyecto [nombre=" + nombre + ", codigo=" + codigo + "]";
    }
}