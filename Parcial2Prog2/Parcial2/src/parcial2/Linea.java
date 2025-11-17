/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

import java.util.ArrayList;

/**
 *
 * @author yessi
 */
public class Linea {
    private String color;
    private ArrayList<Persona> filaPersonas;
    private ArrayList<Cabina> cabinas;
    private int cantidadCabinas;
    
    public Linea(String color) {
        this.color = color;
        this.filaPersonas = new ArrayList<>();
        this.cabinas = new ArrayList<>();
        this.cantidadCabinas = 0;
    }
    
    public void agregarPersona(Persona p) {
        filaPersonas.add(p);
    }
    
    public void agregarCabina(int nroCab) {
        Cabina nuevaCabina = new Cabina(nroCab);
        cabinas.add(nuevaCabina);
        cantidadCabinas++;
    }
    
    public boolean verificarReglas() {
        for (int i = 0; i < cabinas.size(); i++) {
            Cabina cabina = cabinas.get(i);
            if (!cabina.cumpleReglas()) {
                return false;
            }
        }
        return true;
    }
    
    public float calcularIngresos() {
        float ingresosTotales = 0;
        for (int i = 0; i < cabinas.size(); i++) {
            Cabina cabina = cabinas.get(i);
            ingresosTotales += cabina.calcularIngresos();
        }
        return ingresosTotales;
    }
    
    public float calcularIngresosSoloRegular() {
        float ingresosTotales = 0;
        for (int i = 0; i < cabinas.size(); i++) {
            Cabina cabina = cabinas.get(i);
            ingresosTotales += cabina.calcularIngresosSoloRegular();
        }
        return ingresosTotales;
    }

    public String getColor() {
        return color;
    }

    public ArrayList<Persona> getFilaPersonas() {
        return filaPersonas;
    }

    public ArrayList<Cabina> getCabinas() {
        return cabinas;
    }

    public int getCantidadCabinas() {
        return cantidadCabinas;
    }
}