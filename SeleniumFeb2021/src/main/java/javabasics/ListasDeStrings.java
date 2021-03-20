package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListasDeStrings {

	public static void main(String[] args) {
		// una lista de strings remover iguales e invertir orden
		List<String> listaDeNombres = new ArrayList<>();
		listaDeNombres.add("Persona 1");
		listaDeNombres.add("Persona 2");
		listaDeNombres.add("Persona 3");
		listaDeNombres.add("Persona 4");
		listaDeNombres.add("Persona 5");
		
		//Imprimir lista tal cual esta
		System.out.println(listaDeNombres);
		Collections.sort(listaDeNombres, Collections.reverseOrder());
		System.out.println(listaDeNombres);
		
		List<String> nombresSinRepetir = listaDeNombres
				.stream()
				.distinct().
				collect(Collectors.toList());
		System.out.println(nombresSinRepetir);

	}//main

}//class
