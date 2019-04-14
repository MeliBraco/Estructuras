package tamañoDeterminado;


class ObjectArrays {

	private double[] vector;
	
	public ObjectArrays(int longitud){
		vector = new double[longitud];
	}
//____________________________________________________________________________________

	public void asignarValores(int pocision, double valor){
		this.vector [pocision] = valor;
	}
	public void asignarValoresConstantes(){
		
		for(int i=0; i<this.vector.length; i++){
			this.vector[i]=10.5;
		}
	}
	public void asignarValoresContinuos(){

		for(int i=0; i<this.vector.length; i++){
			this.vector[i]=i;
		}
	}
	public double obtenerValorMaximoDeLaLista(){

		double maximo =0;
		for(int i =0; i <this.vector.length; i++){
			if(vector[i] > maximo){
				maximo=vector[i];
			}
		}
		return maximo;
	}

	public double obtenerValorMinimoDeLaLista(){

		double minimo =0;

		for(int i =0; i < this.vector.length; i++){
			if(vector[i]  < minimo){
				minimo=vector[i];
			}
		}
		return minimo;
	}
	public void CantidadDeNumeroNegativosYPositivos(){

		/* el numero cero esta incluido en los positivos */
		int numeroPositivo=0;
		int numeroNegativo=0;
		for(int i=0; i<vector.length; i++){
			if(vector[i] >=0){
				numeroPositivo++;
			}else{
				numeroNegativo++;				
			}
		}
		System.out.print("positivos: "+ numeroPositivo + "negativos: " +numeroNegativo);	
	}
	public int sumaDeTodosLosElementos(){

		int valorTotal =0;
		for(int i=0; i<vector.length; i++){
			valorTotal+= vector[i];
		}
		return valorTotal;
	}
	public boolean multiplo( int valorDelMultiplo){

		boolean multiplo =false;
		for(int i=0; i<vector.length; i++){
			if(vector[i]%valorDelMultiplo == 0 ){
				multiplo = true;
			}else{
				multiplo =false;
			}	
		}
		return multiplo;
	}

//________________________________________________________________________________________	
	
	public int longitud(){
		return this.vector.length;
	}
	public double[] clonarVector(){
		return vector.clone();
	}
	public boolean determinarIgualdad(double[]otroVector){
	
		boolean sonIguales;
		if(vector.equals(otroVector)){
			sonIguales = true;
		}else{
			sonIguales= false;
		}
		return sonIguales;
	}
	public String pasajeAString(){
		return vector.toString();
	}
	
}
