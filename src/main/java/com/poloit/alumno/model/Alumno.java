package com.poloit.alumno.model;


public class Alumno {

	private int alumID;
	private String Nombre;
	private String Apellido;
	private int DNI;
	private int legajo;
	private String email;
	
	
	public Alumno(){}
	public Alumno(int alumID, String nombre, String ape, int DNI, int legajo, String email) {
		this.alumID = alumID;
		this.Nombre = nombre;
		this.Apellido = ape;
		this.DNI = DNI;
		this.legajo = legajo;
		this.email = email;
		
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
