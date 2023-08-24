package lucaguerra.chainofresponsibility;

public class Colonnello extends Ufficiali {

	public Colonnello() {
		super(4000);

	}

	@Override
	public void verificaRichiesta(int importo) {
		if (importo <= getSalario()) {
			System.out.println("Colonnello non può effettuare questa richiesta");
		}

	}
}
