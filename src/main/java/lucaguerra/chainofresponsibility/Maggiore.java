package lucaguerra.chainofresponsibility;

public class Maggiore extends Ufficiali {

	public Maggiore() {
		super(2000);

	}

	@Override
	public void verificaRichiesta(int importo) {
		if (importo <= getSalario()) {
			System.out.println("Maggiore non può effettuare questa richiesta");
		}

	}
}
