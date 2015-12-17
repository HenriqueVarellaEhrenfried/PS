
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
			
		System.out.println("Professor criado. Nome: "+nome+" | login: "+nomeDeUsuario+" | senha :"+senha);
		
	}

	private Integer TEMPODEV = 30;
	private Integer MAXOBRAS = 3;
	
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