
public class uso_lista {

	
	public static void main (String[]args){
	
		ListaNodo lista = new ListaNodo();
		lista.estaVacia();
		System.out.println(lista.estaVacia());
		
		lista.AgregarElemento(new Cliente("Pablo", 38795));
		lista.AgregarElemento(new Cliente("Roberto", 17548));
		lista.AgregarElemento(new Cliente("Martin", 89752));
		
		
		lista.mostrarPrimerElemento();
		//lista.borrarDato();
		//lista.mostrarLista();
	}
}