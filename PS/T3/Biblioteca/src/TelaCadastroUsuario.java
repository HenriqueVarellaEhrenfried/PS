
import java.util.*;

/**
 * 
 */
public class TelaCadastroUsuario extends Tela {

	/**
	 * Default constructor
	 */
	public TelaCadastroUsuario() {
	}

	/**
	 * 
	 */
	private String telaCadastroUsuario;
	
	public void exibirTela(List<Professor> professores, List<Aluno> alunos, List <UsuarioGeral> usuariosGeral){
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Digite 1 para Professor e 2 para Aluno:");
		int profissao = reader.nextInt(); // Scans the next token of the input as an int.
		System.out.println("Digite o nome da pessoa:");
		String nome = reader.next();
		System.out.println("Digite o nome de usuario:");
		String nomeDeUsuario = reader.next();
		System.out.println("Digite a senha:");
		String senha = reader.next();
		
		if (profissao == 1){
			professores.add(new Professor(nome, nomeDeUsuario, senha));
			System.out.println(professores.get(0).getNome());
			/* TODO: Check why its not saving in the array */
		}
		
	}

}