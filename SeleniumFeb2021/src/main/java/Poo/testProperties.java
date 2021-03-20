package Poo;

import comun.leerProperties;

public class testProperties {

	public static void main(String[] args) {
		
		leerProperties prop = new leerProperties();
		
		prop.getSystemProperties();
		
		String mensaje1 = System.getProperty("MENSAJE1");
		String mensaje2 = System.getProperty("MENSAJE2");
		String mensaje3 = System.getProperty("MENSAJE3");
		System.out.println();
		
		System.out.println(mensaje1);
		System.out.println(mensaje2);
		System.out.println(mensaje3);
		
		prop.setSystemPropFileName(System.getProperty("user.dir") + "\\src\\main\\resources\\dataFiles\\data2.properties");
		prop.getSystemProperties();
		String archivo = System.getProperty("MENSAJE11");
		String archivo2 = System.getProperty("MENSAJE12");
		
		System.out.println(archivo);
		System.out.println(archivo2);
		
			

	}

}
