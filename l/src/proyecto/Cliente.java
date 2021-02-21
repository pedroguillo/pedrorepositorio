package proyecto;



import java.util.ArrayList;

import java.util.Date;
/*
 * 
 */
public class Cliente {
	/*
	 * Atributos
	 */
	private String nombre;
	private String apellidos;
	private Date fechadealta;
	private String telefono;
	private String direccion;
	private ArrayList<Pedido> historial;
	
	/**
	 * Constructor
	 * @param nombre
	 * @param apellidos
	 * @param fechadealta
	 * @param telefono
	 * @param direccion
	 */
	public Cliente(String nombre,String apellidos,Date fechadealta,String telefono,String direccion) {
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setFechadeAlta(fechadealta);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		this.setHistorial(new ArrayList <Pedido>());
	}
	/*
	 * Sobrecarga
	 */
	public Cliente(String nombre,String apellidos,String telefono,String direccion) {
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setFechadeAlta(fechadealta);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		this.setHistorial(historial);
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
		this.historial=Historial;
	}
	/**
	 * Devuelve el nombre
	 * @return
	 */
	public String GetNombre() {
		
		return nombre;
	}
	/**
	 * Devuelve apellidos
	 * @return
	 */
	public String GetApellidos() {
		return apellidos;
	}
	/**
	 * Devuelve la fecha de alta
	 * @return
	 */
	public Date GetFechadealta() {
		return fechadealta;
		
	}
	/**
	 * Devuelve el telefono
	 * @return
	 */
	public String GetTelefono() {
		return telefono;
	}
	/**
	 * Devuelve dirección
	 * @return
	 */
	public String GetDireccion() {
		return direccion;
	}
	/**
	 * 
	 */
	public void GetHistorial(){
		for(Pedido p:historial) {
			System.out.println(p.GetPasareladePago());
		}

	}
	/**
	 * Agrega el pedido
	 * @param pedido
	 */
	public void agregarpedido(Pedido pedido) {
		if (historial!=null) {
			historial.add(pedido);
		}
		
		
	}
	
	@Override
	public String toString() {
		return "Nombre------>"+GetNombre()+"\n"+"Apellidos----->"+GetApellidos()+"\n"+"Dirección----> "+GetDireccion()+"\n"+"Fecha----->"+GetFechadealta()+"\n"+"Teléfono----->"+GetTelefono();
	}

	
}
	
