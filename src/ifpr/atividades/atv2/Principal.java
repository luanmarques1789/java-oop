package ifpr.atividades.atv2;

public class Principal {
	public static void main(String[] args) {

		Sala sala = new Sala(35, "Sala de palestra", "Bloco 2, 3º andar");
		Palestra palestra = new Palestra("As 10 principais vulnerabilidades na web", "01/03/2021 10:00", true);
		Certificado certificado = new Certificado(4464, 64644, 64646, 4684);
		Palestrante palestrante = new Palestrante("Luís Camargo Pereira", "469-642-564-65", "464.465.644-6");
		Participante participantes[] = new Participante[3];

		gerarParticipantes(participantes);

		System.out.println(palestra.diaHora);
		System.out.println("--------------------");
		sala.mostrarObjeto();
		;
	}

	private static void gerarParticipantes(Participante[] participantes) {
		for (int i = 0; i < participantes.length; i++) {
			participantes[i] = new Participante();
		}

		participantes[0].nome = "Edicarlos Pereira";
		participantes[0].email = "edicarlospereira@gmail.com";
		participantes[0].cpf = "456.556.546-89";

		participantes[1].nome = "Reinaldo Bernardes da Silva";
		participantes[1].email = "reibersilva@gmail.com";
		participantes[1].cpf = "865.456.762-43";

		participantes[2].nome = "Fellipe Castelo Branco";
		participantes[2].email = "fellipecastelo@gmail.com";
		participantes[2].cpf = "336.636.464-31";

		for (Participante participante : participantes) {
			System.out.printf("[%s, %s, %s]", participante.nome, participante.email, participante.cpf);
			System.out.println();
		}
	}

}
