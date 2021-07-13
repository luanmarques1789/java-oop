package aula02;

public class Aula {
	String disciplina; // disciplina
	float cargaHoraria; 
	int qtdAlunos; // quantidade de alunos
	String professor; // 
	boolean aulaFeita = false;
	boolean cancelada = false;
	
	void status() {
		System.out.printf("Disciplina: %s%nCarga horária: %3.1f%nProfessor(a): %s%nQuantidade de discentes: %d%nAula preparada: %b%nAula cancelada: %b%n", this.disciplina, this.cargaHoraria, this.professor, this.qtdAlunos, this.aulaFeita, this.cancelada);
	}	
	
	void prepararAula() {
		this.aulaFeita = true;
	}
	
	void cancelarAula() {
		this.cancelada = true;
	}
}
