package questao2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <h1>Classe respons�vel por realizar a valida��o da senha informada pelo
 * usu�rio. "</h1>
 *
 * <p>
 * Classe respons�vel por realizar a valida��o da senha informada pelo usu�rio.
 * </p>
 *
 * @author HenriqueSales
 *
 * @see Senha
 */
public class Senha {

	/**
	 * <h1>M�todo repons�vel por validar a senha informada pelo usu�rio.</h1>
	 *
	 * <p>
	 * M�todo repons�vel por validar a senha informada pelo usu�rio.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see validarSenha
	 */

	public boolean validarSenha(String senha) {

		//Defini��o da express�o regular
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[!@#$%^&*()-+])" + "(?=\\S+$).{6,20}$";

		// Compila��o da express�o regular
		Pattern p = Pattern.compile(regex);

		if (senha == null || senha.isEmpty()) {
			return false;
		}

		//Procura o padr�o (Pattern) dentro do texto
		Matcher m = p.matcher(senha);

		//Retorna se a senha informada � v�lida (Ou seja, se segue o padr�o definido na express�o regular).
		return m.matches();
	}

	/**
	 * <h1>M�todo repons�vel por realizar solicitar a senha do usu�rio.</h1>
	 *
	 * <p>
	 * M�todo repons�vel por realizar solicitar a senha do usu�rio.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see SolicitarSenha
	 */
	public void SolicitarSenha() {

		int digitosFaltantes;

		Scanner scanner = new Scanner(System.in);

		String senha = "";

		// La�o de repeti��o codificado para que ser executado enquanto a senha
		// informada pelo usu�rio
		// n�o for v�lida

		while (validarSenha(senha) == false) {
			System.out.println("Digite a senha");
			senha = scanner.next();

			// La�o de repeti��o codificado para que ser executado enquanto a senha
			// informada pelo usu�rio tiver menos de 6 d�gitos

			while (senha.length() < 6) {
				System.out.println(
						"Para a senha ser v�lida, � necess�rio informar mais " + (6 - senha.length()) + " d�gitos");
				senha = scanner.next();
			}

			// Fim do la�o de repeti��o codificado para que ser executado enquanto a senha
			// informada pelo usu�rio tiver menos de 6 d�gitos

			// Condi��o para verificar se a senha do usu�rio � v�lida e obedece �s regras de
			// senha forte
			if (validarSenha(senha) == false) {

				System.out.print("A senha informada � inv�lida. \n" + "------------------------------------------ \n"
						+ "A senha deve seguir os seguintes requisitos para ser v�lida: \n"
						+ "* Possuir no m�nimo 6 caracteres. \n" + "* Conter no m�nimo 1 n�mero. \n"
						+ "* Conter no m�nimo 1 letra em min�sculo. \n" + "* Conter no m�nimo 1 letra em mai�sculo.\n"
						+ "* Conter no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+ \n"
						+ "------------------------------------------ \n");
			} else {
				System.out.print("A senha inserida � v�lida");
			}

		}

		// Fim do la�o de repeti��o codificado para que ser executado enquanto a senha
		// informada pelo usu�rio
		// n�o for v�lida

	}

}
