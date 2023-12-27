package model;

public class Persona {
	private String Nombre;
	private int telefono;


	// Geters Setters

	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public int getTelefono() {
		return this.telefono;
	}



	// Constructor
	public Persona(String nombre, int telefono) {
		super();
		this.Nombre = nombre;
		this.telefono = telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

}
