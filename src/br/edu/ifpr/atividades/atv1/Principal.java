package br.edu.ifpr.atividades.atv1;

public class Principal {
	public static void main(String[] args) {
		/** Objeto da classe Curso */
		Curso curso = new Curso();
		curso.nome = "Técnico em Informática";

		/** Objeto da classe Turma */
		Turma turma = new Turma();

		turma.alunosMatriculados = 30;
		turma.numeroMinimo = 10;
		turma.nomeTurma = "3º ano/" + curso.nome;

		/** Objeto da classe Aluno */
		Aluno aluno = new Aluno();
		aluno.nome = "Luan Matheus Marques";

		/** Objeto da classe Matricula */
		Matricula matricula = new Matricula();
		matricula.numero = 20193010358l;

		System.out.printf("Aluno %s está matriculado na turma do %s.\n" + "Sua matricula correspondente é %d.", aluno.nome,
				turma.nomeTurma, matricula.numero);
	}
}