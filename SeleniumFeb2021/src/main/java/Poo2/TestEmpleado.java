package Poo2;

public class TestEmpleado {
	
	public static void main(String[] args ) {
		
		Empleado E1 = new Empleado ("Irama");
		Directivo D1 = new Directivo ("Ivan");
		Operario OP1 = new Operario ("Silvia");
		Oficial OF1 = new Oficial ("lilian");
		Tecnico T1 = new Tecnico ("Jose");
		Empleado E2 = new Tecnico ("Sergio");
		
		System.out.println(E1);
		System.out.println("");
		System.out.println(E2);
		System.out.println("");
		System.out.println(D1);
		System.out.println("");
    	System.out.println(OP1);
    	System.out.println("");
		System.out.println(OF1);
		System.out.println("");
		System.out.println(T1);
		System.out.println("");
		
		System.out.println(E2.toString());
	}

}
