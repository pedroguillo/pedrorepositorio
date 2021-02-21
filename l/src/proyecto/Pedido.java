package proyecto;

import java.util.ArrayList;
import java.util.Date;
/*
 * Representa el pedido de un cliente
 */
public class Pedido {
	/**
	 * Atributos
	 */
	private Cliente cliente;
	private Date fechahora;
	private PasarelaDePago pago;
	private double importetotal;
	private String estado;
	private ArrayList<Producto> producto;
	private int posicion;
	
	/**
	 * Constructor
	 * @param cliente
	 * @param fechahora
	 * @param pago
	 * @param importetotal
	 * @param estado
	 */
	public Pedido(Cliente cliente,Date fechahora,PasarelaDePago pago,double importetotal,String estado) {
		this.setCliente(cliente);;
		this.setFechaHora(fechahora);
		this.setPasarelaDePago(pago);
		this.setImporteTotal(importetotal);
		this.setEstado(estado);
		this.SetPedido(new ArrayList<Producto>());
	}
	
	/**
	 * El cliente que realiza el pedido
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente=cliente;
	}
	/**
	 * Fecha en la que se hace el pedido
	 * @param FechaHora
	 */
	public void setFechaHora(Date FechaHora) {
		this.fechahora=FechaHora;
		
	}
	/**
	 * Para pagar el pedido
	 * @param pago
	 */
	public void setPasarelaDePago(PasarelaDePago pago) {
		 this.pago=pago;
	}
	/**
	 * El precio total del pedido
	 * @param ImporteTotal
	 */
	public void setImporteTotal(double ImporteTotal) {
		this.importetotal=ImporteTotal;
	}
	/**
	 * Representa en el estado en el que esta el pedido
	 * @param Estado
	 */
	public void setEstado(String Estado) {
		this.estado=Estado;
	}
	/**
	 * El array del pedido
	 * @param Pedido
	 */
	public void SetPedido(ArrayList<Producto>Pedido) {
		this.producto=Pedido;
		if (Pedido==null) {
			producto.addAll(producto);
		}
	}
	/**
	 * Devuelve el cliente
	 * @return
	 */
	public Cliente GetCliente() {
		return cliente;
	}
	/**
	 * Devuelve la fecha y la hora
	 * @return
	 */
	public Date GetFechaHora() {
		return fechahora;
	}
	/**
	 * Devuelve el pago
	 * @return
	 */
	public PasarelaDePago GetPasareladePago() {
		return pago;	
	}
	/**
	 * Devuelve el importe total
	 * @return
	 */
	public double GetImporteTotal() {
		return importetotal;
	}
	/**
	 * Indica el estado del pedido
	 * @return
	 */
	public String GetEstado() {
		return estado;
	}
	/**
	 * Devuelve el array de pedido
	 * @return
	 */
	public ArrayList<Producto>GetProductos(){
		return producto;
	}
	/**
	 * Agrega productos al historial.
	 * @param Productos
	 */
	public  void agregarproducto(Producto Productos) {
		producto.add(Productos);
		
	}
	/*
	 * Elimina productos.
	 */
	public void eliminarproducto(int posicion) {
		if(posicion<=producto.size() && posicion>=0) {
			producto.remove(posicion);
		}else {
			System.out.println("Producto eliminado");
		}
		
	}
	/*
	 * Para guardar el producto en la lista
	 */
	@Override
	public String toString() {
	
	String lista="";	
		
	for (Producto p:producto) {
			lista = lista+p;
	}
	return GetCliente() +"\n"+"CANT  " + "PRODUCTO   " +   "PRECIO UD " +  " TOTAL"+ "\n"+
								"====  "+ "========   " +  "========= "+  " ====="+"\n"+
	lista;
	
		

		
	}

}		
	
		
		
		
		
	
	
	
		
	
	
	

