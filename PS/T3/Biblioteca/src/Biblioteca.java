
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
	
	
	
	public final static void clearConsole(){
		char c = '\n';
		int length = 25;
		char[] chars = new char[length];
		Arrays.fill(chars, c);
		System.out.print(String.valueOf(chars));
	}
	
	
	
	/*
	 * 
	 *  MAIN PROGRAM
	 * 
	 */
	
	
	public static void main(String args[]){
		System.out.println("Bem vindo ao Sistema da Biblioteca");
		System.out.println("");
		System.out.println("1. Cadastro de Usuario");
		System.out.println("2. Cadastro de Obras");
		System.out.println("3. Emprestimo de Obras");
		System.out.println("4. Devolucao de Obras");
		System.out.println("5. Pesquisar Obra");
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Digite sua opcao: ");
		int opcao = reader.nextInt(); // Scans the next token of the input as an int.
		
		switch (opcao) {
			case 1:
				clearConsole();
				System.out.println("Ola");
				break;
			case 2:
				System.out.println("Ola");
				break;
			case 3:
				System.out.println("Ola");
				break;
			case 4:
				System.out.println("Ola");
				break;
			case 5:
				System.out.println("Ola");
				break;
			default:
				System.out.println("Ola");
				break;
		}
	}

}