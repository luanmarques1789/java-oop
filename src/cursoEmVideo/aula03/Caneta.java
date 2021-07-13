package aula03;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;

	public void status() {
		System.out.printf("Caneta %S %s %1.1f mm%n", this.modelo, this.cor, this.ponta);
		System.out.printf("Carga: %d%nTampada: %b%n", this.carga, this.tampada);
	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro");
		} else {
			System.out.println("Rabisco");
		}
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}
}
