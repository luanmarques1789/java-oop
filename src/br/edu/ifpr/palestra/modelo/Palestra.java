package br.edu.ifpr.palestra.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Palestra {
	protected String tema;
	protected Date diaHora;
	protected boolean exigeFrequencia;

	/**
	 * Construtor
	 * 
	 * @param tema            - Assunto da palestra
	 * @param data            - Data no formato: dd/MM/yyyy HH:mm
	 * @param exigeFrequencia - Exigir frequência dos participantes
	 */
	Palestra(String tema, String data, boolean exigeFrequencia) {
		this.tema = tema;
		this.exigeFrequencia = exigeFrequencia;

		try {
			// Converte uma String para um objeto da classe Date
			this.diaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getTema() {
		return this.tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Date getDiaHora() {
		return this.diaHora;
	}

	public void setDiaHora(Date diaHora) {
		this.diaHora = diaHora;
	}

	public Boolean isExigeFrequencia() {
		return this.exigeFrequencia;
	}

	public void setExigeFrequencia(boolean exigeFrequencia) {
		this.exigeFrequencia = exigeFrequencia;
	}
}
