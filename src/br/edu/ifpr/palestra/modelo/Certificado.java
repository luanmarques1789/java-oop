package br.edu.ifpr.palestra.modelo;

public class Certificado {
	private int livro;
	private int folha;
	private int pagina;
	private int numeroDoCertificado;

	Certificado(int livro, int folha, int pagina, int numeroDoCertificado) {
		this.livro = livro;
		this.folha = folha;
		this.pagina = pagina;
		this.numeroDoCertificado = numeroDoCertificado;
	}
}
