
enum Prioridad{High, Medium, Low}; 

public class Paciente implements Comparable<Paciente> {

	private final String nombre;
	private Prioridad prioridad;
	
	public Paciente(String nombre, Prioridad prioridad){
		
		this.nombre = nombre;
		this.prioridad = prioridad;
	}

	public String getNombre(){
		return this.nombre;
	}
	public void setPrioridad(Prioridad prioridad){
		this.prioridad= prioridad;
	}
	public Prioridad getPrioridad(){
		return this.prioridad;
	}

	@Override
	public int compareTo(Paciente p){
		return prioridad.compareTo(p.prioridad);

	}
}
