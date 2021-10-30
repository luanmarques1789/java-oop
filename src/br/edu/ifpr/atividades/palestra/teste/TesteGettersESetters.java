package br.edu.ifpr.atividades.palestra.teste;

import br.edu.ifpr.atividades.palestra.modelo.Palestrante;

public class TesteGettersESetters {
  public static void main(String[] args) {
    Palestrante palestrante = new Palestrante();
    System.out.println("CPF: " + palestrante.getCPF()); // retorna null -> não há valor pré-definido na classe
    palestrante.setCPF("456.456.879-63"); // modificando o atributo CPF do objeto palestrante
    System.out.println("CPF: " + palestrante.getCPF()); // exibe: 456.456.879-63

  }
}
