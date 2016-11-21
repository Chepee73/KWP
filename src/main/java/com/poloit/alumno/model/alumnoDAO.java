package com.poloit.alumno.model;

import java.sql.SQLException;

public interface AlumnoDAO {

	public void insert (Alumno alumno) throws SQLException;
	public Alumno findByAlumnoId(int alumId);
	
}
