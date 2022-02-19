package questao1;

import java.util.Scanner;

/**
 * <h1>Classe principal respons�vel por executar o programa que realiza a
 * cria��o de uma "escada" a partir de asteriscos. "</h1>
 *
 * <p>
 * Classe principal respons�vel por executar o programa que realiza a cria��o de
 * uma "escada" a partir de asteriscos e espa�os.
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

		// La�o de repeti��o programado para ser executado enquanto o usu�rio n�o
		// digitar "N"

		do {

			escada.solicitarQuantidadeDeDegraus();
			escada.inserirDegrausNaEscada();

			System.out.print("Desejas criar outra escada? Caso negativo, digite 'N'. \n");
			continuar = scanner.next(".").trim().charAt(0);

		} while (continuar != 'N');

		// Fim do a�o de repeti��o programado para ser executado enquanto o usu�rio n�o
		// digitar "N"

		System.out.print("Voc� saiu do programa :(");
		scanner.close();

	}
}
