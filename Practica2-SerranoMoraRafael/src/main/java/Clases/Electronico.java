package Clases;

public class Electronico extends Producto
{
	private String marca;
	private String numeroSerie;
	
	//Implementacion de constructor vacio
	public Electronico () {
		
	}
	
	//Implementacion de constructor de todos los atributos
	public Electronico(String marca, String numeroSerie, String nombre, String codigo, int precio, String año) 
	{
		super(nombre, codigo, precio, año);
		this.marca = marca;
		this.numeroSerie = numeroSerie;
	}
	//Implementacion de Getter y Setter
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	//Implementacion de toString

	@Override
	public String toString() {
		return super.toString() + "Electronico [marca=" + marca + ", numeroSerie=" + numeroSerie + "]";
	}
	
	
	
	
		

}
