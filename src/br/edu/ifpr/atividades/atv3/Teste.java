package br.edu.ifpr.atividades.atv3;

public class Teste {
  public static void main(String[] args) {

    Double value = (double) 4 / 3;
    System.out.println("Before formating...");
    System.out.println(value);

    // ---
    String str = String.format("%.2f", value);
    System.out.println(str);

    Double value2 = Double.parseDouble(str.replace(",", "."));
    System.out.println("After formating...");
    System.out.println(value2);

  }

}
