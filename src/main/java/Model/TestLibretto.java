package Model;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto lib = new Libretto();
		lib.add(new Voto("Analisi 1", 30));
		lib.add(new Voto("Fisica 1", 18));
		lib.add(new Voto("Informatica", 25));
		lib.add(new Voto("Algebra lineare", 25));
		
		//1
		System.out.println(lib);

		//2
		System.out.println("Voti pari a 25");
		Libretto lib25 = lib.filtraPunti(25);
		System.out.println(lib25);
		
		//3
		System.out.print("Voto esame Informatica: ");
		int c = lib.puntiEsame("Informatica");
		System.out.println(c);
		
		//4
		
		//5
		
	}

}
