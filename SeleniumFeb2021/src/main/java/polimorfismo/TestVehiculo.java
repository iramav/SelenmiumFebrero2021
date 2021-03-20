package polimorfismo;

public class TestVehiculo {

	public static void main(String[] args) {
		Vehiculo misVehiculos[] = new Vehiculo[4];
		misVehiculos [0] = new Vehiculo ("HBGTR", "FORD", "2009");
		misVehiculos [1] = new VehiculoTurismo(8, "8JUGJHG","Audi","2010");
		misVehiculos [2] = new VehiculoDeportivo("UTYUJ", "Mazda", "2020",7);
		misVehiculos [3] = new VehiculoFurgoneta ("YUTH","Ford","2030", 4);		
		
		
				
		
		
		for(Vehiculo vehiculos: misVehiculos ) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
		
		}
		Vehiculo vehiculodeportivo = new VehiculoDeportivo ("8JUGJHG","Audi","2010", 12);
		System.out.println(vehiculodeportivo.mostrarDatos());
		
	}

}
