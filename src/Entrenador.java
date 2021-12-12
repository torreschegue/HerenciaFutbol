
public class Entrenador extends Persona {
	
	private String estrategia;

	public Entrenador(String nombre, String apellido, int edad, String estrategia) {
		super(nombre, apellido, edad);
		this.estrategia = estrategia;
	}

	public String getEstrategia() {
		return estrategia;
	}

	@Override
	public void partidoFutbol() {
		System.out.println("Dirigee un partido de Futbol");
		
	}

	@Override
	public void entrenamiento() {
		System.out.println("Dirige un entrenaiento");
		
	}
	
	public void planificarEntrenamaiento() {
		System.out.println("Planificar entrenamiento");
	}
	
	

}
