package javabasics;

import javax.swing.JOptionPane;

public class Arreglo {

	public static void main(String[] args) {
		//declaración de arreglo
		
		int numeros [] = new int[5];
		
		rellenarListaDeNumeros(numeros);
		mostrarArreglo(numeros);
		
		//valores a ingresar 5,6,7,8,9
		
					
		}//fin del main
	
	//Nos debe decir indice 0 tiene le valor de 5 
	
	public static void rellenarListaDeNumeros(int arreglo[]) {
		for (int i=0; i<arreglo.length;i++) {
			String texto = JOptionPane.showInputDialog("Ingresa un nuemro");
			arreglo [i] = Integer.parseInt(texto);
	}
		
	}//
	
	public static void mostrarArreglo(int arreglo []) {
		for(int i=0 ; i<arreglo.length; i++) { 
			System.out.println("El indice ["+i+"] " + "Esta el valor de ["+arreglo[i] + " ]" );
	    }
	}
}
