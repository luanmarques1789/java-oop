package br.edu.ifpr.atividades.veiculo;

public class Main {
  public static void main(String[] args) {

    Veiculo bikeUp = new Bicicleta();
    ordemServicos(bikeUp);

    Bicicleta bike = new Bicicleta();
    Automovel auto = new Automovel();
    Veiculo v = new Veiculo();

    // Veiculo autoUp = new Automovel();
    // ordemServicos(autoUp);

  }

  /**
   * O procedimento chama o conjunto de métodos de checagem, limpeza e manutenção
   * do veículo, que foi passado como parâmetro.
   * 
   * @param v - Objeto da hierarquia Veiculo
   */
  public static void ordemServicos(Veiculo v) {
    v.checkList();
    v.manutencao();
    v.limpeza();
    System.out.println();

    // v.checkList(); != this.checkList();
    // v.manutencao(); != this.manutencao();
    // v.limpeza(); != this.limpeza();
  }

  /**
   * Exibe os custos de checagem, manutenção e limpeza da bicicleta.
   * 
   * @param v - Instância da classe Bicicleta
   */
  public static void custoServicos(Bicicleta v) {
    v.osCheckList();
    v.osManutencao();
    v.osLimpeza();
  }
}