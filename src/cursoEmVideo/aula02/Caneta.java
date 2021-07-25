package cursoEmVideo.aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	void status() {
		System.out.printf("Caneta %S %s %1.1f mm%n", this.modelo, this.cor, this.ponta);
		System.out.printf("Carga: %d%nTampada: %b%n", this.carga, this.tampada);
	}

	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro");
		} else {
			System.out.println("Rabisco");
		}
	}

	void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;
	}
}
