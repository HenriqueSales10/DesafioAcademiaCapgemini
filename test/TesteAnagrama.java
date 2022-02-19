import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import questao3.QuantidadeDeAnagramas;

/**
 * <h1>Classe repons�vel por realizar os testes dos m�todos contidos na
 * classe @see QuantidadeDeAnagramas</h1>
 *
 * <p>
 * Cont�m os m�todos respons�veis por os testes dos m�todos contidos na
 * classe @see QuantidadeDeAnagramas .
 * </p>
 *
 * @author HenriqueSales
 *
 * @see TesteAnagrama
 */
class TesteAnagrama {

	/**
	 * <h1>M�todo repons�vel por testar a quantidade de anagramas retornados ao
	 * informar a palavra "OVO"</h1>
	 *
	 * <p>
	 * M�todo repons�vel por testar o m�todo a quantidade de anagramas retornados ao
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
	 * <h1>M�todo repons�vel por testar a quantidade de anagramas retornados ao
	 * informar a palavra "ifailuhkqq"</h1>
	 *
	 * <p>
	 * M�todo repons�vel por testar o m�todo a quantidade de anagramas retornados ao
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
