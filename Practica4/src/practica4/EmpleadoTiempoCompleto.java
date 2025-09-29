/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author yessi
 */
public class EmpleadoTiempoCompleto extends Empleado{
    
    private double salario_anual;
    
    public EmpleadoTiempoCompleto(String nombre, double salario_anual) {
        super(nombre); 
        this.salario_anual = salario_anual;
    }
    @Override
    public double CalcularSalarioMensual() {
        return salario_anual / 12;
    }
    @Override
    public String toString() {
        return super.toString() + ", Salario Anual: Bs" + salario_anual + 
               ", Tipo: Tiempo Completo";
    }
    public double getSalarioAnual() {
        return salario_anual;
    }
}