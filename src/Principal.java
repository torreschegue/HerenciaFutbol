import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	static ArrayList<Persona> persona = new ArrayList<Persona>();
	static Scanner entrada = new Scanner(System.in);
	
	static Persona futbolista1 = new Futbolista("Gonzalo", "Higuain", 29, 9, "Delantero");
	static Persona futbolista2 = new Futbolista("Paulo", "Dybala", 23, 21, "Delantero");
	static Persona entrenador = new Entrenador("Massimiliano", "Allegri", 49, "Defensiva");
	static Persona medico = new Medico("Alex", "Marroni", 54, "Licenciado en Fisioterapia", 20);
	
	
	public static void main(String[] args) {
	
		persona.add(futbolista1);
		persona.add(futbolista2);
		persona.add(entrenador);
		persona.add(medico);
		
		// Menu
		menu();
	}
	
	public static void menu() {
		int opcion;
		do {
			
			System.out.println("\t.:MENU:.");
			System.out.println("1.- Viaje de Equipo");
			System.out.println("2.- Entrenamiento");
			System.out.println("3.- Partido de Futbol");
			System.out.println("4.- Planificar entrenamiento");
			System.out.println("5.- Entrevista");
			System.out.println("6.- Curar lesion");
			System.out.println("7.- Salir");
			System.out.println("Opcion: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			
			case 1:System.out.println("");
				viajarEquipo();// Viajes
				break;
			case 2: System.out.println("");
				entrenarEquipo();// Entramiento
				break;
			case 3:System.out.println("");
				partidoFutbol();// Partidos
				break;
			case 4:System.out.println("");
				planificarEntrenamiento(); //Planificacion 
				break;
			case 5: 
				darEntrevista();// Entrenamiento
				break;
			case 6: System.out.println("");
				curarLesiones();// Curar lesion
				break;
			case 7: 
				System.exit(0);// Salir
				break;
			 	
			default: System.out.println("Error, Opcion no valida.");
				break;
			}
		
			System.out.println("");
			
		}while(opcion != 7);
	} // fin de metodo Menu

	public static void viajarEquipo() {
		for(Persona equipo: persona) {
			System.out.print(equipo.getNombre()+ " "+equipo.apellido+ " -> " );
			 equipo.viajar();
		}
	} // Fin del metodo viajarEquipo
	
	public static void entrenarEquipo() {
		for(Persona equipo: persona) {
			System.out.print(equipo.getNombre()+ " "+equipo.apellido+ " -> " );
			 equipo.entrenamiento();
		}
		
	} // Fin del metodo entrenarEquipo
	
	public static void partidoFutbol() {
		for(Persona equipo: persona) {
			System.out.print(equipo.getNombre()+ " "+equipo.apellido+ " -> " );
			 equipo.partidoFutbol();
		}
	} // Fin del metodo partidoFutbol
	
	public static void planificarEntrenamiento() {
		System.out.print(entrenador.getNombre()+ " "+entrenador.getApellido()+ " -> ");
		((Entrenador)entrenador).planificarEntrenamaiento();
	} // Fin del metodo planificarEntrenamiento
	
	public static void darEntrevista() {
		System.out.print(futbolista1.nombre+ " " + futbolista1.apellido + " -> ");
		((Futbolista)futbolista1).entrevista();
		System.out.print(futbolista2.nombre+ " " + futbolista1.apellido + " -> ");
		((Futbolista)futbolista2).entrevista();
	} // Fin de Metodo darEntrevista
	
	public static void curarLesiones() {
		System.out.print(medico.nombre+ " " +medico.apellido + " -> ");
		((Medico)medico).curarLesion();
	} // Fin de Metodo surarLesiones
}
