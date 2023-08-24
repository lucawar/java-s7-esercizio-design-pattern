package lucaguerra.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public abstract class Ufficiali {

	private Ufficiali UfficialeSuperiore;
	private final int salario;

	public Ufficiali(int salario) {
		this.salario = salario;
	}

	public abstract void checkRequest(int amount);

	public void processRequest(int amount) {
		if (amount <= salario) {
			System.out.println(getClass().getSimpleName() + " può approvare la richiesta.");
		} else if (UfficialeSuperiore != null) {
			UfficialeSuperiore.processRequest(amount);
		} else {
			System.out.println("Nessun ufficiale superiore può approvare la richiesta.");
		}
	}
}
