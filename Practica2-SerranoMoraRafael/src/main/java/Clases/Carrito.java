package Clases;

import java.util.ArrayList;
import java.util.List;

public class Carrito 
{
	
	private int cantidadProducto;
	private int totalCompra;
	//atributo de la relación de composición
	private List<Producto> productos;
	
	//Implementacion de constructor vacio
	public Carrito() {
		this.productos = new ArrayList<>();
	}
	//Implementacion de constructor
	public Carrito(int cantidadProducto, int totalCompra) {
		super();
		this.cantidadProducto = cantidadProducto;
		this.totalCompra = totalCompra;
		this.productos = new ArrayList<>();
	}
	//Implementacion de Getter y Setter

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public int getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(int totalCompra) {
		this.totalCompra = totalCompra;
	}
	public void agregarProducto(String nombre, String codigo, int precio, String año) {
		productos.add(new Producto(nombre, codigo, precio, año));
	}
	public List<Producto> getProductos(){
		return productos;
	}
	
	//Implementacion de toString
	@Override
	public String toString() {
		return "Carrito [cantidadProducto=" + cantidadProducto + ", totalCompra=" + totalCompra + ", productos="
				+ productos + "]";
	}
	
	//Declaramos los metodos pero sin funcionalidad
		public int calcularTotal()
		{
			return 0;
		}
		
	
	
}
