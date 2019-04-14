
public class uso_ArbolBinario {

	public static void main(String[] args) {
		
		
		Arbol arbolito = new Arbol();
		arbolito.insertarElemento(6);
		arbolito.insertarElemento(9);
		arbolito.insertarElemento(1);
		arbolito.insertarElemento(10);
		arbolito.insertarElemento(5);
		arbolito.insertarElemento(30);
		
		System.out.print(arbolito.retornarAltura());
		
	}
}
