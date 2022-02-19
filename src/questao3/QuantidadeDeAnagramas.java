package questao3;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * <h1>Classe repons�vel por realizar a verifica��o da quantidade de
 * anagramas</h1>
 *
 * <p>
 * Cont�m os m�todos respons�veis por realizar a verifica��o da quantidade de
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
	 * <h1>M�todo repons�vel por informar a quantidade de pares de anagramas.</h1>
	 *
	 * <p>
	 * M�todo repons�vel por informar a quantidade de pares de anagramas.
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
	 * <h1>M�todo repons�vel por "salvar" a quantidade de pares de anagramas.</h1>
	 *
	 * <p>
	 * M�todo respons�vel por "salvar" a quantidade de pares de anagramas.
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
	 * <h1>M�todo repons�vel por realizar a verifica��o da quantidade de pares de
	 * anagramas contidos em determinadas Strings.</h1>
	 *
	 * <p>
	 * M�todo repons�vel por realizar a verifica��o da quantidade de pares de
	 * anagramas contidos em determinadas Strings.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see quantidadeDeAnagramas
	 */
	public void quantidadeDeAnagramas(String palavra) {

		ArrayList<String> Anagramas = new ArrayList<String>();

		// La�o "For" parametrizado para ser executado enquanto a vari�vel 'A' for menor
		// que o
		// tamanho da palavra recebida por par�metro
		for (int a = 0; a < palavra.length(); a++) {

			// La�o "For" parametrizado para ser executado enquanto a vari�vel 'b' for menor
			// que o
			// tamanho da palavra recebida por par�metro
			for (int b = 1; b < palavra.length(); b++) {

				// Verifica se a letra contida no �ndice 'a' � igual a letra contida no �ndice
				// 'b' &
				// a vari�vel "a" � menor que a vari�vel "b" & se a � diferente de b
				if (palavra.charAt(a) == palavra.charAt(b) && a < b && a != b) {

					// Verifica se a letra contida no �ndice 'a' � igual a letra contida no �ndice
					// 'a'+1 (Verifica se a letra do lado � igual e, caso seja, adiciona na lista de
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
				+ " pares de substrings que s�o anagramas. \n");

		// Se tiver mais de 0 anagramas contidos na lista, imprime os pares de letras
		// que possuem anagramas
		if (Anagramas.size() != 0) {
			System.out.print("As substrings que possuem anagramas s�o: \n");
			Stream<String> stream = Anagramas.stream();
			stream.forEach(System.out::println);
		}

		System.out.println(
				"--------------------------------------------------------------------------------------------------------");

	}
}
