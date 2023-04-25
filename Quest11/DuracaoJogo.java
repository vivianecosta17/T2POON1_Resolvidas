package Quest11;

import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora de início do jogo: ");
		int horaInicio = sc.nextInt();
		System.out.println("Digite o minuto de início do jogo: ");
		int minutoInicio = sc.nextInt();
		System.out.println("Digite a hora de término do jogo: ");
		int horaFim = sc.nextInt();
		System.out.println("Digite o minuto de término do jogo: ");
		int minutoFim = sc.nextInt();

		int duracaoHoras = 0;
		int duracaoMinutos = 0;

		if (horaInicio == horaFim && minutoInicio == minutoFim) {
			duracaoHoras = 24;
		} else {
			duracaoHoras = horaFim - horaInicio;
			duracaoMinutos = minutoFim - minutoInicio;

			if (duracaoMinutos < 0) {
				duracaoHoras--;
				duracaoMinutos += 60;
			}

			if (duracaoHoras < 0) {
				duracaoHoras += 24;
			}
		}

		System.out.println("Duração do jogo: " + duracaoHoras + " horas e " + duracaoMinutos + " minutos.");

		sc.close();
	}
}