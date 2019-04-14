
public class Cliente {

	private String nombre;
	private int id;
	
	public Cliente(String nombre, int id){
		
		this.nombre = nombre;
		this.id = id;
	}

	public String getInformacion() {
		return "NOMBRE: " +nombre+ " ID: " +id;
	}
	
	
}
