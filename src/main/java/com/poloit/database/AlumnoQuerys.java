package com.poloit.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.poloit.alumno.model.Alumno;
import com.poloit.alumno.model.AlumnoDAO;

public class AlumnoQuerys implements AlumnoDAO {

	private DataSource datasource;
	
	public void setDataSource (DataSource datasource)
	{
		this.datasource = datasource;
	}
	
	
	public Alumno findByAlumnoId (int AlumID)
	{
		String sql = "SELECT A.ID_Alumno,"
				+ "A.Nombre"
				+ "D.ID_Curso,"
				+ "B.ID_Evaluacion,"
				+ "B.Nota,"
				+ "B.Descripcion,"
				+ "C.ID_Evento,"
				+ "C.Fecha,"
				+ "C.Descripcion"
				+ " FROM Alumno AS A"
				+ "INNER JOIN  Alumno_has_Evaluacion AS X"
				+ "ON A.ID_Alumno = X.ID_Alumno"
				+ "INNER JOIN Evaluacion AS B"
				+ "ON B.ID_Evaluacion = X.ID_Evaluacion"
				+ "INNER JOIN Alumno_Has_Evento AS Y"
				+ "ON A.ID_Alumno = Y.ID_Alumno"
				+ "INNER JOIN Evento AS C"
				+ "ON C.ID_Evento = Y.ID_Evento"
				+ "INNER JOIN Curso AS D"
				+ "ON A.ID_Alumno = D.ID_Alumno"
				+ "WHERE A.ID_Alumno = ?";
		
		String sql2 = "Select * FROM Alumno Where ID_Alumno = ?";

		Connection conn = null; 
		
		try
		{
			conn = datasource.getConnection();
			 
			PreparedStatement ps = conn.prepareStatement(sql2);
			ps.setInt(1, AlumID);
			Alumno alumno = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				alumno = new Alumno(
						rs.getInt("Id_Alumno"),
						rs.getString("Nombre"),
						rs.getString("Apellido"),
						rs.getInt("DNI"),
						rs.getInt("Legajo"),
						rs.getString("Email")
						);
			}
			
			rs.close();
			ps.close();
			return alumno;

		} catch (SQLException e){
			throw new RuntimeException(e);
		} finally {
			if(conn!=null)
			{
				try
				{
					conn.close();
				} catch(SQLException e) {}
				
			}
		}
		
		
		
	}
	
	public void insert (Alumno alum) throws SQLException
	{
		String sql = "INSERT INTO Alumno" + 
					 "(Id_Alumno, Nombre, Apellido, DNI, Legajo, Email) VALUES (?,?,?,?,?,?)";
		Connection conn = null;
		
		
		
		try
		{
			conn = datasource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, alum.getAlumID());
			ps.setString(2, alum.getNombre());
			ps.setString(3, alum.getApellido());
			ps.setInt(4, alum.getDNI());
			ps.setInt(5, alum.getLegajo());
			ps.setString(6, alum.getEmail());
			ps.executeUpdate();
			ps.close();
			
		} catch(SQLException e){
			throw new RuntimeException(e);
			
		} finally {
			if (conn != null)
			{
				try
				{
					conn.close();
				} catch (SQLException e){}
			}
		}
			
	}
	
	
}
