
import java.util.*;

/**
 * 
 */
public class UsuarioGeral extends Usuario {

	/**
	 * Default constructor
	 */
	public UsuarioGeral(String nome, String nomeDeUsuario, String senha) {
		setNome(nome);
		setNomeDeUsuario(nomeDeUsuario);
		setSenha(senha);
	}

	private Integer TEMPODEV = 7;
	private Integer MAXOBRAS = 1;

	/**
	 * @param senha
	 * @return 
	 */
	public boolean validaSenha(String senha) {
		// TODO implement here
		return true;
	}

	/**
	 * @return
	 */
	public boolean validaNumeroEmprestimo() {
		// TODO implement here
		return true;
	}

}