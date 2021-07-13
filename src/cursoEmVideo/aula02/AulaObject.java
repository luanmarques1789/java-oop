package aula02;

public class AulaObject {

	public static void main(String[] args) {
		Aula a1 = new Aula();
		a1.disciplina = "Biologia";
		a1.cargaHoraria = 200.5f;
		a1.professor = "Renata Cabral";
		a1.qtdAlunos = 3000;
		a1.prepararAula();
		a1.cancelarAula();
		a1.status();
	}

}
