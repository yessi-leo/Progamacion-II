/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author yessi
 */
public class MainExamen2 {
    public static void main(String[] args) {
        MiTeleferico tt = new MiTeleferico();
        
        Persona p1 = new Persona("Yessica", 20, 65.0f);  
        Persona p2 = new Persona("Belinda", 30, 55.0f); 
        Persona p3 = new Persona("Carlos", 35, 70.0f); 
        Persona p4 = new Persona("Ana", 65, 60.0f);  
        Persona p5 = new Persona("Mario", 40, 75.0f);  
        Persona p6 = new Persona("Sofia", 18, 50.0f);
        //cabinas agregadas
        tt.agregarCabina("Amarillo");
        tt.agregarCabina("Amarillo");
        tt.agregarCabina("Rojo");
        tt.agregarCabina("Rojo");
        tt.agregarCabina("Verde");
        tt.agregarCabina("Verde");

        tt.agregarPersonaFila(p1, "Amarillo");
        tt.agregarPersonaFila(p2, "Amarillo");
        tt.agregarPersonaFila(p3, "Rojo");
        tt.agregarPersonaFila(p4, "Rojo");
        tt.agregarPersonaFila(p5, "Verde");
        tt.agregarPersonaFila(p6, "Verde");
        
        // a) 
        System.out.println(" a)agregar personas ");
        System.out.println(" Yessica a linea Amarillo, cabina : " +  tt.agregarPersonaACabina(p1, "Amarillo", 0));
        System.out.println(" Belinda a linea Amarillo, cabina : " +  tt.agregarPersonaACabina(p2, "Amarillo", 0));
        System.out.println(" Carlos a linea Rojo, cabina : " + tt.agregarPersonaACabina(p3, "Rojo", 0));
        System.out.println(" Ana a linea Rojo, cabina : " + tt.agregarPersonaACabina(p4, "Rojo", 0));
        System.out.println(" Mario a linea Verde, cabina : " + tt.agregarPersonaACabina(p5, "Verde", 0));
        System.out.println(" Sofia a linea Verde, cabina : " + tt.agregarPersonaACabina(p6, "Verde", 0));
        
        Persona personaPesada = new Persona("Anderson", 45, 800.0f);
        System.out.println("Agregando Anderson (800kg) a linea Amarillo, cabina 0: " + 
            tt.agregarPersonaACabina(personaPesada, "Amarillo", 0) + " (rechazado por exceso de peso)\n");
        
        // b) 
        System.out.println(" b) verifica si todas las cabinas cumples con las reglas");
        boolean cumplenReglas = tt.verificarTodasLasCabinas();
        System.out.println("Todas las cabinas cumplen las reglas? " + cumplenReglas);
        
        System.out.println("\nEstado de las lineas:");
        for (Linea linea : tt.getLineas()) {
            System.out.println("Linea " + linea.getColor() + ": " + 
                linea.getCabinas().size() + " cabinas, " + 
                linea.getFilaPersonas().size() + " personas en fila");
            
            for (Cabina cabina : linea.getCabinas()) {
                System.out.println("  Cabina " + cabina.getNroCabina() + ": " + 
                    cabina.getPersonasAbordo().size() + " personas, " + 
                    "Peso: " + calcularPesoCabina(cabina) + " kg, " +
                    "Ingresos: Bs. " + cabina.calcularIngresos());
            }
        }
        
        // c) 
        System.out.println("\n c) ingresos totales de todas las lineas");
        float ingresosTotales = tt.calcularIngresoTotal();
        System.out.println("Ingresos totales de todas las lineas: Bs. " + ingresosTotales);
        
        // d) 
        System.out.println("\n d) linea con mas ingresos");
        tt.mostrarLineaConMasIngresoRegular();
        
    }
    private static float calcularPesoCabina(Cabina cabina) {
        float pesoTotal = 0;
        for (Persona persona : cabina.getPersonasAbordo()) {
            pesoTotal += persona.getPeso();
        }
        return pesoTotal;
    }

}
