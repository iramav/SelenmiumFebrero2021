package javabasics;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
	
//*** 1) Dada una calificacion por telcado mostrar el mensaje segun corresponde

		//si la calificacions es menor o igual de 60 Mensaje(reprobado)
		//si la calificacions es Mayor o igual de 70 pero menor de 90  Mensaje(Aprobado Buena)
		//si la calificacions es Mayor o igual de 90 Mensaje(Aprobado Sobresaliente)	
		
		int nota= Integer.parseInt(JOptionPane.showInputDialog("Ingresar la calificaci�n: "));
		
		if (nota <= 69) {
			System.out.println("Reprobado");
		}else if(nota <90) {
			System.out.println("aprobado buena");
		}else {
			System.out.println("Aprobado sobresaliente");
					
		}
	}
}

