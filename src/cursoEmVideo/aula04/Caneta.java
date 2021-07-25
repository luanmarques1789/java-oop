package cursoEmVideo.aula04;

public class Caneta {

	private String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;

	public Caneta(String modelo, String cor, float ponta, boolean tampada) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.tampada = tampada;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

}
