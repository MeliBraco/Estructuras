import java.util.PriorityQueue;

//enum Prioridades{High, Medium, Low}; 

public class colaDePrioridades {

	private PriorityQueue<String> cola;
	
	public colaDePrioridades(){
		
		cola = new PriorityQueue<String>();
	}
	
	public void agregarElemento(String elemento){
		this.cola.add(elemento);
	}
	public void eliminarPrimerElemento(){
		this.cola.poll();
	}
	public String consultarPrimerElemento(){
		return this.cola.peek();
	}
}
