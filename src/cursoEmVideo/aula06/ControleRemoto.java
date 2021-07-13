package aula06;

public class ControleRemoto implements Controlador {
	static int aux;

	// Atributtes
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// Especial methods
	public ControleRemoto() {
		setLigado(false);
		setVolume(50);
		setTocando(false);
	}

	// Recomenda-se que os métodos assessores e modificadores sejam públicos
	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int v) {
		this.volume = v;
	}

	public boolean isLigado() {
		return this.ligado;
	}

	public void setLigado(boolean l) {
		this.ligado = l;
	}

	public boolean isTocando() {
		return this.tocando;
	}

	public void setTocando(boolean t) {
		this.tocando = t;
	}

	// Abstract methods
	@Override
	public void ligar() {
		setLigado(true);
	}

	@Override
	public void desligar() {
		setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if (isLigado()) {
			System.out.println("------- MENU -------");
			System.out.println("Ligado: " + isLigado());
			System.out.println("Tocando: " + isTocando());
			System.out.println("Volume: " + getVolume());

			for (int i = 0; i < getVolume(); i += 10) {
				System.out.print("|");
			}

			System.out.println("\n--------------------");
		}

	}

	@Override
	public void fecharMenu() {
		if (isLigado()) {
			System.out.println("Fechando menu...");
		}
	}

	@Override
	public void maisVolume() {
		if (isLigado() == true) {
			setVolume(getVolume() + 5);
			System.out.println("Volume: " + getVolume());
		}

	}

	@Override
	public void menosVolume() {
		setVolume(getVolume() - 5);
		System.out.println("Volume: " + getVolume());

	}

	@Override
	public void ligarMudo() {
		if (isLigado() == true && getVolume() > 0) {
			aux = getVolume();
			setVolume(0);
			System.out.println("Volume: " + getVolume());
		}
	}

	@Override
	public void desligarMudo() {
		if (isLigado() == true && getVolume() == 0) {
			setVolume(aux);
			System.out.println("Volume: " + getVolume());
		}

	}

	@Override
	public void play() {
		if (isLigado() && !(isTocando())) {
			setTocando(true);
			System.out.println("A TV está tocando!");
		}
	}

	@Override
	public void pause() {
		if (isLigado() && isTocando()) {
			setTocando(false);
			System.out.println("A TV NÃO está tocando!");
		}
	}

}
