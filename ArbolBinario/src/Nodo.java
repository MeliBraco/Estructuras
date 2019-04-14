
public class Nodo {

	private int valor;

	Nodo izquierdo;
	Nodo derecho;

	public Nodo(int valor){
		this.valor = valor;
		
	}

	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public Nodo getHojaIzquierda() {
		return izquierdo;
	}

	public void setHojaIzquierda(Nodo hojoIzquierda) {
		this.izquierdo = hojoIzquierda;
	}

	public Nodo getHojaDerecha() {
		return derecho;
	}

	public void setHojaDerecha(Nodo hojaDerecha) {
		this.derecho = hojaDerecha;
	}


	
	
	
}