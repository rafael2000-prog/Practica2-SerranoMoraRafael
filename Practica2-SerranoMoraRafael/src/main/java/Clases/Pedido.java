package Clases;

public class Pedido 
{
	private int numeroPedido;
	private String direccionEnvio;
	private String estado;
	
	//Implementacion de constructor vacio
	public Pedido() {
		
	}
	
	//Implementacion de constructor con todos los atributos
	public Pedido(int numeroPedido, String direccionEnvio, String estado) {
		super();
		this.numeroPedido = numeroPedido;
		this.direccionEnvio = direccionEnvio;
		this.estado = estado;
	}
	
	//Implementacion de Getter y Setter
	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getDireccionEnvio() {
		return direccionEnvio;
	}

	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	//Implementacion de toString
	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", direccionEnvio=" + direccionEnvio + ", estado=" + estado
				+ "]";
	}
	
	//Declaramos los metodos pero sin funcionalidad
	public boolean confirmacionEntrega()
	{
		return false;
	}
}
