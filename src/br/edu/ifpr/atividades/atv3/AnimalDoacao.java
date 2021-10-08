package br.edu.ifpr.atividades.atv3;

public class AnimalDoacao {
  private String especie;
  private String raca;
  private int qtdAnimaisDoacao;
  private int qtdVacinaAnual;
  private double custoMedioVacinacao;
  private Double precoAnimalDoacao;

  public AnimalDoacao() {
    super();
  }

  public AnimalDoacao(String especie, String raca, int qtdAnimaisDoacao, Double precoAnimalDoacao) {
    super();
    setEspecie(especie);
    setRaca(raca);
    setQtdAnimaisDoacao(qtdAnimaisDoacao);
    setPrecoAnimalDoacao(precoAnimalDoacao);
  }

  public String getEspecie() {
    return this.especie;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public String getRaca() {
    return this.raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public int getQtdAnimaisDoacao() {
    return this.qtdAnimaisDoacao;
  }

  public void setQtdAnimaisDoacao(int qtdAnimaisDoacao) {
    this.qtdAnimaisDoacao = qtdAnimaisDoacao;
  }

  public int getQtdVacinaAnual() {
    return this.qtdVacinaAnual;
  }

  public void setQtdVacinaAnual(int qtdVacinaAnual) {
    this.qtdVacinaAnual = qtdVacinaAnual;
  }

  public double getCustoMedioVacinacao() {
    return this.custoMedioVacinacao;
  }

  private void setCustoMedioVacinacao(double custoMedioVacinacao) {
    this.custoMedioVacinacao = custoMedioVacinacao;
  }

  public Double getPrecoAnimalDoacao() {
    return this.precoAnimalDoacao;
  }

  public void setPrecoAnimalDoacao(Double precoAnimalDoacao) {
    this.precoAnimalDoacao = precoAnimalDoacao;
  }

  @Override
  public String toString() {
    return "{" + " especie='" + getEspecie() + "'" + ", raca='" + getRaca() + "'" + ", qtdAnimaisDoacao='"
        + getQtdAnimaisDoacao() + "'" + ", qtdVacinaAnual='" + getQtdVacinaAnual() + "'" + ", custoMedioVacinacao='"
        + getCustoMedioVacinacao() + "'" + "}";
  }

  public void calcularMediaVacinas(double... vacinas) {
    double acumulator = 0;
    for (double vac : vacinas) {
      acumulator += vac;
    }

    Double avarage = Double.parseDouble(String.format("%.2f", acumulator / qtdVacinaAnual).replace(",", "."));
    setCustoMedioVacinacao(avarage);

  }

  public final static void imprimirExtrato(AnimalDoacao... animais) {
    System.out.println("------------EXTRATO-------------");
    for (AnimalDoacao animal : animais) {
      System.out.printf("Espécie: %s. Quantidade %d. Preço do animal: %.2f", animal.getEspecie(),
          animal.getQtdAnimaisDoacao(), animal.getPrecoAnimalDoacao());
      System.out.println();
    }
    System.out.println("--------------------------------");
  }

}
