package br.edu.ifpr.atividades.palestra.modelo;

public class Sala {
	private int capacidade;
	private String nome;
	private String local;

	public int getCapacidade() {
		return capacidade;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
