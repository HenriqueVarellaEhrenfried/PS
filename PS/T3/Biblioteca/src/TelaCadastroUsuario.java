
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
		System.out.println("Digite 1 para Professor, 2 para Aluno ou 3 para Usuario em Geral:");
		int profissao = reader.nextInt(); // Scans the next token of the input as an int.
		System.out.println("Digite o nome da pessoa:");
		String nome = reader.next();
		System.out.println("Digite o nome de usuario:");
		String nomeDeUsuario = reader.next();
		System.out.println("Digite a senha:");
		String senha = reader.next();
		
		switch (profissao){
			case 1:
				professores.add(new Professor(nome, nomeDeUsuario, senha));
				break;
			case 2:
				alunos.add(new Aluno(nome, nomeDeUsuario, senha));
				System.out.println(alunos.get(0).getNome());
				break;
			case 3:
				usuariosGeral.add(new UsuarioGeral(nome, nomeDeUsuario, senha));
				System.out.println(usuariosGeral.get(0).getNome());
				break;
			default:
				System.out.println("Entrada invalida");
				break;					
		}		
	}

}