/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interce;

/**
 *
 * @author ivan
 */

public class Quadrado implements Figura {

    double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }        

    public double calcularArea() {
        double area = 0;
        area = lado * lado;
        return area;
    }
}
