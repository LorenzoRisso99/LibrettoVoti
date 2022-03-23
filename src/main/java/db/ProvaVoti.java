package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProvaVoti {
	
	public void aggiungiVoto(String nome, int punti) {
		
		String url = "jdbc:mysql://localhost:3306/libretto?user=root&password=Lollotommi99";
		
		try {
			Connection conn = DriverManager.getConnection(url);
			
			String sql = "INSERT INTO voti (nome,punti) VALUES (?,?)";
			
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, nome);
			st.setInt(2, punti);
			
			
			int res = st.executeUpdate();
			st.close();
			conn.close();
			if(res==1) {
				System.out.println("Dato inserito corretto");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		ProvaVoti provaVoti = new ProvaVoti();
		provaVoti.aggiungiVoto("Economia", 30);
		
		
		String url = "jdbc:mysql://localhost:3306/libretto?user=root&password=Lollotommi99";
		
		try {
			Connection conn = DriverManager.getConnection(url);
			
			Statement st = conn.createStatement();
			
			String sql = "SELECT * From voti";
			
			ResultSet res = st.executeQuery(sql);
			
			while(res.next()) {
				String nome = res.getString("nome");
				int voto = res.getInt("punti");
				System.out.println(nome+ " "+voto);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}