package cursoEmVideo.aula07;

public class Lutador implements LutadorInterface {

	// Atributtes
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;

	// Especial methods

	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {

		setNome(nome);
		setNacionalidade(nacionalidade);
		setIdade(idade);
		setVitorias(vitorias);
		setDerrotas(derrotas);
		setEmpates(empates);
		setPeso(peso);
		setAltura(altura);

	}

	public String getNome() {
		return this.nome;

	}

	public void setNome(String n) {
		this.nome = n;

	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String n) {
		this.nacionalidade = n;

	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int i) {
		this.idade = i;

	}

	public float getAltura() {
		return this.altura;

	}

	public void setAltura(float a) {
		this.altura = a;
	}

	public float getPeso() {
		return this.peso;

	}

	public void setPeso(float p) {
		this.peso = p;
		setCategoria();

	}

	public String getCategoria() {
		return this.categoria;

	}

	private void setCategoria() {
		if (getPeso() < 52.2) {
			this.categoria = "Inv�lido";

		} else if (getPeso() <= 70.3) {
			this.categoria = "Leve";

		} else if (getPeso() <= 83.9) {
			this.categoria = "M�dio";

		} else if (getPeso() <= 99.5) {
			this.categoria = "Pesado";

		} else if (getPeso() <= 120.2) {

			this.categoria = "Peso pesado";

		} else {
			this.categoria = "Inv�lido";
		}
	}

	public int getVitorias() {
		return this.vitorias;

	}

	public void setVitorias(int v) {
		this.vitorias = v;

	}

	public int getDerrotas() {
		return this.derrotas;

	}

	public void setDerrotas(int d) {
		this.derrotas = d;

	}

	public int getEmpates() {
		return this.empates;

	}

	public void setEmpates(int e) {
		this.empates = e;

	}

	// Code
	public void apresentar() {
		System.out.printf(
				"CHEGOU A HORA!!!\nEu vos apresento %s\nOrigem: %s\nIdade: %d anos\nAltura: %1.2f m\nPeso: %3.2f Kg "
						+ "ganhou %d, perdeu %d e empatou %d lutas!\n-----------------------------------\n\n",
				getNome(), getNacionalidade(), getIdade(), getAltura(), getPeso(), getVitorias(), getDerrotas(), getEmpates());

	}

	public void status() {
		System.out.printf(
				"Nome: %s\nCategoria: %s\nAltura: %1.2f m\nPeso: %3.2f Kg\nVit�rias: %d\nDerrotas: %d\nEmpates: %d\n\n",
				getNome(), getCategoria(), getAltura(), getPeso(), getVitorias(), getDerrotas(), getEmpates());

	}

	public void ganharLuta() {
		setVitorias(getVitorias() + 1);

	}

	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);

	}

	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}

}
