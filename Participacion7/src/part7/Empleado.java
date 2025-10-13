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
public class Empleado {
    private String nombre;
    private String puesto;
    private double salario;
    private ArrayList<Proyecto> proyectos; 
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.proyectos = new ArrayList<Proyecto>();
    }
    public String getNombre() {
        return nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public double getSalario() {
        return salario;
    }
    public ArrayList<Proyecto> getProyectos() { 
        return proyectos; 
    }
    public void asignarProyecto(Proyecto proy) {
        if (!proyectos.contains(proy)) {
            proyectos.add(proy);
            proy.agrega(this); 
        }
    }
    public void mostrarProyectos() {
        System.out.println("Proyectos asignados a " + this.nombre + ":");
        for (Proyecto proy : proyectos) {
            System.out.println("- " + proy.getNombre());
        }
    } 
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", puesto=" + puesto + ", salario=Bs" + salario + "]";
    }
}
