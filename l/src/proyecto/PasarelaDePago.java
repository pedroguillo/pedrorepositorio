package proyecto;

import java.util.Date;

public class PasarelaDePago {

		private double importe;
		private long codigopago;
		
		public PasarelaDePago (double importe,long codigopago) {
			 this.setImporte(importe);
			 this.setCodigopago();
		}
		public PasarelaDePago (double importe) {
			 this.setImporte(importe);
			 this.setCodigopago();
		}
		/*
		 * Importe que no puede contener mas de 2 decimales.
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
		public double GetImporte() {
			return importe;
		}
		public long GetCodigopago() {
			return codigopago;
		}
}


