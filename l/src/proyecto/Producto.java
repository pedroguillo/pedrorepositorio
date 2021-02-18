package proyecto;

import java.util.ArrayList;

public class Producto {
	private String nombre;
	private double precio;
	
	public Producto(String Nombre,double Precio){
		this.setNombre(Nombre);
		this.setPrecio(Precio);
	}
	public void setNombre(String Nombre) {
		this.nombre=Nombre.toUpperCase();
	}
	public void setPrecio(double Precio) {
		this.precio=Precio;
	}
	
	
	
	
	public static void add(ArrayList<Producto> producto) {
		
	}
	@Override
	public String toString() {
		
	};
}
