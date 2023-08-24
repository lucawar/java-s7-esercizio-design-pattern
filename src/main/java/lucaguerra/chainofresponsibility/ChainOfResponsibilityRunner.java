package lucaguerra.chainofresponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainOfResponsibilityRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Ufficiali generale = new Generale();
		Ufficiali colonnello = new Colonnello();
		Ufficiali maggiore = new Maggiore();
		Ufficiali capitano = new Capitano();

		generale.setUfficialeSuperiore(null);
		capitano.setUfficialeSuperiore(maggiore);
		maggiore.setUfficialeSuperiore(colonnello);
		colonnello.setUfficialeSuperiore(generale);

		int importo = 1001;
		capitano.gestisciRichiesta(importo);
	}

}
