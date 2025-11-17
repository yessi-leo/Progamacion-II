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
public class MiTeleferico {
    private ArrayList<Linea> lineas;
    private float cantidadIngresos;
    
    public MiTeleferico() {
        this.lineas = new ArrayList<>();
        this.cantidadIngresos = 0;
        this.lineas.add(new Linea("Amarillo"));
        this.lineas.add(new Linea("Rojo"));
        this.lineas.add(new Linea("Verde"));
    }
    
    public void agregarPersonaFila(Persona p, String lineaColor) {
        for (int i = 0; i < lineas.size(); i++) {
            Linea linea = lineas.get(i);
            if (linea.getColor().equals(lineaColor)) {
                linea.agregarPersona(p);
                return;
            }
        }
    }
    
    public void agregarCabina(String lineaColor) {
        for (int i = 0; i < lineas.size(); i++) {
            Linea linea = lineas.get(i);
            if (linea.getColor().equals(lineaColor)) {
                int nroCabina = linea.getCabinas().size() + 1;
                linea.agregarCabina(nroCabina);
                return;
            }
        }
    }
    
    // a)
    public boolean agregarPersonaACabina(Persona p, String lineaColor, int numeroCabina) {
        for (int i = 0; i < lineas.size(); i++) {
            Linea linea = lineas.get(i);
            if (linea.getColor().equals(lineaColor)) {
                ArrayList<Cabina> cabinas = linea.getCabinas();
                if (numeroCabina >= 0 && numeroCabina < cabinas.size()) {
                    Cabina cabina = cabinas.get(numeroCabina);
                    return cabina.agregarPersona(p);
                }
            }
        }
        return false;
    }
    
    // b) 
    public boolean verificarTodasLasCabinas() {
        for (int i = 0; i < lineas.size(); i++) {
            Linea linea = lineas.get(i);
            if (!linea.verificarReglas()) {
                return false;
            }
        }
        return true;
    }
    
    // c) 
    public float calcularIngresoTotal() {
        float ingresosTotales = 0;
        for (int i = 0; i < lineas.size(); i++) {
            Linea linea = lineas.get(i);
            ingresosTotales += linea.calcularIngresos();
        }
        this.cantidadIngresos = ingresosTotales;
        return ingresosTotales;
    }
    
    // d) 
    public void mostrarLineaConMasIngresoRegular() {
        String lineaMax = "";
        float maxIngreso = -1;
        
        for (int i = 0; i < lineas.size(); i++) {
            Linea linea = lineas.get(i);
            float ingresoRegular = linea.calcularIngresosSoloRegular();
            if (ingresoRegular > maxIngreso) {
                maxIngreso = ingresoRegular;
                lineaMax = linea.getColor();
            }
        }
        
        if (maxIngreso >= 0) {
            System.out.println("Linea con mas ingreso regular: " + lineaMax + " - Bs. " + maxIngreso);
        } else {
            System.out.println("No hay lineas con ingresos regulares");
        }
    }

    public ArrayList<Linea> getLineas() {
        return lineas;
    }

    public float getCantidadIngresos() {
        return cantidadIngresos;
    }
}