
public class Arbol {

	Nodo raiz;
	private int cantidadDeElementos;
	private int acumulador;

	public Arbol() {

		raiz = null;
	}

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	// ______ESTA
	// VACIA__________________________________________________________________________________________________________________________

	public boolean estaVacio(Arbol arbol) {

		boolean estaVacio;
		if (raiz == null) {
			estaVacio = true;
		} else {
			estaVacio = false;
		}
		return estaVacio;
	}

	// ______INGRESAR__________________________________________________________________________________________________________________________

	public void insertarElemento(int nuevo) {

		if (raiz == null) {
			raiz = new Nodo(nuevo);
		} else {
			insertar(raiz, nuevo);
		}
	}

	private void insertar(Nodo nodo, int elemento) {

		if (elemento < nodo.getValor()) {

			if (nodo.izquierdo == null) {
				nodo.izquierdo = new Nodo(elemento);
			} else {
				insertar(nodo.izquierdo, elemento);
			}

		} else {

			if (nodo.derecho == null) {
				nodo.derecho = new Nodo(elemento);
			} else {
				insertar(nodo.derecho, elemento);
			}
		}
	}

	// ______MOSTRAR_________________________________________________________________________________________________________________________

	private void preOrden(Nodo Nodo) { // acumula todos los valores de los nodo
										// que sean mayores a 100

		if (Nodo != null) {
			System.out.print(Nodo.getValor() + " ");
			preOrden(Nodo.izquierdo);
			preOrden(Nodo.derecho);
			if (Nodo.getValor() > 2) {
				acumulador = acumulador + Nodo.getValor();
			}

		} else {
			return;
		}
	}

	private void postOrden(Nodo Nodo) { // cuenta elementos del arbolito

		if (Nodo != null) {
			postOrden(Nodo.izquierdo);
			postOrden(Nodo.derecho);
			System.out.print(Nodo.getValor() + " ");
			cantidadDeElementos++;

		} else {
			return;
		}
	}

	private void inOrden(Nodo Nodo) { // suma la canidad de elmentos que tenga
										// como valor mayor a 100

		if (Nodo != null) {
			inOrden(Nodo.izquierdo);
			System.out.print(Nodo.getValor() + " ");
			inOrden(Nodo.derecho);
			if (Nodo.getValor() > 100)
				cantidadDeElementos++;

		} else {
			return;
		}
	}

	public void preOrden() {
		preOrden(raiz);
	}

	public void postOrden() {
		postOrden(raiz);
	}

	public void inOrden() {
		inOrden(raiz);
	}

	// _____EXISTE ELEMENTO -
	// BUSCAR__________________________________________________________________________________________________________

	private boolean existeElemento(Nodo nodo, int elemento) {

		boolean existe = false;
		boolean estaRamaIzquierda = false;
		boolean estaRamaDerecha = false;

		if (nodo != null) {
			if (elemento == nodo.getValor()) {
				existe = true;
			} else {

				if (elemento < nodo.getValor()) {
					estaRamaIzquierda = existeElemento(nodo.izquierdo, elemento);
				} else {
					estaRamaDerecha = existeElemento(nodo.derecho, elemento);
				}

				if (estaRamaIzquierda || estaRamaDerecha) {
					existe = true;
				}
			}
		}
		return existe;
	}

	public void buscar(int elemento) {

		if (existeElemento(raiz, elemento)) {
			System.out.println("Se encontro el elemenento indicado");
		} else {
			System.out.println("NO se encontro el elemento indicado");
		}
	}

	// _____ELIMINAR______________________________________________________________________________________________________________________________

	// ____CANTIDAD DE NODOS
	// HIJOS____________________________________________________________________________________________________________

	private int cantidadNodosHoja(Nodo nodo) {

		int sumar = 0;
		if (nodo != null) {
			if (nodo.getHojaIzquierda() == null && nodo.getHojaDerecha() == null) {
				sumar++;
			} else {
				return cantidadNodosHoja(nodo.getHojaIzquierda()) + cantidadNodosHoja(nodo.getHojaDerecha());
			}

		} else {
			return 0;
		}
		return sumar;
	}

	public int NodosHojas() {
		return cantidadNodosHoja(raiz);

	}

	// ____ ALTURA
	// _____________________________________________________________________________________________________________________

	private int retornarAltura(Nodo nodo) {

		if (nodo != null) {
			return Math.max(retornarAltura(nodo.getHojaIzquierda()), retornarAltura(nodo.getHojaDerecha()) + 1);
		} else {
			return 0;
		}

	}

	public int retornarAltura() {

		return retornarAltura(raiz);

	}

	// ____CANTIDAD DE
	// ELEMENTOS___________________________________________________________________________________________________________________

	public String cantidadDeElementos(Arbol arbol) {
		return "La cantidad de elementos ingresados en el arbol es de: " + cantidadDeElementos;

	}

	// ___ACUMULADOR DE VALORES
	// ______________________________________________________________________________________

	public String sumaDeLosValoresDeLosNodos(Arbol arbolito) {
		return "Todos los valores de los elementos que conforman el arbolito suman un total de: " + acumulador;

	}

	// ____MAXIMO_____________________________________________________________________________________________________________________________

	private int maximo(Nodo nodo) {

		if (nodo != null) {
			maximo(nodo.getHojaDerecha());
			if (maximo(nodo.getHojaDerecha()) > nodo.getValor()) {
				return maximo(nodo.getHojaDerecha());
			} else {
				return nodo.getValor();
			}
		}
		return 0;
	}

	public  int maximo() {
		return maximo(raiz);

	}

	
}
