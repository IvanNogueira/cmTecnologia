/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interce;

import javafx.scene.shape.Circle;

/**
 *
 * @author ivan
 */
public class Circulo implements Figura{
    double raio;
    public Circulo (double raio){
        this.raio = raio;
    }
    public double calcularArea(){
        double area = 0;
        area = 3.14*raio*raio;
        return area;
    }
}
