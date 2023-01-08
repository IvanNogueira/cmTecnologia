
package per_03;

/**
 *
 * @author ivan
 */
public class Quadrado implements Bidimensional {
	private float lado;
	private float perimetro;
	private float area;
	
	/*
	* Métodos de figuras bidimensionais
	*/
	public void calcularPerimetro(){
		
		perimetro = 4 * getLado();
	}
	
	public void calcularArea(){
		
		area = getLado() * getLado();
	}
	
	/*
	* Métodos acessores e modificadores
	*/
	public void setLado(float medidaLado){
		this.lado = medidaLado;
	}
	
	public float getLado(){
		return lado;
	}
	
	public float getPerimetro(){
		return perimetro;
	}
	
	public float getArea(){
		return area;
	}
	
	@Override
	public String toString(){
		return "-> " + this.getClass().getName() +  "\nLado: " + getLado() + "\nPerímetro: " 
			+ getPerimetro() + "\nÁrea: " + getArea() + "\n";
	}
}