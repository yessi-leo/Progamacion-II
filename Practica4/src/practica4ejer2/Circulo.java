/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4ejer2;

/**
 *
 * @author yessi
 */
public class Circulo extends Figura {
    private double radio;
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    @Override
    public String toString() {
        return "Circulo - " + super.toString() + ", Radio: " + radio;
    }
    public double getRadio() {
        return radio;
    }
}