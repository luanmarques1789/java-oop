package br.edu.ifpr.atividades.atv3;

public class Main {
  public static void main(String[] args) {
    AnimalDoacao caramelo = new AnimalDoacao("Canis lupus familiaris", "caramelo", 5, 100.00);

    caramelo.setQtdVacinaAnual(3);
    double[] precoVacinas = { 123.60, 52.90, 30.20 };
    caramelo.calcularMediaVacinas(precoVacinas);
    System.out.println(caramelo.getCustoMedioVacinacao());

    System.out.println(caramelo.toString());

    AnimalDoacao miau = new AnimalDoacao("Felis catus", null, 10, 50.00);
    AnimalDoacao piupiu = new AnimalDoacao("S. canaria", null, 2, 95.60);

    AnimalDoacao.imprimirExtrato(caramelo, miau, piupiu);
  }

}
