package EJERCICIO2y3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorBD 
{
	Connection con;
	Statement st;
	ResultSet rs;
	PreparedStatement stmt;
	String url = "jdbc:mysql://localhost/jdbc2";
	String user = "root";
	String password = "root";
	
	public GestorBD()
	{
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList <Fotografo> devuelveFotografo()
	{
		ArrayList <Fotografo> a = new ArrayList<Fotografo>();
		try {
			st = con.createStatement();
			String query = "SELECT * FROM fotografos";
			rs = st.executeQuery(query);
			int idfotografo = 0;
			String nombre = "";
			boolean premiado = false;
			while (rs.next())
			{
				idfotografo = rs.getInt("idfotografo");
				nombre = rs.getString("nombre");
				premiado = rs.getBoolean("premiado");
				Fotografo F1 = new Fotografo (idfotografo,nombre,premiado);
				a.add(F1);
			}
			return a;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
