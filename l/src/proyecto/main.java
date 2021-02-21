package proyecto;

import java.util.Date;

public class main {

	public static void main(String[] args) {
		
		Producto Cocacola= new Producto("Cocacola",2);
		Cliente Manuel=new Cliente("Manuel","Fernández","645628754","Purisima 12");
		PasarelaDePago pago=new PasarelaDePago(0);
		Pedido pedido=new Pedido(Manuel,new Date(),pago,40,null);
		pedido.agregarproducto(Cocacola);
		System.out.println(pedido);
		PasarelaDePago Codigopago=new PasarelaDePago(0); 
		System.out.println(Codigopago);
		
		

		
	}

}
