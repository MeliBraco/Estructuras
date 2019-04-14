package ListaEnlazada;

public class Lista {

	private Nodo inicio;
	private Nodo fin;
	
	public Lista(){
		
		inicio = null;
		fin = null;
	}
	
	public boolean estaVacia(){

		boolean estaVacia;
		if(inicio == null){
			estaVacia = true;
		}else{
			estaVacia=false;
		}
		return estaVacia;
	}
	
	public  void agregarElementoInicio(String valor){
		
		Nodo nuevoNodo = new Nodo(valor);
		if(estaVacia()){
			inicio = nuevoNodo;
		}else{
			nuevoNodo.setSiguiente(inicio);
			inicio.setAnterior(nuevoNodo);
			inicio = nuevoNodo;
		}
	}
	
	public void agregarElementoFinal(String valor){
		
		Nodo nuevoNodo = new Nodo(valor);
        
		if(estaVacia()){
        inicio = nuevoNodo;
        }else{
        	Nodo recorrer = inicio;
        	while(recorrer.getSiguiente() != null){
        		recorrer = recorrer.getSiguiente();
        		fin = recorrer;
        	}
        	fin.setSiguiente(nuevoNodo);
        	nuevoNodo.setAnterior(fin);
        }
	}

	public void mostrarLista(){
		
		Nodo recorrer = inicio;
		while(recorrer != null){
			System.out.print("[" + recorrer.getValor()+ "]--------->");
			recorrer = recorrer.getSiguiente();
		}
	}

	public void eliminarPrimerElemento()throws Exception {

		inicio = inicio.getSiguiente();
		//primero = primero.siguiente.siguiente; borra los dos primeros elementos

	}

	public void eliminarUltimoElemento() throws Exception{

		Nodo recorrer = inicio;
		while(recorrer !=null){
			if(recorrer.getSiguiente() == fin){
				recorrer.siguiente = null;
				fin = recorrer;
			}   
			recorrer = recorrer.getSiguiente();	
			}
		}

	public String getPrimerElemento(){
		return inicio.getValor();
	}
	
	public String getUltimoElemento(){
		
		Nodo recorrer = inicio;
		while(recorrer.getSiguiente() != null){
			recorrer = recorrer.getSiguiente();
			fin = recorrer;
		}
		return fin.getValor();
	}

	public void buscarElemento(String elemento){

		Nodo recorrer = inicio;
		int pocision = 1;
		while(recorrer != null){
			if(elemento == recorrer.getValor()){
				System.out.print(pocision);
			}
			pocision ++;
			recorrer = recorrer.getSiguiente();
		}
	}

	
	
}
