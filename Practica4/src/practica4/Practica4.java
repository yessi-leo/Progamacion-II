/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author yessi
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];       
        System.out.println("---- INGRESO DE DATOS DE EMPLEADOS ----\n");
        System.out.println("EMPLEADOS DE TIEMPO COMPLETO:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEmpleado de Tiempo Completo:" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Salario anual: Bs");
            double salarioAnual = scanner.nextDouble();
            scanner.nextLine();            
            empleados[i] = new EmpleadoTiempoCompleto(nombre, salarioAnual);
        }
        System.out.println("\nEMPLEADOS DE TIEMPO HORARIO:");
        for (int i = 3; i < 5; i++) {
            System.out.println("\nEmpleado de Tiempo Horario:" + (i - 2));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Horas trabajadas: ");
            double horas = scanner.nextDouble();
            System.out.print("Tarifa por hora: Bs");
            double tarifa = scanner.nextDouble();
            scanner.nextLine(); 
            empleados[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
        }
        System.out.println("\n---- INFORMACION DE EMPLEADOS ----");
        System.out.println("Nombre y Salario Mensual de cada empleado:\n");
        
        for (int i = 0; i < empleados.length; i++) {
            Empleado emp = empleados[i];
            double salarioMensual = emp.CalcularSalarioMensual();
            System.out.println("Empleado:" + (i + 1) + ":");
            System.out.println("Nombre: " + emp.getNombre());
            System.out.println("Salario Mensual: Bs" + String.format("%.2f", salarioMensual));
            if (emp instanceof EmpleadoTiempoCompleto) {
                System.out.println("Tipo: Tiempo Completo");
            } else {
                System.out.println("Tipo: Tiempo Horario");
            }
            System.out.println();
        }
    }
}