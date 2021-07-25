package cursoEmVideo.aula02;

public class CanetaObject {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "bic";
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.carga = 70;
		c1.tampar();
		c1.status();
		c1.rabiscar();

		System.out.println();

		Caneta c2 = new Caneta();
		c2.modelo = "faber";
		c2.cor = "vermelha";
		c2.ponta = 0.7f;
		c2.carga = 100;
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}

}
