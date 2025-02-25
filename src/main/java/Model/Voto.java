package Model;

import java.util.Objects;

public class Voto {
	
	private String nome;
	private int punti;
	
	public Voto(String nome, int punti) {
		this.nome = nome;
		this.punti = punti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}

	//1
	@Override
	public String toString() {
		return nome + " : " + punti;
	}

	//4
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + punti;
		return result;
	}

	//4
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (punti != other.punti)
			return false;
		return true;
	}


}
