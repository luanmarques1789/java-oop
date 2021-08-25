package br.edu.ifpr.palestra.modelo;

public class Participante {
	private String nome;
	private String email;
	private String CPF;

	public String getCPF() {
		return CPF;
	}

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

}
