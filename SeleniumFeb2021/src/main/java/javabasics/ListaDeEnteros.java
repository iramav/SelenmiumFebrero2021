package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListaDeEnteros {

	public static void main(String[] args) {
		// Declarar nuestra lista de valores de enteros
		
		//Como sacar el mayor y el minimo Ejercicio 
		
		List<Integer> listaDeNumeros = new ArrayList<>();
		listaDeNumeros.add(100);
		listaDeNumeros.add(2);
		listaDeNumeros.add(20);
		listaDeNumeros.add(3);
		listaDeNumeros.add(20);
		listaDeNumeros.add(4);
		listaDeNumeros.add(5);
		listaDeNumeros.add(9);
		listaDeNumeros.add(20);
		listaDeNumeros.add(20);
		listaDeNumeros.add(20);
		listaDeNumeros.add(20);
		
		//Imprime todos los elementos de nuetsra lista	
		System.out.println(listaDeNumeros);
		//ordena la lista de menor a mayor
		Collections.sort(listaDeNumeros);
		System.out.println(listaDeNumeros);
		//Ordenamos e invertimos el orden de nuestra lista
		Collections.sort(listaDeNumeros, Collections.reverseOrder());
		//Imprime todos los elementos de nuestra lista
		System.out.println(listaDeNumeros);
		
		
		//listaDeNumeros.add(9);
		//listaDeNumeros.add(20);
		//listaDeNumeros.add(20);
		//listaDeNumeros.add(2);
		
		//Quitar elementos repetidos en la lista
		Object last = null;//9//20//2
			int numCount = 0;
			Iterator<Integer> i = listaDeNumeros.iterator();
			
		while(i.hasNext()) {
			Object temp= i.next();
			if(temp.equals(last)) {
				i.remove();
				numCount++;
			}else {
				last = temp;
			}//fin else
	}//fin del while
		System.out.println(listaDeNumeros);
	}

}//fin class
