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
public class Triangulo extends Figura {
    
    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    public Triangulo(double base, double altura, double lado1, double lado2) {
        this.setLado1(lado1);
        this.setBase(base);
        this.setLado2(lado2);
        this.setAltura(altura);
    }

    public double calculaArea() {
        return (this.getBase() * this.getAltura()) / 2;
    }

    public double calculaPerimetro() {
        return this.getLado1() + this.getLado2() + this.getBase();
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado) {
        this.lado1 = lado;
    }
}

