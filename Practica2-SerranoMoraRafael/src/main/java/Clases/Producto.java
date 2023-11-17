package Clases;

public class Producto 
{
	private String nombre;
	private String codigo;
	private int precio;
	private String año;
	
	//Implementacion de constructor vacio
	public Producto() {
		
	}
	
	//Implementacion de constructor de todos los atritutos
	public Producto(String nombre, String codigo, int precio, String año) 
	{
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.año = año;
	}

	//Implementacion de Getter y Setter
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getAño() {
		return año;
	}


	public void setAño(String año) {
		this.año = año;
	}

	//Implementacion de toString
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", año=" + año + "]";
	}
	
	//Declaramos los metodos pero sin funcionalidad
	public boolean verificarExistencia()
	{
		return false;
	}
	
	
}
