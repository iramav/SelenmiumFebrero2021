package javabasics;

import javax.swing.JOptionPane;

public class Operaciones {
	/**1) Declarar dos variables numericas ingresando el valor por
	 *  el teclado, muestra por consola la suma, resta, multiplicaci�n division
	 *  
	 *  **/  	
	
	
	public static void main(String[] args) {
	double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero 1"));
	double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero 2"));
	
    //suma
	System.out.println("la suma es:" + (numero1 + numero2));
	JOptionPane.showMessageDialog(null, numero1 + numero2);
	//resta
	System.out.println("la resta es:" + (numero1 - numero2));
	JOptionPane.showMessageDialog(null, "la resta es" +(numero1 - numero2));
	//multiplicaci�n
	System.out.println("la multiplicaci�n es:" + (numero1 * numero2));
	JOptionPane.showMessageDialog(null, "la multiplicaci�n es:" +(numero1 * numero2));
	//divisi�n
	System.out.println("la divisi�n es:" + (numero1 / numero2));
	JOptionPane.showMessageDialog(null,"la divisi�n es:" + (numero1 / numero2));
	
	
	
	
		
			
		
		
	}

}
