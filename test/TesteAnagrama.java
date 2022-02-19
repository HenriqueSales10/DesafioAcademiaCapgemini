import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import questao3.QuantidadeDeAnagramas;

/**
 * <h1>Classe reponsável por realizar os testes dos métodos contidos na
 * classe @see QuantidadeDeAnagramas</h1>
 *
 * <p>
 * Contém os métodos responsáveis por os testes dos métodos contidos na
 * classe @see QuantidadeDeAnagramas .
 * </p>
 *
 * @author HenriqueSales
 *
 * @see TesteAnagrama
 */
class TesteAnagrama {

	/**
	 * <h1>Método reponsável por testar a quantidade de anagramas retornados ao
	 * informar a palavra "OVO"</h1>
	 *
	 * <p>
	 * Método reponsável por testar o método a quantidade de anagramas retornados ao
	 * informar a palavra "OVO".
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see quantidadeAnagramasOvo
	 */
	@Test
	void quantidadeAnagramasOvo() {

		QuantidadeDeAnagramas qtdAnagramas = new QuantidadeDeAnagramas();

		qtdAnagramas.quantidadeDeAnagramas("OVO");

		assertTrue(qtdAnagramas.getQtdAnagramas() == 2);

	}

	/**
	 * <h1>Método reponsável por testar a quantidade de anagramas retornados ao
	 * informar a palavra "ifailuhkqq"</h1>
	 *
	 * <p>
	 * Método reponsável por testar o método a quantidade de anagramas retornados ao
	 * informar a palavra "ifailuhkqq".
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see quantidadeAnagramasifailuhkqq
	 */
	@Test
	void quantidadeAnagramasifailuhkqq() {

		QuantidadeDeAnagramas qtdAnagramas = new QuantidadeDeAnagramas();

		qtdAnagramas.quantidadeDeAnagramas("ifailuhkqq");

		assertTrue(qtdAnagramas.getQtdAnagramas() == 3);

	}

}
