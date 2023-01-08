/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pergunta_03;

/**
 *
 * @author ivan
 */
public class Circulo extends Figura   {
    private double raio;

    public Circulo(double raio) {
        this.setRaio(raio);
    }

    public double calculaArea() {
        return Math.PI * (this.getRaio() * this.getRaio());
    }

    public double calculaPerimetro() {
        return 2 * Math.PI * this.getRaio();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
