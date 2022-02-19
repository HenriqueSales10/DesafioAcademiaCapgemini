import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import questao1.Escada;
import questao3.QuantidadeDeAnagramas;

/**
 * <h1>Classe reponsável por realizar os testes dos métodos contidos na
 * classe @see Escada</h1>
 *
 * <p>
 * Contém os métodos responsáveis por os testes dos métodos contidos na
 * classe @see Escada .
 * </p>
 *
 * @author HenriqueSales
 *
 * @see TesteEscada
 */
class TesteEscada {

	/**
	 * <h1>Método reponsável por testar a quantidade de degraus retornados ao
	 * informar a quantidade "5"</h1>
	 *
	 * <p>
	 * Método reponsável por testar a quantidade de degraus retornados ao informar a
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
	 * <h1>Método reponsável por testar a quantidade de degraus retornados ao
	 * informar uma letra</h1>
	 *
	 * <p>
	 * 
	 * <h1>Método reponsável por testar a quantidade de degraus retornados ao
	 * informar uma letra. (Neste caso,no terminal deve-se digitar uma letra e, o
	 * método deve retornar 0)
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
	 * <h1>Método reponsável por testar a quantidade de degraus retornados ao
	 * informar um número do tipo Double</h1>
	 *
	 * <p>
	 * 
	 * <h1>Método reponsável por testar a quantidade de degraus retornados ao
	 * informar um número do tipo Double. (Neste caso,no terminal deve-se digitar um
	 * número do tipo Double e, o método deve retornar 0)
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
		System.out.println("Digite algum número do tipo Double para realizar o teste");

		escada.solicitarQuantidadeDeDegraus();

		assertTrue(escada.getNumeroDegraus() == 0);

	}

}
