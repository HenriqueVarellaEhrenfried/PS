
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



	private static void inicializaSistema(List <Professor> professores, List <Aluno> alunos, List <UsuarioGeral> usuariosGeral, List <Livro> livros, List <Periodico> periodicos)
	{
		for (int i=0;i<10;++i)
		{
			livros.add(new Livro("livro"+String.valueOf(i), "William Shakespeare "+String.valueOf(i), 1900+10*i));
			periodicos.add(new Periodico("Pesquisa "+String.valueOf(i), i, i+1, 1900+10*i));
			professores.add(new Professor("Andrey "+String.valueOf(i), "andrey"+String.valueOf(i), "andrey"+String.valueOf(i)+"senha"));
			alunos.add(new Aluno("Joao "+String.valueOf(i), "joao"+String.valueOf(i), "joao"+String.valueOf(i)+"senha"));
			usuariosGeral.add(new UsuarioGeral("Bob "+String.valueOf(i), "bob"+String.valueOf(i), "bob"+String.valueOf(i)+"senha"));
		}	
	}
	

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
		
		inicializaSistema(professores,alunos,usuariosGeral,livros,periodicos);

		Tela tela = new Tela();
		tela.exibirTela(professores, alunos, usuariosGeral, livros, periodicos);
	}

}