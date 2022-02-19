import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import questao2.Senha;

/**
 * <h1>Classe repons�vel por realizar os testes dos m�todos contidos na
 * classe @see Senha</h1>
 *
 * <p>
 * Cont�m os m�todos respons�veis por os testes dos m�todos contidos na
 * classe @see Senha .
 * </p>
 *
 * @author HenriqueSales
 *
 * @see TesteSenha
 */
class TesteSenha {

	Senha pass = new Senha();

	/**
	 * <h1>M�todo repons�vel por testar se a senha informada possuindo apenas uma
	 * letra � v�lida.</h1>
	 *
	 * <p>
	 * M�todo repons�vel por testar se a senha informada possuindo apenas uma letra
	 * � v�lida.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see apenasUmaLetra
	 */
	@Test
	void apenasUmaLetra() {
		assertFalse(pass.validarSenha("A"));
	}

	/**
	 * <h1>M�todo repons�vel por testar o comportamento do sistema quando n�o �
	 * informada uma senha.</h1>
	 *
	 * <p>
	 * M�todo repons�vel por testar o comportamento do sistema quando n�o �
	 * informada uma senha.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see senhaNaoInformada
	 */
	@Test
	void senhaNaoInformada() {
		assertFalse(pass.validarSenha(""));
	}

	/**
	 * <h1>M�todo repons�vel por testar o comportamento do sistema quando a senha �
	 * nula.</h1>
	 *
	 * <p>
	 * M�todo repons�vel por testar o comportamento do sistema quando a senha �
	 * nula.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see senhaNula
	 */
	@Test
	void senhaNula() {
		assertFalse(pass.validarSenha(null));
	}

	/**
	 * <h1>M�todo repons�vel por testar se a senha informada possuindo apenas letras
	 * min�sculas � v�lida.</h1>
	 *
	 * <p>
	 * M�todo repons�vel por testar se a senha informada possuindo apenas letras
	 * min�sculas � v�lida.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see somenteLetrasMinusculas
	 */
	@Test
	void somenteLetrasMinusculas() {
		assertFalse(pass.validarSenha("aaa@123"));
	}

	/**
	 * <h1>M�todo repons�vel por testar se a senha informada possuindo apenas letras
	 * mai�sculas � v�lida.</h1>
	 *
	 * <p>
	 * M�todo repons�vel por testar se a senha informada possuindo apenas letras
	 * mai�sculas � v�lida.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see somenteLetrasMaiusculas
	 */
	@Test
	void somenteLetrasMaiusculas() {
		assertFalse(pass.validarSenha("AA@123"));
	}

	/**
	 * <h1>M�todo repons�vel por testar se a senha informada sem nenhum n�mero �
	 * v�lida.</h1>
	 *
	 * <p>
	 * M�todo repons�vel por testar se a senha informada sem nenhum n�mero � v�lida.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see semNumero
	 */
	@Test
	void semNumero() {
		assertFalse(pass.validarSenha("Aaa@aaa"));
	}

	/**
	 * <h1>M�todo repons�vel por testar se a senha informada sem nenhum caractere
	 * especial � v�lida.</h1>
	 *
	 * <p>
	 * M�todo repons�vel por testar se a senha informada sem nenhum caractere
	 * especial � v�lida.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see semCaractereEspecial
	 */
	@Test
	void semCaractereEspecial() {
		assertFalse(pass.validarSenha("Aaa1234"));
	}
	
	/**
	 * <h1>M�todo repons�vel por testar se a senha informada com apenas cinco d�gitos � v�lida.</h1>
	 *
	 * <p>
	 * M�todo repons�vel por testar se a senha informada com apenas cinco d�gitos � v�lida.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see apenas5Digitos
	 */
	@Test
	void apenas5Digitos() {
		assertFalse(pass.validarSenha("A@a1@"));
	}
	
	/**
	 * <h1>M�todo repons�vel por testar se uma senha que atenda todos os crit�rios � v�lida.</h1>
	 *
	 * <p>
	 *M�todo repons�vel por testar se uma senha que atenda todos os crit�rios � v�lida.
	 * </p>
	 *
	 * @author HenriqueSales
	 *
	 * @see senhaValida
	 */
	@Test
	void senhaValida() {
		assertTrue(pass.validarSenha("Mudar@12345"));
	}
}
