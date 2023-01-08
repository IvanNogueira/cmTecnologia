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
public class quadrado extends Figura  {
    private double lado;

public Quadrado(double lado){
this.setLado(lado);
}

public double calculaArea(){
return this.getLado() * this.getLado();
}

public double calculaPerimetro(){
return 4 * this.getLado();
}

public double getLado(){
return lado;
}

public void setLado(double lado){
this.lado = lado;
}
}
