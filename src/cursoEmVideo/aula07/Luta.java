package cursoEmVideo.aula07;

import java.util.Random;

public class Luta implements LutaInterface {
	private Lutador desafiado, desafiante;
	private int rounds;
	private boolean aprovada;

	public Lutador getDesafiado() {
		return desafiado;

	}

	public void setDesafiado(Lutador dd) {
		this.desafiado = dd;
	}

	public Lutador getDesafiante() {
		return desafiante;

	}

	public void setDesafiante(Lutador dd) {
		this.desafiante = dd;

	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;

	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	@Override
	public void marcarLuta(Lutador a, Lutador b) {
		if (a.getCategoria().equals(b.getCategoria()) && a != b) {
			this.setAprovada(true);
			desafiado = a;
			desafiante = b;

		} else {
			this.setAprovada(false);
			a = null;
			b = null;

		}

	}

	@Override
	public void lutar() {

		if (this.isAprovada()) {
			System.out.println("### DESAFIADO ###");
			desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			desafiante.apresentar();
			Random random = new Random();
			int vencedor = random.nextInt(3);

			switch (vencedor) {
			case 0: // Tie fight
				System.out.println("Tie!");
				desafiado.empatarLuta();
				desafiante.empatarLuta();

				break;
			case 1: // Winner challenged
				System.out.printf("Winner %S\n", desafiado.getNome());
				desafiado.ganharLuta();
				desafiante.perderLuta();
				break;

			case 2: // Winner challenger
				System.out.printf("Winner %S\n", desafiante.getNome());
				desafiado.perderLuta();
				desafiante.ganharLuta();
				break;

			default:
				System.out.println("Error!");
			}

		} else {
			System.out.println("The fight CANNOT happen!");

		}

	}
}
