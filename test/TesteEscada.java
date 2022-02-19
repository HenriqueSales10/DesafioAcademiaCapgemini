import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import questao1.Escada;
import questao3.QuantidadeDeAnagramas;

/**
 * <h1>Classe repons�vel por realizar os testes dos m�todos contidos na
 * classe @see Escada</h1>
 *
 * <p>
 * Cont�m os m�todos respons�veis por os testes dos m�todos contidos na
 * classe @see Escada .
 * </p>
 *
 * @author HenriqueSales
 *
 * @see TesteEscada
 */
class TesteEscada {

	/**
	 * <h1>M�todo repons�vel por testar a quantidade de degraus retornados ao
	 * informar a quantidade "5"</h1>
	 *
	 * <p>
	 * M�todo repons�vel por testar a quantidade de degraus retornados ao informar a
	 * quantidade "5".
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see testeQtdDegraus
	 */
	@Test
	void testeQtdDegraus() {
		Escada escada = new Escada();

		escada.setNumeroDegraus(5);

		assertTrue(escada.getNumeroDegraus() == 5);
	}

	/**
	 * <h1>M�todo repons�vel por testar a quantidade de degraus retornados ao
	 * informar uma letra</h1>
	 *
	 * <p>
	 * 
	 * <h1>M�todo repons�vel por testar a quantidade de degraus retornados ao
	 * informar uma letra. (Neste caso,no terminal deve-se digitar uma letra e, o
	 * m�todo deve retornar 0)
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see testeQtdDegrausInformouLetra
	 */
	@Test
	void testeQtdDegrausInformouLetra() {
		Escada escada = new Escada();

		System.out.println("---------------------------------------------------------");
		System.out.println("Digite alguma letra para realizar o teste");

		escada.solicitarQuantidadeDeDegraus();

		assertTrue(escada.getNumeroDegraus() == 0);

	}

	/**
	 * <h1>M�todo repons�vel por testar a quantidade de degraus retornados ao
	 * informar um n�mero do tipo Double</h1>
	 *
	 * <p>
	 * 
	 * <h1>M�todo repons�vel por testar a quantidade de degraus retornados ao
	 * informar um n�mero do tipo Double. (Neste caso,no terminal deve-se digitar um
	 * n�mero do tipo Double e, o m�todo deve retornar 0)
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see testeQtdDegrausInformouDouble
	 */
	@Test
	void testeQtdDegrausInformouDouble() {
		Escada escada = new Escada();

		System.out.println("---------------------------------------------------------");
		System.out.println("Digite algum n�mero do tipo Double para realizar o teste");

		escada.solicitarQuantidadeDeDegraus();

		assertTrue(escada.getNumeroDegraus() == 0);

	}

}
