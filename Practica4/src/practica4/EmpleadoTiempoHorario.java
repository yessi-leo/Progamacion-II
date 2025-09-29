/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author yessi
 */
public class EmpleadoTiempoHorario extends Empleado{
    
    private double horas_trabajadas;
    private double tarifa_por_hora;
    
    public EmpleadoTiempoHorario(String nombre, double horas_trabajadas, double tarifa_por_hora) {
        super(nombre);
        this.horas_trabajadas = horas_trabajadas;
        this.tarifa_por_hora = tarifa_por_hora;
    }
    @Override
    public double CalcularSalarioMensual() {
        return horas_trabajadas * tarifa_por_hora;
    }
    @Override
    public String toString() {
        return super.toString() + ", Horas Trabajadas: " + horas_trabajadas + 
               ", Tarifa por Hora: Bs" + tarifa_por_hora + ", Tipo: Tiempo Horario";
    }
    public double getHorasTrabajadas() {
        return horas_trabajadas;
    }
    
    public double getTarifaPorHora() {
        return tarifa_por_hora;
    }
}