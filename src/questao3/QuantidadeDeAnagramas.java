package questao3;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * <h1>Classe reponsável por realizar a verificação da quantidade de
 * anagramas</h1>
 *
 * <p>
 * Contém os métodos responsáveis por realizar a verificação da quantidade de
 * anagramas presentes em determinadas Strings .
 * </p>
 *
 * @author HenriqueSales
 *
 * @see QuantidadeDeAnagramas
 */
public class QuantidadeDeAnagramas {

	int qtdParesAnagramas;

	/**
	 * <h1>Método reponsável por informar a quantidade de pares de anagramas.</h1>
	 *
	 * <p>
	 * Método reponsável por informar a quantidade de pares de anagramas.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see getQtdAnagramas
	 */
	public int getQtdAnagramas() {
		return qtdParesAnagramas;
	}

	/**
	 * <h1>Método reponsável por "salvar" a quantidade de pares de anagramas.</h1>
	 *
	 * <p>
	 * Método responsável por "salvar" a quantidade de pares de anagramas.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see setQtdAnagramas
	 */

	public void setQtdAnagramas(int qtdParesAnagramas) {
		this.qtdParesAnagramas = qtdParesAnagramas;
	}

	/**
	 * <h1>Método reponsável por realizar a verificação da quantidade de pares de
	 * anagramas contidos em determinadas Strings.</h1>
	 *
	 * <p>
	 * Método reponsável por realizar a verificação da quantidade de pares de
	 * anagramas contidos em determinadas Strings.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see quantidadeDeAnagramas
	 */
	public void quantidadeDeAnagramas(String palavra) {

		ArrayList<String> Anagramas = new ArrayList<String>();

		// Laço "For" parametrizado para ser executado enquanto a variável 'A' for menor
		// que o
		// tamanho da palavra recebida por parâmetro
		for (int a = 0; a < palavra.length(); a++) {

			// Laço "For" parametrizado para ser executado enquanto a variável 'b' for menor
			// que o
			// tamanho da palavra recebida por parâmetro
			for (int b = 1; b < palavra.length(); b++) {

				// Verifica se a letra contida no índice 'a' é igual a letra contida no índice
				// 'b' &
				// a variável "a" é menor que a variável "b" & se a é diferente de b
				if (palavra.charAt(a) == palavra.charAt(b) && a < b && a != b) {

					// Verifica se a letra contida no índice 'a' é igual a letra contida no índice
					// 'a'+1 (Verifica se a letra do lado é igual e, caso seja, adiciona na lista de
					// anagramas)
					if (palavra.charAt(a) == palavra.charAt(a + 1)) {
						String c = palavra.substring(a, a + 1);
						Anagramas.add(c);
					}

					else {
						String d = palavra.substring(a, a + 1);
						Anagramas.add(d);
						String e = palavra.substring(a, b);
						Anagramas.add(e);
					}
				}
			}
		}

		setQtdAnagramas(Anagramas.size());

		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
		System.out.println("A palavra: ' " + palavra + " ' possui " + getQtdAnagramas()
				+ " pares de substrings que são anagramas. \n");

		// Se tiver mais de 0 anagramas contidos na lista, imprime os pares de letras
		// que possuem anagramas
		if (Anagramas.size() != 0) {
			System.out.print("As substrings que possuem anagramas são: \n");
			Stream<String> stream = Anagramas.stream();
			stream.forEach(System.out::println);
		}

		System.out.println(
				"--------------------------------------------------------------------------------------------------------");

	}
}
