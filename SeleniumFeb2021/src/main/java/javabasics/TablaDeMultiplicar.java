package javabasics;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		// Ingresar un numero y que multiplique del 1 al 10}
		
		Scanner Tabla = new Scanner(System.in);
		int tabla1 = 0;
		int resultado = 0;
		int temporal = 0;
		
		System.out.println("Ingresa el numero que quieres multiplicar: ");
		
		temporal = Tabla.nextInt();
		
		while (temporal<0) {
			System.out.println("El numero que ingresaste debe ser mayor que cero, ingresa otro numero");
			
			temporal = Tabla.nextInt();
			
		}//while
		
		for (int indice = 1; indice <= 10; indice ++) {
			
			resultado = indice * temporal;
			
			System.out.println("La multiplicación " + temporal + " Por " + indice + " el resultado es: " + resultado);
		}
	}
	

}
