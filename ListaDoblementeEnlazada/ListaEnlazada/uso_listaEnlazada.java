package ListaEnlazada;



public class uso_listaEnlazada {

	public static void main(String []arg){
		
		Lista ListaDeNombres = new Lista();
		
		ListaDeNombres.agregarElementoInicio("Belen");
		ListaDeNombres.agregarElementoInicio("Marta");
		ListaDeNombres.agregarElementoInicio("Logan");
		ListaDeNombres.agregarElementoInicio("Melina");

		ListaDeNombres.mostrarLista();
		System.out.println();
		ListaDeNombres.buscarElemento("Logan");
		
	
		System.out.println();
		System.out.println("ELIMINA PRIMER ELEMENTO");
		
		try {
			ListaDeNombres.eliminarPrimerElemento();
		} catch (Exception e) {
			System.out.print("vacia putooooo");
		}

		ListaDeNombres.mostrarLista();
		
		System.out.println();
		System.out.println("PRIMER ELEMENTO DE LA LISTA: " +ListaDeNombres.getPrimerElemento());
		System.out.println("ULTIMO ELEMENTO DE LA LISTA: " +ListaDeNombres.getUltimoElemento());
		
		try {
			ListaDeNombres.eliminarUltimoElemento();
		} catch (Exception e) {
			System.out.print("vacia putooooo");
		}
		
		ListaDeNombres.mostrarLista();
	}
}
