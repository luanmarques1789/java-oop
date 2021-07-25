package cursoEmVideo.aula08;

public class ProjectPessoas {

	public static void main(String[] args) {
		Aluno al = new Aluno();
		al.setNome("Cl�udio");
		al.setMatr(1111);
		al.setIdade(37);
		al.setCurso("Inform�tica");
		al.setMale(true);
		al.pagarMensalidade();

		Bolsista bol = new Bolsista();
		bol.setNome("Renan");
		bol.setIdade(30);
		bol.setCurso("Inform�tica");
		bol.setBolsa(30);
		bol.setMale(true);
		bol.pagarMensalidade();

	}
}