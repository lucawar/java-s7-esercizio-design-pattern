package lucaguerra.chainofresponsibility;

public class Capitano extends Ufficiali {

	public Capitano() {
		super(1000);

	}

	@Override
	public void verificaRichiesta(int importo) {
		if (importo <= getSalario()) {
			System.out.println("Capitano non può effettuare questa richiesta");
		}

	}
}
