package br.edu.ifpr.palestra.teste;

import br.edu.ifpr.palestra.modelo.Certificado;
import br.edu.ifpr.palestra.modelo.Palestra;
import br.edu.ifpr.palestra.modelo.Palestrante;

public class TesteEncapsulamento {
  public static void main(String[] args) {

    Palestrante palestrante = new Palestrante();
    Palestra palestra = new Palestra();
    Certificado certificado = new Certificado();

    palestrante.nome = "Ricardo";
    certificado.livro = 500;
    palestra.tema = "Assédio Sexual";
  }
}
