
import java.util.*;

/**
 * 
 */
public class Tela {

	/**
	 * Default constructor
	 */
	public Tela() {
	}

	public final static void clearConsole(){
		char c = '\n';
		int length = 25;
		char[] chars = new char[length];
		Arrays.fill(chars, c);
		System.out.print(String.valueOf(chars));
	}

	/**
	 * @param telaID 
	 * @return
	 */
	public void invocaTela(){ 

		
	}

	/**
	 * @param telaID
	 */
	public void exibirTela(List<Professor> professores, List<Aluno> alunos, 
			List<UsuarioGeral> usuariosGeral, List<Livro> livros, List<Periodico> periodicos) {
		
		while(true){
			System.out.println("Bem vindo ao Sistema da Biblioteca");
			System.out.println("");
			System.out.println("1. Cadastro de Usuario");
			System.out.println("2. Cadastro de Obras");
			System.out.println("3. Emprestimo de Obras");
			System.out.println("4. Devolucao de Obras");
			System.out.println("5. Pesquisar Obra");
			System.out.println("0. Sair");
			
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("Digite sua opcao: ");
			int opcao = reader.nextInt(); // Scans the next token of the input as an int.
			clearConsole();
			
			switch (opcao) {
				case 1:
					System.out.println("Tela Cadastro de Usuario (Aluno/Ṕrofessor/UsuarioGeral)");
					TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario();
					telaCadastroUsuario.exibirTela(professores, alunos, usuariosGeral);					
					break;
				case 2:
					System.out.println("Telas Cadastro de Obras (Livro/Periodico)");
					TelaCadastroObra telaCadastroObra = new TelaCadastroObra();	
					telaCadastroObra.exibirTela(livros, periodicos);
					break;
				case 3:
					System.out.println("Tela Emprestimo de Exemplares");
					TelaEmprestimo telaEmprestimo = new TelaEmprestimo();	
					telaEmprestimo.exibirTela(professores, alunos, usuariosGeral, livros, periodicos);
					break;
				case 4:
					System.out.println("Tela Devolucao de Exemplares");
					TelaDevolucao telaDevolucao = new TelaDevolucao();
					break;
				case 5:
					System.out.println("Pesquisar Obra");
					TelaPesquisa telaPesquisa = new TelaPesquisa();
					telaPesquisa.exibirTela(livros, periodicos);
					break;
				case 0:
					System.out.println("Saindo do programa...");
					System.exit(1);
					break;
				default:
					System.out.println("Entrada invalida");
					break;
			}
			System.out.println("\nPressione enter para continuar...");
			reader.nextLine();
			reader.nextLine();
			clearConsole();
		}
	}

	/**
	 * @param exemplar
	 */
	public void exibirDados(String exemplar) {
		// TODO implement here
	}

}