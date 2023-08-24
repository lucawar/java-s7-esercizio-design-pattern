package lucaguerra.chainofresponsibility;

public class Generale extends Ufficiali {

	public Generale() {
		super(5000);

	}

	@Override
	public void verificaRichiesta(int importo) {
		if (importo <= getSalario()) {
			System.out.println("Generale non può effettuare questa richiesta");
		}

	}
}
