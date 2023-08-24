package lucaguerra.adapter;

import java.time.LocalDate;

public class InfoAdapter implements DataSource {

	private Info info;

	public InfoAdapter(Info info) {
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {
		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getEta() {
		LocalDate dataDiNascita = info.getDataDiNascita();
		int eta = LocalDate.now().getYear() - dataDiNascita.getYear() + 1;
		return eta;
	}

}
