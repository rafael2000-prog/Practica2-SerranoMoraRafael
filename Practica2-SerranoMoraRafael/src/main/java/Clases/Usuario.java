package Clases;

import java.util.ArrayList;
import java.util.List;

public class Usuario 
{
	
	private String nombre;
	private String cedula;
	private String correo;
	private String contraseña;
	private Pedido unPedido;
	//atributos de la relacion de agregacion
	private List<Carrito> carritoUno;
	
	//Implementacion de constructor vacio
	public Usuario() {
		this.carritoUno=new ArrayList<>();
		
	}
	
	//Implementacion de constructor con todos los atributos
	public Usuario(String nombre, String cedula, String correo, String contraseña) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.correo = correo;
		this.contraseña = contraseña;
		this.unPedido = unPedido;
		
		this.carritoUno=new ArrayList<>();
	}
	

	//Implementacion de Getter y Setter

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Pedido getUnPedido() {
		return unPedido;
	}

	public void setUnPedido(Pedido unPedido) {
		this.unPedido = unPedido;
	}
	
	public void agregarCarrito(Carrito car){
        carritoUno.add(car);
    }
	
	

	//Implementacion de toString
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", contraseña=" + contraseña
				+ ", unPedido=" + unPedido + ", carritouno=" + carritoUno + "]";
	}
	
	//Declaramos los metodos pero sin funcionalidad
	public boolean verificarUsuario()
	{
		return false;
	}
	
		

	

}
