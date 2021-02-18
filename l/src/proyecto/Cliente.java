package proyecto;



import java.util.ArrayList;

import java.util.Date;
/*
 * Clase cliente 
 */
public class Cliente {
	private String nombre;
	private String apellidos;
	private Date fechadealta;
	private String telefono;
	private String direccion;
	private ArrayList<Pedido> Historial;
	
	public Cliente(String nombre,String apellidos,Date fechadealta,String telefono,String direccion) {
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setFechadeAlta(fechadealta);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		this.setHistorial(Historial);
	}
	public Cliente(String nombre,String apellidos,String telefono,String direccion) {
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setFechadeAlta(fechadealta);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		this.setHistorial(Historial);
	}
	/*
	 * El nombre del cliente
	 */
	public void setNombre(String nombre) {
		this.nombre=nombre.toLowerCase();
	}
	/**
	 * Los apellidos del cliente
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos.toUpperCase();
	}
	/**
	 * La fecha del pedido
	 * @param fechadealta
	 */
	public void setFechadeAlta(Date fechadealta) {
		this.fechadealta=fechadealta;
		if(fechadealta==null) {
			this.fechadealta=new Date();
		}
		
	}
	/**
	 * El telefono del cliente
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		telefono=telefono.replace(" ", "");
		if((telefono.length()==9) && telefono.charAt(0)=='6'||telefono.charAt(0)=='7'||telefono.charAt(0)=='8'||telefono.charAt(0)=='9') {
			this.telefono=telefono;
		}else {
			this.telefono="0000000000";
			System.out.println("ERROR:El telefono debe ser de 9 cifras");
		}
		
	}
	/**
	 * La direccion del cliente
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	/**
	 * El historial que indica los pedidos.
	 * @param Historial
	 */
	public void setHistorial(ArrayList<Pedido> Historial) {
		this.Historial=Historial;
	}
	public String GetNombre() {
		
		return nombre;
	}
	public String GetApellidos() {
		return apellidos;
	}
	public Date GetFechadealta() {
		return fechadealta;
		
	}
	public String GetTelefono() {
		return telefono;
	}
	public String GetDireccion() {
		return direccion;
	}
	public ArrayList<Pedido> GetHistorial(){
		return Historial;
	}
	public void agregarpedido(Pedido pedido) {
		if (Historial!=null) {
			Historial.add(pedido);
		}
		
		
	}
	
	@Override
	public String toString() {
		return GetNombre()+","+GetApellidos()+", "+GetDireccion()+","+GetFechadealta()+","+GetTelefono();
	}
	public static void main(String[] args) {
		Date myDate=new Date();
		Cliente c1=new Cliente("Pedro","Guilló Segura","693062746","Purisima 12");
		System.out.println(c1);
		
	
	}
	
}
	
//TODO Que muestre la fecha actual que el metodo agregar pedido se agregue al historial de un cliente, el array historial.


