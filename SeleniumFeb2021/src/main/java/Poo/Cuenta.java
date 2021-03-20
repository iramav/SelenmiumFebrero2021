package Poo;

public class Cuenta {
	
	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	
	/**@autor Irama Vetancourt
	*@date 06/03/21
	*@param N/A**/
	
	public Cuenta () {
	}//end cuenta
	
	/**@autor Irama Vetancourt
	*@date 06/03/21
	*@param String String double double**/
		
	
	public Cuenta (String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	
	/**@autor Irama Vetancourt
	*@date 06/03/21
	*@param Object**/
	
	public Cuenta (Cuenta c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;
		
	}//end cuenta
	
	/**@autor Irama Vetancourt
	*@date 06/03/21
	*@param String**/
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
		/**@autor Irama Vetancourt
		*@date 06/03/21
		*@param String**/
		
		public void setnumeroCuenta(String numeroCuenta) {
			this.numeroCuenta = numeroCuenta;
		}
		
		/**@autor Irama Vetancourt
		*@date 06/03/21
		*@param double**/
		
		public void setipoInteres (double tipoInteres) {
			this.tipoInteres = tipoInteres;
		}
		
		/**@autor Irama Vetancourt
		*@date 06/03/21
		*@param double**/
		
		public void setsaldo(double saldo) {
			this.saldo = saldo;
		}
		
		/**@autor Irama Vetancourt
		*@date 06/03/21
		*@param String**/
		
		public String getNombre() {
			return this.nombre;		
		}
		
		/**@autor Irama Vetancourt
		*@date 06/03/21
		*@param String**/
		
		public String getNumeroCuenta() {
			return this.numeroCuenta;		
		}
		/**@autor Irama Vetancourt
		*@date 06/03/21
		*@param double**/
		
		public double getipoInteres() {
			return this.tipoInteres;	
		}
		
		/**@autor Irama Vetancourt
		*@date 06/03/21
		*@param double**/
		
		public double geSaldo() {
			return this.saldo;	
		}
		
		/**@autor Irama Vetancourt
		*@date 06/03/21
		*@param double**/
		
		public boolean ingreso(double n) {
			boolean ingresoCorrecto = true;
			if (n < 0) {
				ingresoCorrecto = false;
			}else {
				saldo = saldo + n;
							
			}
		return ingresoCorrecto;
		
		}
		
		/**@autor Irama Vetancourt
		*@date 06/03/21
		*@param double**/
		
		
		public boolean reintegro (double n ) {
			boolean reintegroCorrecto = true;
			if(n<0) {
				reintegroCorrecto = false;
			}else if (saldo >= n) {
				//saldo = saldo - n;
				saldo -= n;
			}else {
				reintegroCorrecto = false;
				
			}
			return reintegroCorrecto;
		}
		
		/**@autor Irama Vetancourt
		*@date 06/03/21
		*@param Object double**/
		
		public boolean transferencia(Cuenta c, double n) {
			boolean correcto = true;
			if (n<0 ) {
				correcto = false;
			}else if (saldo >= n) {
				reintegro (n);
				c.reintegro(n);
			}else {
		correcto = false;
}

return correcto;
			}
		
	}//end class
	
