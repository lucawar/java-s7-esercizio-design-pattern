package lucaguerra.adapter;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Info {

	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;
}
