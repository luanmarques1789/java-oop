package aula04;

public class CanetaObject {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("Faber", "laranja", 1.2f, true);
		System.out.printf("Caneta %S %s %1.1f\n", c1.getModelo(), c1.getCor(), c1.getPonta());
	
	}

}
