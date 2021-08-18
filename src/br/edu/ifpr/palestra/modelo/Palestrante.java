package br.edu.ifpr.palestra.modelo;

public class Palestrante {
	public String nome;
	public String cpf;
	public String rg;
	public String endereco;
	public String dataNascimento;
	public String cidadeNascimento;
	public String estadoNascimento;

	Palestrante(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}

}
