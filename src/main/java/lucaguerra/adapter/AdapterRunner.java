package lucaguerra.adapter;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdapterRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		Info info = new Info();
		info.setNome("Mario");
		info.setCognome("Rossi");
		info.setDataDiNascita(LocalDate.of(1985, 5, 15));

		InfoAdapter infoAdapter = new InfoAdapter(info);

		UserData userData = new UserData();
		userData.getData(infoAdapter);

		System.out.println("Nome Completo: " + userData.getNomeCompleto());
		System.out.println("Età: " + userData.getEta());
	}
}
