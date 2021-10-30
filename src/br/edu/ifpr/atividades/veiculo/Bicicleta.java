package br.edu.ifpr.atividades.veiculo;

public class Bicicleta extends Veiculo implements CustoServicos {
  public Bicicleta() {
    System.out.println("Bicicleta");
  }

  @Override
  public void checkList() {
    System.out.println("CheckList da Bicicleta");
  }

  @Override
  public void manutencao() {
    System.out.println("Manutenção da Bicicleta");
  }

  @Override
  public void limpeza() {
    System.out.println("Limpeza da Bicicleta");
  }

  public void osCheckList() {
    double preco = 30.00;
    System.out.printf("R$%.2f\n", preco);
  }

  public void osManutencao() {
    double preco = 100.00;
    System.out.printf("R$%.2f\n", preco);
  }

  public void osLimpeza() {
    double preco = 70.00;
    System.out.printf("R$%.2f\n", preco);
  }
}
