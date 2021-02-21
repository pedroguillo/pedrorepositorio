package proyecto;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private Cliente cliente;
	private Date fechahora;
	private PasarelaDePago pago;
	private double importetotal;
	private String estado;
	private ArrayList<Producto> producto;
	
	public Pedido(Cliente cliente,Date fechahora,PasarelaDePago pago,double importetotal,String estado) {
		this.setCliente(cliente);;
		this.setFechaHora(fechahora);
		this.setPasarelaDePago(pago);
		this.setImporteTotal(importetotal);
		this.setEstado(estado);
		this.SetPedido(new ArrayList<Producto>());
	}
	
	/**
	 * Asigna objeto cliente al pedido
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente=cliente;
	}
	/**
	 * Añade la fecha indicada y si no esta indicada la actual
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
	 * 
	 * @param Pedido
	 */
	public void SetPedido(ArrayList<Producto>Pedido) {
		this.producto=Pedido;
		if (Pedido==null) {
			producto.addAll(producto);
		}
	}
	/*
	 * getters
	 */
	public Cliente GetCliente() {
		return cliente;
	}
	public Date GetFechaHora() {
		return fechahora;
	}
	public PasarelaDePago GetPasareladePago() {
		return pago;	
	}
	public double GetImporteTotal() {
		return importetotal;
	}
	public String GetEstado() {
		return estado;
	}
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
	 * Para guardar el producto en la lista
	 */
	@Override
	public String toString() {
	
	String lista="";	
		
	for (Producto p:producto) {
			lista = lista+p;
	}
	return GetCliente()+lista +"\n"+"CANT  " + "PRODUCTO   " +   "PRECIO  " +  "UD TOTAL"+ "\n"+
								"====   "     + "=========" ;
	
		

		
	}

}		
	
		
		
		
		
	
	
	
		
	
	
	

