package Test;

import Clases.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal1 {
	
	
	public static void main (String[] arg) {
		Scanner p = new Scanner(System.in);
		Pedido pedido = new Pedido();
		Usuario usuario = new Usuario();
		Carrito carrito = new Carrito();
		int subtotal0=0,subtotal1=0,subtotal2=0,subtotal3=0,subtotal4=0,subtotal5=0,subtotal6=0,subtotal7=0,canp=0,total=0,totald=0;
		
		int op=20;
		while (op!=0) 
		{
			System.out.println("MENÚ");
            System.out.println("1.Ingresar Usuario");
            System.out.println("2.Lista de productos");
            System.out.println("3.Agregar a carrito");
            System.out.println("4.Realizar pedido");
            System.out.println("0.Salir");
            System.out.println("ELIJA LA OPCION: ");
            op=p.nextInt();
            if (op==1) 
            {
            	//ingresar información por teclado de Pedido
            	System.out.println("Ingrese dirección: ");
            	String direccion=p.next();
            	//System.out.println("Ingrese numero de pedido: ");
            	//int numeroPedido=p.nextInt();
            	//System.out.println("Ingrese Estado de pedido: ");
            	//String estadoPedido=p.next();
            	
            	//instanciar un nuevo objeto tipo Pedido
            	
            	pedido.setDireccionEnvio(direccion);
            	//pedido.setNumeroPedido(numeroPedido);
            	//pedido.setEstado(estadoPedido);
            	//Imprimir datos de Usuario
            	System.out.println(pedido.toString());
            	
            	
            	//ingresar información por teclado de Usuario
            	System.out.println("Ingrese nombre: ");
            	String nombre=p.next();
            	System.out.println("Ingrese cedula: ");
            	String cedula=p.next();
            	System.out.println("Ingrese correo: ");
            	String correo=p.next();
            	System.out.println("Ingrese contraseña: ");
            	String contraseña=p.next();
            	
            	//instanciar un nuevo objeto tipo Usuario
            	
            	usuario.setNombre(nombre);
            	usuario.setCedula(cedula);
            	usuario.setCorreo(correo);
            	usuario.setContraseña(contraseña);
            	//asignar los objetos creados a partir de las relaciones
            	usuario.setUnPedido(pedido);
            	//Imprimir datos de Usuario y Pedido
            	System.out.println(usuario.toString());
            	System.out.println(usuario.getUnPedido().getDireccionEnvio());
            	
            }
            if (op==2) 
			{
				Electronico electronico0 = new Electronico("Lenovo","0001", "1.Laptop", "1234", 500, "2019");
				Electronico electronico1 = new Electronico("Toshiba","0002", "2.Laptop", "4321", 400, "2022");
				Electronico electronico2 = new Electronico("Samsumg","0003", "3.Celular", "2468", 200, "2023");
				Electronico electronico3 = new Electronico("LG","0004", "4.Celular", "1357", 525, "2020");
				Ropa ropa0 = new Ropa("M", "Azul", "5.Camiseta", "0005", 20, "2021");
				Ropa ropa1 = new Ropa("L", "Negro", "6.Pantalon", "0006", 25, "2024");
				Ropa ropa2 = new Ropa("XL", "Rojo", "7.Chompa", "0007", 30, "2020");
				Ropa ropa3 = new Ropa("XXL", "Blanca", "8.Camisa", "0008", 15, "2021");
				
				System.out.println(electronico0);
				System.out.println(electronico1);
				System.out.println(electronico2);
				System.out.println(electronico3);
				System.out.println(ropa0);
				System.out.println(ropa1);
				System.out.println(ropa2);
				System.out.println(ropa3);
			}
            if(op==3) 
            {
            	Electronico electronico0 = new Electronico("Lenovo","0001", "1.Laptop", "1234", 500, "2019");
				Electronico electronico1 = new Electronico("Toshiba","0002", "2.Laptop", "4321", 400, "2022");
				Electronico electronico2 = new Electronico("Samsumg","0003", "3.Celular", "2468", 200, "2023");
				Electronico electronico3 = new Electronico("LG","0004", "4.Celular", "1357", 525, "2020");
				Ropa ropa0 = new Ropa("M", "Azul", "5.Camiseta", "0005", 20, "2021");
				Ropa ropa1 = new Ropa("L", "Negro", "6.Pantalon", "0006", 25, "2024");
				Ropa ropa2 = new Ropa("XL", "Rojo", "7.Chompa", "0007", 30, "2020");
				Ropa ropa3 = new Ropa("XXL", "Blanca", "8.Camisa", "0008", 15, "2021");
            	
            	int el=20;
				
				
            	while (el!=0) 
            	{
					System.out.println("Elija el producto: ");
					System.out.println("Digite 0 si desea salir");
					
					el=p.nextInt();
					
					if (el==1) {
						carrito.agregarProducto("1.Laptop", "1234", 500, "2019");
						System.out.println("¿Cuantas unidades desea?");
						int can=p.nextInt();
						canp=canp+can;
						subtotal0=can*electronico0.getPrecio();
						
					}
					if (el==2) {
						carrito.agregarProducto("2.Laptop", "4321", 400, "2022");
						System.out.println("¿Cuantas unidades desea?");
						int can=p.nextInt();
						canp=canp+can;
						subtotal1=can*electronico1.getPrecio();
					}
					if (el==3) {
						carrito.agregarProducto("3.Celular", "2468", 200, "2023");
						System.out.println("¿Cuantas unidades desea?");
						int can=p.nextInt();
						canp=canp+can;
						subtotal2=can*electronico2.getPrecio();
					}
					if (el==4) {
						carrito.agregarProducto("4.Celular", "1357", 525, "2020");
						System.out.println("¿Cuantas unidades desea?");
						int can=p.nextInt();
						canp=canp+can;
						subtotal3=can*electronico3.getPrecio();
					}
					if (el==5) {
						carrito.agregarProducto("5.Camiseta", "0005", 20, "2021");
						System.out.println("¿Cuantas unidades desea?");
						int can=p.nextInt();
						canp=canp+can;
						subtotal4=can*ropa0.getPrecio();
					}
					if (el==6) {
						carrito.agregarProducto("6.Pantalon", "0006", 25, "2024");
						System.out.println("¿Cuantas unidades desea?");
						int can=p.nextInt();
						canp=canp+can;
						subtotal5=can*ropa1.getPrecio();
					}
					if (el==7) {
						carrito.agregarProducto("7.Chompa", "0007", 30, "2020");
						System.out.println("¿Cuantas unidades desea?");
						int can=p.nextInt();
						canp=canp+can;
						subtotal6=can*ropa2.getPrecio();
					}
					if (el==8) {
						carrito.agregarProducto("8.Camisa", "0008", 15, "2021");
						System.out.println("¿Cuantas unidades desea?");
						int can=p.nextInt();
						canp=canp+can;
						subtotal7=can*ropa3.getPrecio();
					}
					total = subtotal0+subtotal1+subtotal2+subtotal3+subtotal4+subtotal5+subtotal6+subtotal7;
				}
            	
            	totald=totald+total;
            	carrito.setCantidadProducto(canp);
            	carrito.setTotalCompra(total);
            	System.out.println("Carrito:" + carrito.toString());
				
			}
            if(op==4)
            {
            	int el=0;
				System.out.println("Desea adquirir todos estos productos");
				System.out.println("Carrito:" + carrito.toString());
				System.out.println("1.Si");
				System.out.println("2.No");
				System.out.println("Digite 1 o 2");
				el=p.nextInt();
				if (el==1) 
				{
					int numeroPedido=1;
					Pedido pedido1 = new Pedido(numeroPedido,pedido.getDireccionEnvio(),"Enviado");
					numeroPedido=numeroPedido+1;
					System.out.println(pedido1.toString());
					carrito=new Carrito();
					System.out.println(carrito.toString());
					totald=0;
					canp=0;
					carrito.setCantidadProducto(0);
	            	carrito.setTotalCompra(0);
				
				}
				else 
				{
					System.out.println("Desea borrar los articulos del carrito:");
					System.out.println("1.Si");
					System.out.println("2.No");
					System.out.println("Digite 1 o 2");
					int ele=p.nextInt();
					if (ele==1) 
					{
						carrito=new Carrito();
						System.out.println(carrito.toString());
						totald=0;
						canp=0;
						carrito.setCantidadProducto(0);
		            	carrito.setTotalCompra(0);
					}
					
				}
            }
		}
	}
}
