package br.edu.ifpr.atividades.heranca;

public class Secretario extends Funcionario {

	public Secretario() {
		super();
	}

	public Secretario(float valorHora, float horasSemanais) {
		super(valorHora, horasSemanais);
	}

	void atenderTelefone() {
		System.out.println("Alô?");
	}

	protected void marcarReuniao() {
		System.out.println("Reunião marcada");
	}

	@Override
	protected void calcularSalario() {
		setSalario(getValorHora() * getHorasSemanais() * 4 + 50);
	}

}
