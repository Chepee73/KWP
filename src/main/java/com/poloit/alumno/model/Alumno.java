package com.poloit.alumno.model;


public class Alumno {

	private int alumID;
	private String Nombre;
	private String Apellido;
	private int DNI;
	private int legajo;
	private String email;
	
	public Alumno(int int1, String string, String string2, int int2, int int3, String string3) {
		// TODO Auto-generated constructor stub
	}
	public int getAlumID() {
		return alumID;
	}
	public void setAlumID(int alumID) {
		this.alumID = alumID;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
