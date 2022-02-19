package questao1;

import java.util.Scanner;

/**
 * <h1>Classe reponsável pela criação da escada</h1>
 *
 * <p>
 * Contém os métodos responsáveis pela "criação" da escada.
 * </p>
 *
 * @author HenriqueSales
 *
 * @see Escada
 */

public class Escada {

	int numeroDegraus;

	/**
	 * <h1>Método reponsável por informar o número de degraus informados pelo
	 * usuário.</h1>
	 *
	 * <p>
	 * Método responsável por informar o número de degraus da escada.
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
	 * <h1>Método reponsável por "salvar" o número de degraus informados pelo
	 * usuário.</h1>
	 *
	 * <p>
	 * Método responsável por "salvar" o número de degraus da escada.
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
	 * <h1>Método reponsável por inserir degraus na escada.</h1>
	 *
	 * <p>
	 * Método responsável por inserir degraus na escada.
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
	 * <h1>Método reponsável por receber a quantidade de degraus da escada.</h1>
	 *
	 * <p>
	 * Método responsável receber a quantidade de degraus da escada.
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
			System.out.println("Digite um valor válido !");
			setNumeroDegraus(0);
		}

	}

}
