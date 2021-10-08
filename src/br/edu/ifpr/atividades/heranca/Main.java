package br.edu.ifpr.atividades.heranca;

public class Main {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(44, 8);
		funcionario.calcularSalario();
		System.out.println(funcionario.getSalario());

		Secretario secretario = new Secretario(44, 6);
		secretario.calcularSalario();
		secretario.atenderTelefone();
		System.out.println(secretario.getSalario());

		Gerente gerente = new Gerente(44, 6);
		gerente.chefiarDepartamento();
		gerente.calcularSalario();
		System.out.println(gerente.getSalario());

	}
}
