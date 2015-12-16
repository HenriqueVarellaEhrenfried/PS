
import java.util.*;

/**
 * 
 */
public class TelaEmprestimo extends Tela {

	/**
	 * Default constructor
	 */
	public TelaEmprestimo() {
	}


	private String telaPesquisaEmprestimo;
	
	
	public void exibirTela(List<Professor> professores, List<Aluno> alunos, 
			List <UsuarioGeral> usuariosGeral,List<Livro> livros, 
			List<Periodico> periodicos){
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Digite 1 para livro e 2 para periodico:");
		int tipoObra = reader.nextInt(); // Scans the next token of the input as an int.
		if (tipoObra == 1){
			for (int i = 0; i < livros.size(); i++){
				System.out.print(i+". ");
				System.out.println(livros.get(i).getTitulo());
			}
			System.out.println("Digite o numero do livro para emprestimo:");
			int livroId = reader.nextInt();
			reader.nextLine();
			
			System.out.println("Digite seu nome de usuario:");
			String nomeUsuario = reader.nextLine();
			/* TODO: Finish from here. Add searchUser method in user */
		}
		else{
			if (tipoObra == 2){
			}
		}
	}


}