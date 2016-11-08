package com.poloit.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.poloit.alumno.model.Alumno;
import com.poloit.alumno.model.alumnoDAO;

public class AlumnoQuerys implements alumnoDAO {

	private DataSource datasource;
	
	public void setDataSource (DataSource datasource)
	{
		this.datasource = datasource;
	}
	
	
	public Alumno findByAlumnoId (int AlumID)
	{
		String sql = "SELECT * FROM Alumno WHERE Id_Alumno = ?";
		
		try
		{
			DataBaseConnector.getConn();
			PreparedStatement ps = DataBaseConnector.getConn().prepareStatement(sql);
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
			DataBaseConnector.closeConnection();
		}
		
		
		
	}
	
	public void insert (Alumno alum) throws SQLException
	{
		String sql = "INSERT INTO Alumno" + 
					 "(Id_Alumno, Nombre, Apellido, DNI, Legajo, Email) VALUES (?,?,?,?,?,?)";
		
		try
		{
			DataBaseConnector.getConn();
			PreparedStatement ps = DataBaseConnector.getConn().prepareStatement(sql);
			
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
			DataBaseConnector.closeConnection();
		}
			
	}
	
	
	
}
