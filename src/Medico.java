
public class Medico extends Persona{
	
	private String titulacion;
	private int a�osExperiencia;
	
	
	public Medico(String nombre, String apellido, int edad, String titulacion, int a�osExperiencia) {
		super(nombre, apellido, edad);
		this.titulacion = titulacion;
		this.a�osExperiencia = a�osExperiencia;
	}


	public String getTitulacion() {
		return titulacion;
	}


	public int getA�osExperiencia() {
		return a�osExperiencia;
	}


	@Override
	public void partidoFutbol() {
		System.out.println("Da Asistencia en un partido de Futbol.");
	}


	@Override
	public void entrenamiento() {
		System.out.println("Da asistencia en un entrenamiento.");
		
	}
	
	public void curarLesion() {
		System.out.println("Curar lesion.");
	}
	
	
	
	

}
