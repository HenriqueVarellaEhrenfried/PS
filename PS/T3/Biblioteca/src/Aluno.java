
import java.util.*;

/**
 * 
 */
public class Aluno extends Usuario {

	/**
	 * Default constructor
	 */
	public Aluno(String nome, String nomeDeUsuario, String senha) {
		setNome(nome);
		setNomeDeUsuario(nomeDeUsuario);
		setSenha(senha);
	}

	private int TEMPODEV = 15;
	private int MAXOBRAS = 2;

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