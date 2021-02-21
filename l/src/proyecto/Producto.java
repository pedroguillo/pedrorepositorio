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
	
	public String GetNombre () {
		return nombre;
	}
	public double GetPrecio () {
		return precio;
	}
	
	@Override
	public String toString() {
		return GetNombre()+","+GetPrecio()+"€";
		
	};
}
