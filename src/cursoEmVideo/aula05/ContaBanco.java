package cursoEmVideo.aula05;

public class ContaBanco {
	public int numConta;
	protected String tipo; // cc - conta corrente, cp - conta poupan�a
	private String dono;
	private double saldo;
	private boolean status;

	public ContaBanco() {
		setSaldo(0);
		setStatus(false);
	}

	public void abrirConta(String t) {
		setTipo(t);
		setStatus(true);

		if (t == "cc") {
			setSaldo(50);

		} else {
			setSaldo(150);

		}
	}

	public void fecharConta() {
		if (getSaldo() == 0) {
			setStatus(false);

		} else {
			System.out.println("Esta conta ainda possui saldo, logo n�o pode ser fechada.");

		}
	}

	public void depositar(double d) {
		if (isStatus() == true) {
			setSaldo(getSaldo() + d);

		} else {
			System.out.println("Esta conta ainda est� fechada. Por favor, abra-a!");
		}
	}

	public void sacar(double s) {
		if (isStatus() == true && getSaldo() >= s) {
			setSaldo(getSaldo() - s);

		} else if (isStatus() == true && getSaldo() < s) {
			System.out.println("Saldo insuficiente!");

		} else {

			System.out.println("A conta n�o foi aberta!");
		}
	}

	public void pagarMensal() {
		double v1 = 12;
		double v2 = 20;

		if (isStatus() == true && getTipo() == "CC") {
			setSaldo(getSaldo() - v1);

		} else if (isStatus() == true && getTipo() == "CC") {
			setSaldo(getSaldo() - v2);

		} else {
			System.out.println("A conta n�o foi aberta!");

		}
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
