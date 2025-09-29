/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4ejer2;

import java.util.Random;
/**
 *
 * @author yessi
 */
public class practica4ejer2main {
    
    public static void main(String[] args) {
        Random random = new Random();
        Figura[] figuras = new Figura[5];
        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo", "Naranja", "Morado", "Rosa"};
        System.out.println("---- GENERANDO FIGURAS ALEATORIAS ----\n");
        for (int i = 0; i < 5; i++) {
            int tipo = random.nextInt(2) + 1;
            String color = colores[random.nextInt(colores.length)];
            if (tipo == 1) { 
                double lado = 1 + random.nextDouble() * 10; 
                figuras[i] = new Cuadrado(color, lado);
                System.out.println("Cuadrado: " + (i + 1) + " - Lado: " + 
                                 String.format("%.2f", lado) + ", Color: " + color);
            } else { 
                double radio = 1 + random.nextDouble() * 8;
                figuras[i] = new Circulo(color, radio);
                System.out.println("Circulo: " + (i + 1) + " - Radio: " + 
                                 String.format("%.2f", radio) + ", Color: " + color);
            }
        }
        System.out.println("\n---- INFORMACION DE LAS FIGURAS ----");
        for (int i = 0; i < figuras.length; i++) {
            Figura figura = figuras[i];
            System.out.println("\nFigura" + (i + 1) + ": " + figura.toString());
            System.out.println("Area: " + String.format("%.2f", figura.area()));
            System.out.println("Perimetro: " + String.format("%.2f", figura.perimetro()));
            if (figura instanceof Coloreado) {
                Coloreado coloreado = (Coloreado) figura;
                System.out.println("comoColorear: " + coloreado.comoColorear());
            } else {
                System.out.println("Esta figura no implementa la interfaz Coloreado");
            }
        }
        int cuadrados = 0;
        int circulos = 0;
        for (int i = 0; i < figuras.length; i++) {
            Figura figuraActual = figuras[i];
            if (figuraActual instanceof Cuadrado) {
                cuadrados++;
            } else if (figuraActual instanceof Circulo) {
                circulos++;
            }
        }
        System.out.println("Total de Cuadrados: " + cuadrados);
        System.out.println("Total de Circulos: " + circulos);
    }
}