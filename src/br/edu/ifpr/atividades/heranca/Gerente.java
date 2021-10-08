package br.edu.ifpr.atividades.heranca;

public class Gerente extends Funcionario {

	public Gerente() {
		super();
	}

	public Gerente(float valorHora, float horasSemanais) {
		super(valorHora, horasSemanais);
	}

	protected void chefiarDepartamento() {
		System.out.println("Chefiando departamento...");
	}

	@Override
	protected void calcularSalario() {
		setSalario(getValorHora() * getHorasSemanais() * 4 * 1.12);
	}
}
