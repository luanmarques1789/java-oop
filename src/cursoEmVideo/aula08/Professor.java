package aula08;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;

	public void receberAum(float aum) {
		setSalario(getSalario() + aum);
	}

	// Especial methods

	public String getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(String esp) {
		this.especialidade = esp;
	}

	public float getSalario() {
		return this.salario;
	}

	public void setSalario(float sal) {
		this.salario = sal;
	}
}
