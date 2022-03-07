package Model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	//2
	public Libretto filtraPunti(int punti) {
		Libretto result = new Libretto();
		for (Voto v : this.voti) {
			if(v.getPunti() == punti) {
				result.add(v);
			}
		}
		return result;
	}
	
	//3
	public Integer puntiEsame(String nome) {
		for(Voto v : this.voti) {
			if(v.getNome().equals(nome)) {
				return v.getPunti();
			}
		}
		return null;
		//throw new IllegalArgumentException("Corso non trovato");
	}
	
	//4
	public boolean isDuplicato(Voto v) {
		for(Voto v1 : this.voti) {
			if(v1.equals(v)) {
				return true;
			}
		}
		return false;
	}
	
	//5
	public boolean isConflitto(Voto v) {
		Integer punti = this.puntiEsame(v.getNome());
		if(punti != null && punti != v.getPunti())
			return true;
			else 
				return false;
	}
	
	
	@Override
	public String toString() {
		return this.voti.toString();
		
	}

}
