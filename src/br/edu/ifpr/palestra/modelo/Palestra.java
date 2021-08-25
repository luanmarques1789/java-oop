package br.edu.ifpr.palestra.modelo;

public class Palestra {
	private String tema;
	private String diaHora;
	private boolean frequencia;

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getDiaHora() {
		return this.diaHora;
	}

	public void setDiaHora(String diaHora) {
		this.diaHora = diaHora;
	}

	public Boolean hasFrequencia() {
		return this.frequencia;
	}

	public void setFrequencia(Boolean frequencia) {
		this.frequencia = frequencia;
	}

}
