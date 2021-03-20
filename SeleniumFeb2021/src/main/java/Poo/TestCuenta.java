package Poo;

import java.util.Scanner;

public class TestCuenta {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String numero;
		double tipo;
		double importe;
		//vamos a crear un objecto de nuestra clase cuenta usando el constructor sin parametros
		Cuenta cuenta1 = new Cuenta ();
		//asignar valor a las variables por teclado		
		System.out.println("Ingresa nombre: ");
		nombre = teclado.next();
		System.out.println("Ingresa numero de cuenta: ");
		numero = teclado.next();
		System.out.println("Tipo de interes: ");
		tipo = teclado.nextDouble();
		System.out.println("Saldo");
		importe = teclado.nextDouble();
		teclado.close();
		//Asignar valores con nuestros metodos set
		cuenta1.setNombre(nombre);
		cuenta1.setnumeroCuenta(numero);
		cuenta1.setipoInteres(tipo);
		cuenta1.setsaldo(importe);
		System.out.println(cuenta1.getNombre());
		
		//es utilizar nuestro constructor con parametros y asignarlos
		Cuenta cuenta2 = new Cuenta ("Irama vetancout", "1231231", 12.3, 5000 );
		System.out.println(cuenta2.getNombre());
		
		//utilizar el constructor que recibe objetos 
		Cuenta cuenta3 = new Cuenta (cuenta1);
		System.out.println("Cuenta 1 saldo: " + cuenta1.geSaldo());
		System.out.println("Cuenta 1 saldo: " + cuenta3.geSaldo());
		
		
	}

}
