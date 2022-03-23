package db;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import Model.Voto;

public class librettoDAO {
	
	public boolean creaVoto(Voto v) {
		
		try {
			
		Connection conn = DBConnect.getConnection();
		
		String sql = "INSERT INTO voti (nome,punti) VALUES (?,?)";
		
		PreparedStatement st = conn.prepareStatement(sql);
		
		st.setString(1, v.getNome());
		st.setInt(2, v.getPunti());
		
		
		int res = st.executeUpdate();
		st.close();
		conn.close();
		
		return (res==1);
		
		} catch (SQLException e) {
			System.out.println("e");
			e.printStackTrace();
			return false;
		}
		
	}
	
	public List<Voto> readAllVoto() {
		
		try {
			Connection conn = DBConnect.getConnection();
			
			String sql = "SELECT * From voti";
			
			PreparedStatement st = conn.prepareStatement(sql);
			
			ResultSet res = st.executeQuery(sql);
			
			List<Voto> result = new ArrayList<>();
			
			while(res.next()) {
				String nome = res.getString("nome");
				int punti = res.getInt("punti");
				result.add(new Voto(nome,punti));
			}
			st.close();
			conn.close();
			return result;
			
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
			return null;
		}
		
	}
	
	public Voto readVotoByNome(String nome) {
		return null;
	}

}