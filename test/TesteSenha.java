import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import questao2.Senha;

/**
 * <h1>Classe reponsável por realizar os testes dos métodos contidos na
 * classe @see Senha</h1>
 *
 * <p>
 * Contém os métodos responsáveis por os testes dos métodos contidos na
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
	 * <h1>Método reponsável por testar se a senha informada possuindo apenas uma
	 * letra é válida.</h1>
	 *
	 * <p>
	 * Método reponsável por testar se a senha informada possuindo apenas uma letra
	 * é válida.
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
	 * <h1>Método reponsável por testar o comportamento do sistema quando não é
	 * informada uma senha.</h1>
	 *
	 * <p>
	 * Método reponsável por testar o comportamento do sistema quando não é
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
	 * <h1>Método reponsável por testar o comportamento do sistema quando a senha é
	 * nula.</h1>
	 *
	 * <p>
	 * Método reponsável por testar o comportamento do sistema quando a senha é
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
	 * <h1>Método reponsável por testar se a senha informada possuindo apenas letras
	 * minúsculas é válida.</h1>
	 *
	 * <p>
	 * Método reponsável por testar se a senha informada possuindo apenas letras
	 * minúsculas é válida.
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
	 * <h1>Método reponsável por testar se a senha informada possuindo apenas letras
	 * maiúsculas é válida.</h1>
	 *
	 * <p>
	 * Método reponsável por testar se a senha informada possuindo apenas letras
	 * maiúsculas é válida.
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
	 * <h1>Método reponsável por testar se a senha informada sem nenhum número é
	 * válida.</h1>
	 *
	 * <p>
	 * Método reponsável por testar se a senha informada sem nenhum número é válida.
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
	 * <h1>Método reponsável por testar se a senha informada sem nenhum caractere
	 * especial é válida.</h1>
	 *
	 * <p>
	 * Método reponsável por testar se a senha informada sem nenhum caractere
	 * especial é válida.
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
	 * <h1>Método reponsável por testar se a senha informada com apenas cinco dígitos é válida.</h1>
	 *
	 * <p>
	 * Método reponsável por testar se a senha informada com apenas cinco dígitos é válida.
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
	 * <h1>Método reponsável por testar se uma senha que atenda todos os critérios é válida.</h1>
	 *
	 * <p>
	 *Método reponsável por testar se uma senha que atenda todos os critérios é válida.
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
