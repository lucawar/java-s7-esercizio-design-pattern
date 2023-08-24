package lucaguerra.chainofresponsibility;

public class Tenente extends Ufficiali {

	public Tenente() {
		super(3000);

	}

	@Override
	public void verificaRichiesta(int importo) {
		if (importo <= getSalario()) {
			System.out.println("Tenente non può effettuare questa richiesta");
		}

	}
}
