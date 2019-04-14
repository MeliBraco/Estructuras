public class ListaNodo {


	Nodo primero;
	Nodo ultimo;
	private int longitud;

	public ListaNodo(){

		primero = null;
		ultimo = null;
	}
	
	public boolean estaVacia(){
		
		boolean estaVacia;
		if (primero == null && ultimo == null){
			estaVacia = true;
		}else{
			estaVacia= false;
		}
		return estaVacia;
	}

	public void AgregarElemento(Cliente dato){

		Nodo nuevoNodo = new Nodo(dato,primero);
		if(dato !=null){
			//truco para ir incertando nodo en las primeras pocisiones 
			nuevoNodo.siguiente = primero;
			primero = nuevoNodo;
			longitud++;
		}	
	}

	public int getLongitud(){
		return this.longitud;
	}

	public void borrarDato(){
		primero = primero.siguiente;
		//primero = primero.siguiente.siguiente; borra los dos primeros elementos
	}
	
	public  mostrarPrimerElemento(){
		return primero.getCliente();
	}
	
	
	
	
	public void mostrarLista(){

		Nodo recorrer = primero;
		while(recorrer != null){
			System.out.println(recorrer.getCliente());
			recorrer =recorrer.siguiente;
		}
	}

}
