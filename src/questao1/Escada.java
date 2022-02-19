package questao1;

import java.util.Scanner;

/**
 * <h1>Classe repons�vel pela cria��o da escada</h1>
 *
 * <p>
 * Cont�m os m�todos respons�veis pela "cria��o" da escada.
 * </p>
 *
 * @author HenriqueSales
 *
 * @see Escada
 */

public class Escada {

	int numeroDegraus;

	/**
	 * <h1>M�todo repons�vel por informar o n�mero de degraus informados pelo
	 * usu�rio.</h1>
	 *
	 * <p>
	 * M�todo respons�vel por informar o n�mero de degraus da escada.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see getNumeroDegraus
	 */
	public int getNumeroDegraus() {
		return numeroDegraus;
	}

	/**
	 * <h1>M�todo repons�vel por "salvar" o n�mero de degraus informados pelo
	 * usu�rio.</h1>
	 *
	 * <p>
	 * M�todo respons�vel por "salvar" o n�mero de degraus da escada.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see setNumeroDegraus
	 */
	public void setNumeroDegraus(int numeroDegraus) {
		this.numeroDegraus = numeroDegraus;
	}

	/**
	 * <h1>M�todo repons�vel por inserir degraus na escada.</h1>
	 *
	 * <p>
	 * M�todo respons�vel por inserir degraus na escada.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see inserirDegrausNaEscada
	 */

	public void inserirDegrausNaEscada() throws Exception {

		int qtdDegraus = getNumeroDegraus();

		int auxiliar = qtdDegraus;

		for (int i = 0; i <= qtdDegraus; i++) {
			if (auxiliar < qtdDegraus) {
				System.out.print(" ".repeat(auxiliar));
				System.out.println("*".repeat(i));
			}
			auxiliar--;
		}

	}

	/**
	 * <h1>M�todo repons�vel por receber a quantidade de degraus da escada.</h1>
	 *
	 * <p>
	 * M�todo respons�vel receber a quantidade de degraus da escada.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see solicitarQuantidadeDeDegraus
	 */

	public void solicitarQuantidadeDeDegraus() {

		Scanner scanner = new Scanner(System.in);

		int numDegraus = 0;

		try {
			System.out.print("Digite a quantidade de degraus da escada: \n");

			numDegraus = scanner.nextInt();
			setNumeroDegraus(numDegraus);

		} catch (Exception e) {
			System.out.println("Digite um valor v�lido !");
			setNumeroDegraus(0);
		}

	}

}
