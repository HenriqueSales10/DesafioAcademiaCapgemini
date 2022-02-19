package questao2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <h1>Classe responsável por realizar a validação da senha informada pelo
 * usuário. "</h1>
 *
 * <p>
 * Classe responsável por realizar a validação da senha informada pelo usuário.
 * </p>
 *
 * @author HenriqueSales
 *
 * @see Senha
 */
public class Senha {

	/**
	 * <h1>Método reponsável por validar a senha informada pelo usuário.</h1>
	 *
	 * <p>
	 * Método reponsável por validar a senha informada pelo usuário.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see validarSenha
	 */

	public boolean validarSenha(String senha) {

		//Definição da expressão regular
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[!@#$%^&*()-+])" + "(?=\\S+$).{6,20}$";

		// Compilação da expressão regular
		Pattern p = Pattern.compile(regex);

		if (senha == null || senha.isEmpty()) {
			return false;
		}

		//Procura o padrão (Pattern) dentro do texto
		Matcher m = p.matcher(senha);

		//Retorna se a senha informada é válida (Ou seja, se segue o padrão definido na expressão regular).
		return m.matches();
	}

	/**
	 * <h1>Método reponsável por realizar solicitar a senha do usuário.</h1>
	 *
	 * <p>
	 * Método reponsável por realizar solicitar a senha do usuário.
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

		// Laço de repetição codificado para que ser executado enquanto a senha
		// informada pelo usuário
		// não for válida

		while (validarSenha(senha) == false) {
			System.out.println("Digite a senha");
			senha = scanner.next();

			// Laço de repetição codificado para que ser executado enquanto a senha
			// informada pelo usuário tiver menos de 6 dígitos

			while (senha.length() < 6) {
				System.out.println(
						"Para a senha ser válida, é necessário informar mais " + (6 - senha.length()) + " dígitos");
				senha = scanner.next();
			}

			// Fim do laço de repetição codificado para que ser executado enquanto a senha
			// informada pelo usuário tiver menos de 6 dígitos

			// Condição para verificar se a senha do usuário é válida e obedece às regras de
			// senha forte
			if (validarSenha(senha) == false) {

				System.out.print("A senha informada é inválida. \n" + "------------------------------------------ \n"
						+ "A senha deve seguir os seguintes requisitos para ser válida: \n"
						+ "* Possuir no mínimo 6 caracteres. \n" + "* Conter no mínimo 1 número. \n"
						+ "* Conter no mínimo 1 letra em minúsculo. \n" + "* Conter no mínimo 1 letra em maiúsculo.\n"
						+ "* Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+ \n"
						+ "------------------------------------------ \n");
			} else {
				System.out.print("A senha inserida é válida");
			}

		}

		// Fim do laço de repetição codificado para que ser executado enquanto a senha
		// informada pelo usuário
		// não for válida

	}

}
