import java.util.PriorityQueue;

public class uso_paciente {

	public static void main(String[]arg){
		
		PriorityQueue <Paciente> cola = new PriorityQueue <Paciente>();
		 
		Paciente paciente1 = new Paciente("Alba", Prioridad.Medium);
		Paciente paciente2 = new Paciente("Aida", Prioridad.Low);
		Paciente paciente3 = new Paciente("Sara", Prioridad.Low);
		Paciente paciente4 = new Paciente("Marta", Prioridad.High);
		Paciente paciente5 = new Paciente("Valentina", Prioridad.High);
		Paciente paciente6 = new Paciente("Pedro", Prioridad.Low);
		
		cola.add(paciente1);
		cola.add(paciente2);
		cola.add(paciente3);
		cola.add(paciente4);
		cola.add(paciente5);
		cola.add(paciente6);
		
		//ya la lista esta ordenada por el metodo compareTo
		
		//1-mientras el primer elemento de la cola no sea nulo se va a ejecutar el bucle 
		//2-sino es nulo imprime los datos y luego los elimina 
		//3-luego lo elimina
		
		while(cola.peek() != null){
			System.out.println("PACIENTE: " + cola.peek().getNombre() + " PRIORIDAD "+cola.peek().getPrioridad());
			cola.poll();	
		}
	}
}
