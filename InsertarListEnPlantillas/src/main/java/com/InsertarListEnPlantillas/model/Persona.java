package com.InsertarListEnPlantillas.model;

public class Persona {
	private String nombre;
	private int telefono;


	// Geters Setters

	public String getNombre() {
		return this.nombre;
	}

	/*
	 * public void setNombre(String nombre) {
	 * this.Nombre = nombre;
	 * }
	 */



	public int getTelefono() {
		return this.telefono;
	}

	/*
	 * public void setTelefono(int telefono) {
	 * this.telefono = telefono;
	 * }
	 */


	// Constructor
	public Persona(String nombre, int telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}



}
