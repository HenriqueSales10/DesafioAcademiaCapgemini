package questao1;

import java.util.Scanner;

/**
 * <h1>Classe principal responsável por executar o programa que realiza a
 * criação de uma "escada" a partir de asteriscos. "</h1>
 *
 * <p>
 * Classe principal responsável por executar o programa que realiza a criação de
 * uma "escada" a partir de asteriscos e espaços.
 * </p>
 *
 * @author HenriqueSales
 *
 * @see EscadaMain
 */
public class EscadaMain {

	public static void main(String[] args) throws Exception {

		char continuar = 'S';

		Scanner scanner = new Scanner(System.in);

		Escada escada = new Escada();

		// Laço de repetição programado para ser executado enquanto o usuário não
		// digitar "N"

		do {

			escada.solicitarQuantidadeDeDegraus();
			escada.inserirDegrausNaEscada();

			System.out.print("Desejas criar outra escada? Caso negativo, digite 'N'. \n");
			continuar = scanner.next(".").trim().charAt(0);

		} while (continuar != 'N');

		// Fim do aço de repetição programado para ser executado enquanto o usuário não
		// digitar "N"

		System.out.print("Você saiu do programa :(");
		scanner.close();

	}
}
