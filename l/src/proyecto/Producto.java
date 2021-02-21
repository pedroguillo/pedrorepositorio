package proyecto;

import java.util.ArrayList;

public class Producto {
	private String nombre;
	private double precio;
	
	/**
	 * Constructor
	 * @param Nombre
	 * @param Precio
	 */
	public Producto(String Nombre,double Precio){
		this.setNombre(Nombre);
		this.setPrecio(Precio);
	}
	/*
	 * Nombre del producto en mayúsculas
	 */
	public void setNombre(String Nombre) {
		this.nombre=Nombre.toUpperCase();
	}
	/*
	 * Precio del producto
	 */
	public void setPrecio(double Precio) {
		this.precio=Precio;
	}
	/**
	 * Devuelve el nombre del producto
	 * @return
	 */
	public String GetNombre () {
		return nombre;
	}
	/**
	 * Devuelve el pago
	 * @return
	 */
	public double GetPrecio () {
		return precio;
	}
	
	@Override
	public String toString() {
		return GetNombre()+","+GetPrecio()+"€";
		
	};
}
