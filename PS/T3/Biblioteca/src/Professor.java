
import java.util.*;

/**
 * 
 */
public class Professor extends Usuario {
	

	/**
	 * Default constructor
	 */
	public Professor(String nome, String nomeDeUsuario, String senha) {
		setNome(nome);
		setNomeDeUsuario(nomeDeUsuario);
		setSenha(senha);
	}

	private Integer TEMPODEV = 30;
	private Integer MAXOBRAS = 3;

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