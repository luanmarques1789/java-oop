package br.edu.ifpr.atividades.atv2;

public class Sala {
	private int capacidade;
	private String nome;
	private String local;

	/**
	 * Default constructor
	 */
	public Sala(/** No params */
	) {
		// No code
	}

	Sala(int capacidade, String nome, String local) {
		this.capacidade = capacidade;
		this.nome = nome;
		this.local = local;
	}

	void mostrarObjeto() {
		System.out.printf("Nome da Sala: %s\nLocal: %s\nCapacidade: %d", this.nome, this.local, this.capacidade);
	}
}
