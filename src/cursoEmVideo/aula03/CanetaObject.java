package cursoEmVideo.aula03;

public class CanetaObject {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "bic cristal";
		c1.cor = "preta";
		// c1.ponta = 0.5f;
		c1.carga = 33;
		c1.destampar();
		c1.status();
	}

}
