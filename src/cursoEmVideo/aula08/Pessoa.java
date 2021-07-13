package aula08;

abstract class Pessoa {
	private String nome;
	private int idade;
	private boolean male;

	public final void fazerAniv() {
		this.idade++;
	}

	// Especial Methods

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isMale() {
		return this.male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

}
