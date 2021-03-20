package javabasics;

import java.util.Scanner;

public class SumaParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double par=0;
		double impar=0;
		double residuo;
		double numeroTemp;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Ingrese el numero: ["+i+" ]");
			numeroTemp = teclado.nextDouble ();
			residuo = numeroTemp%2;
			
			if(residuo==0) {
				//par = par + numeroTemp
				par+=numeroTemp;
				System.out.println("El numero es par: "+numeroTemp);
			}
			if(residuo!=0 && residuo>0) {
				impar+=numeroTemp;
				System.out.println("El numero es impar: "+numeroTemp);
			}
		}
		teclado.close();
		
		System.out.println("La sumatoria de los pares es: [" + par + "]");
		System.out.println("La sumatoria de los pares es: [" + impar + "]");

	}//end for

}//end class
