package questao3;

import java.util.Scanner;

public class AnagramaMain {

	public static void main(String[] args) {

		char continuar = 'N';

		QuantidadeDeAnagramas qtdAn = new QuantidadeDeAnagramas();

		Scanner scanner = new Scanner(System.in);

		// La�o de repeti��o programado para ser executado enquanto o usu�rio n�o
		// digitar "N"
		do {

			System.out
					.print("Informe a palavra que desejas saber o n�mero de pares de substrings que s�o anagramas: \n");

			String palavra = scanner.nextLine();
			qtdAn.quantidadeDeAnagramas(palavra);

			System.out.print(
					"Desejas verificar outra palavra? Caso positivo, digite 'S'. Caso desejar sair, digite 'N' \n");
			continuar = scanner.nextLine().charAt(0);

		}

		while (continuar != 'N');
		// Fim do a�o de repeti��o programado para ser executado enquanto o usu�rio n�o
		// digitar "N"

		System.out.print("Voc� saiu do programa :(");
		scanner.close();

	}

}