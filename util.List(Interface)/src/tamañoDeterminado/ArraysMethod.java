package tamañoDeterminado;

import java.util.Arrays;

class ArraysMethod {


	public int buscarValor(int[]vector, int valorABuscar){
		return Arrays.binarySearch(vector, valorABuscar);
	}
	public int[] copiarArrays(int[]vector, int newLenght){//copia el array y me lo devuelve en un nuevo arrays
	  	return Arrays.copyOf(vector, newLenght);
	}
	public int[] copiarArraysSegunPocision(int[]vector, int begin, int end){
		return Arrays.copyOfRange(vector, begin, end);
	}
	public boolean determinaIgualdad(int[]vector1, int[]vector2){
		
		boolean sonIguales;
		if(Arrays.equals(vector1, vector2)){
			sonIguales = true;
		}else{
			sonIguales= false;
		}
		return sonIguales;
	}
	
	public void agregarElemento(int[]vector,int elemento){
		Arrays.fill(vector, elemento);
	}
	public void ordenarArrays(int[]vector){
		Arrays.sort(vector);
	}
	public String pasajeAString(int[]vector){
		return Arrays.toString(vector);
	}
}
