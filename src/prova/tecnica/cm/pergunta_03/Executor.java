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
import javax.swing.JOptionPane;
public class Executor {
    public static void main(String[] args) {
    // cria duas instâncias da classe Quadrado
    Quadrado q1 = new Quadrado(5);
    Quadrado q2 = new Quadrado(8);
    
    //cria duas instancias da classe Triangulo
    Triangulo t1 = new Triangulo(5,7,3,3);
    Triangulo t2 = new Triangulo(8,6,4,4);
    
    // cria duas instâncias da classe Circulo
    Circulo c1 = new Circulo(5);
    Circulo c2 = new Circulo(8);
    
    // realiza os calculos de perimetro e área para os objetos do tipo Quadrado e atribui a uma String
    String quadrado1 = “A área do quadrado q1 é: “+q1.calculaArea()+”\n” + "E o perimetro é: "+q1.calculaPerimetro();
    String quadrado2 = “A área do quadrado q2 é: “+q2.calculaArea()+”\n” + "E o perimetro é: "+q2.calculaPerimetro();
    
}
