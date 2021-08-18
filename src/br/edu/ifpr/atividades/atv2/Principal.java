package br.edu.ifpr.atividades.atv2;

public class Principal {
	public static void main(String[] args) {

		Sala sala = new Sala(35, "Sala de palestra", "Bloco 2, 3º andar");
		Sala sala2 = new Sala();
		Palestra palestra = new Palestra("As 10 principais vulnerabilidades na web", "01/03/2021 10:00", true);
		Certificado certificado = new Certificado(4464, 64644, 64646, 4684);
		Palestrante palestrante = new Palestrante("Luís Camargo Pereira", "469-642-564-65", "464.465.644-6");
		Participante participantes[] = new Participante[3];

		gerarParticipantes(participantes);

		System.out.println(palestra.getDiaHora());
		System.out.println("--------------------");
		sala.mostrarObjeto();
		;
	}

	private static void gerarParticipantes(Participante[] participantes) {
		for (int i = 0; i < participantes.length; i++) {
			participantes[i] = new Participante();
		}

		participantes[0].setNome("Edicarlos Pereira");
		participantes[0].setEmail("edicarlospereira@gmail.com");
		participantes[0].setCpf("456.556.546-89");

		participantes[1].setNome("Reinaldo Bernardes da Silva");
		participantes[1].setEmail("reibersilva@gmail.com");
		participantes[1].setCpf("865.456.762-43");

		participantes[2].setNome("Fellipe Castelo Branco");
		participantes[2].setEmail("fellipecastelo@gmail.com");
		participantes[2].setCpf("336.636.464-31");

		for (Participante participante : participantes) {
			System.out.printf("[%s, %s, %s]", participante.getNome(), participante.getEmail(), participante.getCpf());
			System.out.println();
		}
	}

}
