
public class Nodo {

	
	private Cliente cliente;
	public Nodo siguiente; //puntero enlace

	public Nodo(Cliente cliente, Nodo nodo){

		this.cliente = cliente;
		this.siguiente = nodo;
	}

	public String getCliente() {
		return cliente.getInformacion();
	}

	public void setValor(Cliente valor) {
		this.cliente = valor;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

}