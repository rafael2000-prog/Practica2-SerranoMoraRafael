package Clases;

public class Ropa extends Producto
{
	private String talla;
	private String color;
	
	//Implementacion de constructor vacio
	public Ropa() {
		
	}
	
	//Implementacion de constructor de todos los atributos
	public Ropa(String talla, String color, String nombre, String codigo, int precio, String año) 
	{
		super(nombre, codigo, precio, año);
		this.talla = talla;
		this.color = color;
	}
	//Implementacion de Getter y Setter
	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//Implementacion de toString

	@Override
	public String toString() {
		return super.toString() + "Ropa [talla=" + talla + ", color=" + color + "]";
	}
	
	
		
}
