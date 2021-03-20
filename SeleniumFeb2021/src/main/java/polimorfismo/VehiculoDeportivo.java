package polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
	
	private int cilindrada;
	
	/**
	 * @author Irama
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param numeroPuertas
	 */	
	
	public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	
	}

	/**
	 * @return the cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}
	

	@Override 
	public String mostrarDatos() {
		return "Matricula: " + matricula+ "\nMarca: "+ marca+ "\nModelo"+modelo+ "\ncilindradas: "+cilindrada ;  
	}
		
	}


