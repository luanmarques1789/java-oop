package aula08;

public class Bolsista extends Aluno {
	private float bolsa;

	public float getBolsa() {
		return this.bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	@Override
	public void pagarMensalidade	() {
		System.out.println(getNome() + " é bolsista! Desconto de " + getBolsa() + " porcento");
	}
}
