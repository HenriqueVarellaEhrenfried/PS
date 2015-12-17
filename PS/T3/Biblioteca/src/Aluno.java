
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

	public List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	public void atualizaEmprestimo(int tipoObra, int obraID, int tipoUsuario, int usuarioID) {
		Emprestimo emprestimoCriado = new Emprestimo(tipoObra, obraID, tipoUsuario, usuarioID);
		this.emprestimos.add(emprestimoCriado);
	}
	
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