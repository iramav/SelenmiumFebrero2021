package javabasics;

public class ArregloInvertirOrden {
	
	/**
	*dado el arreglo de 5 indices con los valores 1,2,3,4,5
	*guardar los valores en otro arreglo y mostrarlo invertido en orden 
	**/

	public static void main(String[] args) {
		//Creamos arreglo con 5 inidices (inicializamos el arreglo)
		int[] arreglo1 = {1,2,3,4,5};//0,1,2,3,4
		int[] arreglo2= new int [arreglo1.length]; //{5,4,3,2,1} lo mostrará invertido
		
		for (int i= (arreglo1.length-1), j=0 ; i>=0 ; i--, j++){
			arreglo2[j] = arreglo1[i];
			System.out.println(arreglo2[j]);
		}//arreglo dos indices 0 = 5
		 //arreglo dos indices 1 = 4
		
		
	}//fin del main

}//fin de la clase
