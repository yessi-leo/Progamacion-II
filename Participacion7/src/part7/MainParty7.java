/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part7;

/**
 *
 * @author yessi
 */
public class MainParty7 {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Sunny", "Desarrollador", 5000);
        Empleado e2 = new Empleado("Natalia", "Informatica", 4500);
        Empleado e3 = new Empleado("Devon", "Gerente", 7500);

        Proyecto p1 = new Proyecto("Sistema Operativo", "INF121");
        Proyecto p2 = new Proyecto("Pagina Web", "INF133");
        Proyecto p3 = new Proyecto("Aplicacion Movil", "INF123");
        e1.asignarProyecto(p1);
        e1.asignarProyecto(p3);
        e3.asignarProyecto(p1);
        e3.asignarProyecto(p3);
        e3.asignarProyecto(p2);
        e2.asignarProyecto(p1);
        e2.asignarProyecto(p2);
        p1.agrega(e1);
        p1.agrega(e3);
        p1.agrega(e2);
        p3.agrega(e1);
        p3.agrega(e3);
        p2.agrega(e3);
        p2.agrega(e2);
        System.out.println("----- INFORMACION DE EMPLEADOS ------");
        System.out.println(e3);
        e3.mostrarProyectos();
        System.out.println();
        System.out.println(e1);
        e1.mostrarProyectos();
        System.out.println();
        System.out.println(e2);
        e2.mostrarProyectos();
        System.out.println();
        System.out.println("------  PROYECTOS -------");
        System.out.println(p1);
        p1.listaEmpleados();
        System.out.println();
        System.out.println(p3);
        p3.listaEmpleados();
        System.out.println();
        System.out.println(p2);
        p2.listaEmpleados();
    }
}