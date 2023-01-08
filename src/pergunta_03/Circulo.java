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
public class Circulo implements Bidimensional {
	private static final float PI = 3.1416f;
	private float raio;
	private float comprimento;
	private float area;
	
	/*
	* Métodos de figuras bidimensionais
	*/
	public void calcularPerimetro(){
		
		comprimento = Math.round(2 * PI * getRaio());
	}
	
	public void calcularArea(){
		
		area = Math.round(PI * getRaio() * getRaio());
	}
	
	/*
	* Métodos acessore e modificadores
	*/
	public void setRaio(float raio){
		this.raio = raio;
	}
	
	public float getRaio(){
		return raio;
	}
	
	public float getComprimento(){
		return comprimento;
	}
	
	public float getArea(){
		return area;
	}
	
	@Override
	public String toString(){
		return "-> " + this.getClass().getName() + "\nRaio: " + getRaio() + "\nComprimento: " 
			+ getComprimento() + "\nÁrea: " + getArea() + "\n";
	}
}
