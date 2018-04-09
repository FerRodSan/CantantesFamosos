package Modelo;

public class CantanteFamoso {

	private String nombre;
	private String discoFamoso;

	public CantanteFamoso(String nombre, String discoFamoso) {
		super();
		this.nombre = nombre;
		this.discoFamoso = discoFamoso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDiscoFamoso() {
		return discoFamoso;
	}

	public void setDiscoFamoso(String discoFamoso) {
		this.discoFamoso = discoFamoso;
	}
	
	@Override
	public String toString() {
		return this.nombre+" "+this.discoFamoso;
	}

}
