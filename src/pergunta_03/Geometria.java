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
public class Geometria {
	public static void main(String[] args){
		Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(2.5f);
		quadrado1.calcularPerimetro();
		quadrado1.calcularArea();
		
		Circulo circulo1 = new Circulo();
		circulo1.setRaio(3.75f);
		circulo1.calcularPerimetro();
		circulo1.calcularArea();
		
		Circulo circulo2 = new Circulo();
		circulo2.setRaio(4.21f);
		circulo2.calcularPerimetro();
		circulo2.calcularArea();
		
		Cilindro cilindro1 = new Cilindro();
		cilindro1.setAltura(3.57f);
		cilindro1.setBase(circulo2);
		cilindro1.calcularArea();
		cilindro1.calcularVolume();
                
                
		
		System.out.println("\nFiguras bidimensionais\n");
		System.out.println(quadrado1.toString());
		System.out.println(circulo1.toString());
		System.out.println(circulo2.toString());
		
		System.out.println("\nFiguras tridimensionais\n");
		System.out.println(cilindro1.toString());
	}
}