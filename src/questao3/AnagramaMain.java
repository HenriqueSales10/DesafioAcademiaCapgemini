package questao3;

import java.util.Scanner;

public class AnagramaMain {

	public static void main(String[] args) {

		char continuar = 'N';

		QuantidadeDeAnagramas qtdAn = new QuantidadeDeAnagramas();

		Scanner scanner = new Scanner(System.in);

		// Laço de repetição programado para ser executado enquanto o usuário não
		// digitar "N"
		do {

			System.out
					.print("Informe a palavra que desejas saber o número de pares de substrings que são anagramas: \n");

			String palavra = scanner.nextLine();
			qtdAn.quantidadeDeAnagramas(palavra);

			System.out.print(
					"Desejas verificar outra palavra? Caso positivo, digite 'S'. Caso desejar sair, digite 'N' \n");
			continuar = scanner.nextLine().charAt(0);

		}

		while (continuar != 'N');
		// Fim do aço de repetição programado para ser executado enquanto o usuário não
		// digitar "N"

		System.out.print("Você saiu do programa :(");
		scanner.close();

	}

}