package br.edu.ifpr.atividades.veiculo;

public class Automovel extends Veiculo {
  public Automovel() {
    System.out.println("Automóvel");
  }

  @Override
  public void checkList() {
    System.out.println("Checklist do Automóvel");
  }

  @Override
  public void manutencao() {
    System.out.println("Manutenção do Automóvel");
  }

  @Override
  public void limpeza() {
    System.out.println("Limpeza do Automóvel");
  }

}
