package javabasics;

public class Cadenas {
	//dada una cadena de caracteres, extraer la cuarta y quinta letra usando el metodo substring
	
	public static void main(String[] args) {
		
		String cadena = "Hola Curso Selenium";
		
		String cadenaguardada = cadena.substring(0, 4);
		
		System.out.println(cadena.substring(0, 4));
		
		if(cadena.equals("Hola Curso Selenium")) {
			 System.out.println("las cadenas son iguales");
		}else {
			System.out.println("Las cadenas no son iguales");
		}
	if (cadena.equalsIgnoreCase("hola Curso Selenium")){
		System.out.println("Las cadenas son iguales");
	}else {
		System.out.println("Las cadenas no son iguales");
	}
	if (cadena.contains("Curso")) {
		System.out.println("si esta el elemento");
	}else {
		System.out.println("No esta el elemento");
	}
	}

}
