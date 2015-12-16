
import java.util.*;

/**
 * 
 */
public class Biblioteca {

	/**
	 * Default constructor
	 */
	public Biblioteca() {
	}

	/**
	 * 
	 */
	private Set<Obra> obras;

	/**
	 * 
	 */
	private Set<Usuario> Usuario;




	/**
	 * @param telaID
	 */
	public void selecionaTela(Integer telaID) {
		// TODO implement here
	}

	/**
	 * @param dados
	 */
	public void informaObra(){
		// TODO implement here
	}

	/**
	 * @param dados
	 */
	public void informaDados() {
		// TODO implement here
	}

	/**
	 * @param senha
	 */
	public void digitaSenha(String senha) {
		// TODO implement here
	}

	/**
	 * @param dados
	 */
	public void informaDadosEmprestimo() {
		// TODO implement here
	}

	/**
	 * @param info
	 */
	public void enviaInformacaoLivro() {
		// TODO implement here
	}

	/**
	 * @param info
	 */
	public void enviaInformacaoPeriodico() {
		// TODO implement here
	}

	/**
	 * @param conf
	 */
	public void confirmaPagamentoMulta(String conf) {
		// TODO implement here
	}

	/**
	 * @param confirmacao
	 */
	public void confirmaDados(String confirmacao) {
		// TODO implement here
	}
	
	
	
	/*
	 * 
	 *  MAIN PROGRAM
	 * 
	 */
	
	
	public static void main(String args[]){
		
		Biblioteca biblioteca = new Biblioteca();
		
		List<Professor> professores = new ArrayList<Professor>();
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<UsuarioGeral> usuariosGeral = new ArrayList<UsuarioGeral>();
		List<Livro> livros = new ArrayList<Livro>();
		List<Periodico> periodicos = new ArrayList<Periodico>();

		Tela tela = new Tela();
		tela.exibirTela(professores, alunos, usuariosGeral);
		
	}

}