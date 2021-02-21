package proyecto;

import java.util.Date;
import java.util.Scanner;
/*
 * Representa un pago
 */
public class PasarelaDePago {

		private double importe;
		private long codigopago;
		private static  double cantidadentrega;
		/**
		 * Constructor
		 * @param importe
		 * @param codigopago
		 * @param cantidadentrega
		 */
		public PasarelaDePago (double importe,long codigopago,double cantidadentrega) {
			 this.setImporte(importe);
			 this.setCodigopago();
			 this.cantidadentrega=cantidadentrega;
			 
		}
		/**
		 * Sobrecarga
		 * @param importe
		 */
		public PasarelaDePago (double importe) {
			 this.setImporte(importe);
			 this.setCodigopago();
		}
		
		/**
		 * El importe que no puede contener mas de 2 decimales
		 * @param importe
		 */
		public void setImporte(double importe) {
			importe=Math.round(importe*100)/100d;
			this.importe=importe;
		}
		/**
		 * El codigo que se genera automaticamente al hacer el pedido.
		 */
		public void setCodigopago() {
			this.codigopago=new Date().getTime();
		}
		/*
		 * Devuelve el importe
		 */
		public double GetImporte() {
			return importe;
		}
		/**
		 * Devuelve el codigo de pago
		 * @return
		 */
		
		public long GetCodigopago() {
			return codigopago;
		}
		/**
		 * Programa de cambio en efectivo
		 * @param cantidadentrega
		 */
		public void efectivo(double cantidadentrega){
			// Declaración de variables
			double entregar = 0;
			int seleccion = 0, cien = 0, cincuenta = 0, veinte = 0, diez = 0, cinco = 0, euro = 0;
			double cambio = 0, cambiof = 0, cent = 0;

			Scanner entrada = new Scanner(System.in);

			// Inicio de la aplicación

			System.out.println("BIENVENIDO A LA PASARELA DE PAGOS");
			System.out.println("*********************************");

			if (importe <= 0) {
				System.out.println("El importe debe ser mayor que cero.");
			}
			while (seleccion <= 0 || seleccion >= 4) {

				System.out.println("SELECCIONE UN MÉTODO DE PAGO");
				System.out.println("****************************");
				System.out.println("1.Efectivo.");
				System.out.println("2.Cargo en Cuenta");
				System.out.println("3.Tarjeta de crédito");
				System.out.println("Seleccione una opción:");

				seleccion = entrada.nextInt();
			}

			//  Pago en efectivo

			switch (seleccion) {
			case 1:
				System.out.println("Introduce la cantidad a entregar(ej 123,45):");
				entregar = entrada.nextFloat();

				if (cambio > (entregar - importe)) {
					importe = importe - 0.01;
				}
				if ((entregar > 1) && (importe < 1)) {
					importe = importe - 0.01;
				}
				cambio = entregar - importe;

				if (entregar < importe) {
					System.out.println("La entrega es menor que el importe");
					System.out.println("Introduce la cantidad a entregar(ej 123,45):");
					entregar = entrada.nextFloat();
				}
				// Cálculo de los billetes
				else {
					for (int i = 1; i < entregar; i++) {
						cambiof = cambio / 100;
						if (cambiof >= 1) {
							cien++;
							cambio = cambio - 100;
						} else {
							cambiof = cambio / 50;
							if (cambiof >= 1) {
								cincuenta++;
								cambio = cambio - 50;
							} else {
								cambiof = cambio / 20;
								if (cambiof >= 1) {
									veinte++;
									cambio = cambio - 20;
								} else {
									cambiof = cambio / 10;
									if (cambiof >= 1) {
										diez++;
										cambio = cambio - 10;
									} else {
										cambiof = cambio / 5;
										if (cambiof >= 1) {
											cinco++;
											cambio = cambio - 5;
										} else {
											cambiof = cambio / 1;
											if (cambiof >= 1) {
												euro++;
												cambio = cambio - 1;
											} else {
												cent = cambio * 100;
												cent = Math.round(cent);
												cent = cent / 100;
											}
											
										}
										
									}
									
								}
								
							}
							
						}

					}
					
				}

			}
			//Devolución de billetes y monedas
			
			System.out.println("SU CAMBIO");
			System.out.println("*****************");

			System.out.println("Billetes de 100€: " + cien);
			System.out.println("Billetes de 50€: " + cincuenta);
			System.out.println("Billetes de 20€: " + veinte);
			System.out.println("Billetes de 10€: " + diez);
			System.out.println("Billetes de 5€: " + cinco);
			System.out.println("Monedas de 1€: " + euro);
			System.out.println("Centimos: " + cent);
			cambiof = entregar - importe;
			cambiof = cambiof * 100;
			cambiof = Math.round(cambiof);
			cambiof = cambiof / 100;
			System.out.println("Total devolución: " +cambiof);
			
		}
		
		@Override
		public String toString() {
			return "Codigo de Pago---->"+GetCodigopago()+GetImporte();
			
		}
		public static void main(String[] args) {
			PasarelaDePago Codigopago=new PasarelaDePago(25);
			Codigopago.efectivo(cantidadentrega);
			System.out.println(Codigopago);
		}
		
}


