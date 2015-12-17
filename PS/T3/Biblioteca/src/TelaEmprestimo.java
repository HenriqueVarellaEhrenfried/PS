
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

	private void usuarioEmprestimo(List<Professor> professores, List<Aluno> alunos, List <UsuarioGeral> usuariosGeral, int tipoObra, int id)
	{
		Scanner reader = new Scanner(System.in); 
		System.out.println("Digite 1 para professor, 2 para aluno e 3 para usuário em geral:");
		int tipoUsuario = reader.nextInt();
		reader.nextLine();
		
		System.out.println("Digite seu nome de usuario:");
		String nomeUsuario = reader.nextLine();
		
		switch(tipoUsuario)
		{
			case 1:
				for ( int i=0;i<professores.size();++i )
				{
					if ( professores.get(i).getNome()==nomeUsuario )
					{
						if ( professores.get(i).validaPossibilidadeDeEmprestimo() )
						{
							professores.get(i).atualizaEmprestimo(tipoObra, id, tipoUsuario, i);
						}
						else System.out.println("Este usuário não pode emprestar mais exemplares.");
					}
				}
				break;
				
			case 2:
				for ( int i=0;i<alunos.size();++i )
				{
					if ( alunos.get(i).getNome()==nomeUsuario )
					{
						if ( alunos.get(i).validaPossibilidadeDeEmprestimo() )
						{
							alunos.get(i).atualizaEmprestimo(tipoObra, id, tipoUsuario, i);
						}
						else System.out.println("Este usuário não pode emprestar mais exemplares.");
					}
				}					
				break;
				
			case 3:
				for ( int i=0;i<usuariosGeral.size();++i )
				{
					if ( usuariosGeral.get(i).getNome()==nomeUsuario )
					{
						if ( usuariosGeral.get(i).validaPossibilidadeDeEmprestimo() )
						{
							usuariosGeral.get(i).atualizaEmprestimo(tipoObra, tipoUsuario, id);
						}
						else System.out.println("Este usuário não pode emprestar mais exemplares.");
					}
				}					
				break;
				
			default: 
				System.out.println("Opção inválida.");	
				break;
		}//end switch
	}

	private String telaPesquisaEmprestimo;
	
	
	public void exibirTela(List<Professor> professores, List<Aluno> alunos, 
			List <UsuarioGeral> usuariosGeral,List<Livro> livros, 
			List<Periodico> periodicos){
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Digite 1 para livro e 2 para periodico:");
		int tipoObra = reader.nextInt(); // Scans the next token of the input as an int.
		
		if (tipoObra == 1)
		{
			for (int i = 0; i < livros.size(); i++)
			{
				System.out.print(i+". ");
				System.out.println(livros.get(i).getTitulo());
			}
			System.out.println("Digite o numero do livro para emprestimo:");
			int livroId = reader.nextInt();
			reader.nextLine();
			
			usuarioEmprestimo(professores, alunos, usuariosGeral, 1, livroId);
		}
		else if (tipoObra == 2)	
		{
			for (int i = 0; i < periodicos.size(); i++)
			{
				System.out.print(i+". ");
				System.out.println(periodicos.get(i).getTitulo());
			}
			System.out.println("Digite o numero do periódico para emprestimo:");
			int periodicoId = reader.nextInt();
			reader.nextLine();
			
			usuarioEmprestimo(professores, alunos, usuariosGeral, 2, periodicoId);				
		}
		else System.out.println("Entrada inválida.");
	}


}