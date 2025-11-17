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
public class Cabina {

    private int nroCabina;
    private ArrayList<Persona> personasAbordo;

    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
        this.personasAbordo = new ArrayList<>();
    }

    public boolean agregarPersona(Persona p) {
        if (personasAbordo.size() >= 10) {
            return false;
        }
        
        float pesoActual = 0;
        for (int i = 0; i < personasAbordo.size(); i++) {
            Persona persona = personasAbordo.get(i);
            pesoActual += persona.getPeso();
        }

        if (pesoActual + p.getPeso() > 850) {
            return false;
        }

        personasAbordo.add(p);
        return true;
    }

    public boolean cumpleReglas() {
        if (personasAbordo.size() > 10) {
            return false;
        }
        
        float pesoTotal = 0;
        for (int i = 0; i < personasAbordo.size(); i++) {
            Persona persona = personasAbordo.get(i);
            pesoTotal += persona.getPeso();
        }

        return pesoTotal <= 850;
    }
    
    public float calcularIngresos() {
        float ingresos = 0;
        for (int i = 0; i < personasAbordo.size(); i++) {
            Persona persona = personasAbordo.get(i);
            if (persona.getEdad() < 25 || persona.getEdad() > 60) {
                ingresos += 1.5f; 
            } else {
                ingresos += 3.0f; 
            }
        }
        return ingresos;
    }

    public float calcularIngresosSoloRegular() {
        float ingresos = 0;
        for (int i = 0; i < personasAbordo.size(); i++) {
            Persona persona = personasAbordo.get(i);
            if (persona.getEdad() >= 25 && persona.getEdad() <= 60) {
                ingresos += 3.0f; 
            }
        }
        return ingresos;
    }

    public int getNroCabina() {
        return nroCabina;
    }

    public ArrayList<Persona> getPersonasAbordo() {
        return personasAbordo;
    }
}