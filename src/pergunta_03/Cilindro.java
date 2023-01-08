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
public class Cilindro implements Tridimensional{
	private float altura;
	private Circulo base;
	private float area;
	private float volume;
	
	/*
	* Métodos tridimensionais
	*/
	public void calcularVolume(){
		volume = getBase().getArea() * getAltura();
	}
	
	public void calcularArea(){
		area = (getBase().getComprimento() * getAltura()) + getBase().getArea();
	}
	
	/*
	* Métodos acessores e modificadores
	*/
	public void setAltura(float altura){
		this.altura = altura;
	}
	
	public float getAltura(){
		return altura;
	}
	
	public void setBase(Circulo base){
		this.base = base;
	}
	
	public Circulo getBase(){
		return base;
	}
	
	public float getArea(){
		return area;
	}
	
	public float getVolume(){
		return volume;
	}
	
	@Override
	public String toString(){
		return "-> " + this.getClass().getName() + "\nAltura: " + getAltura() + "\nBase: " 
			+ getBase().getArea() + "\nÁrea: " + getArea() + "\nVolume: " + getVolume() + "\n";
	}
}