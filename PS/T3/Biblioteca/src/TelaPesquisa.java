
import java.util.*;

/**
 * 
 */
public class TelaPesquisa extends Tela {

	/**
	 * Default constructor
	 */
	public TelaPesquisa() {
	}
	
	public void exibirTela(List <Livro> livros, List <Periodico> periodicos)
	{
		System.out.println("Pesquisa de exemplares.");
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
			System.out.println("Digite o numero do livro para obter informações:");
			int livroId = reader.nextInt();
			reader.nextLine();
			
			System.out.println(livros.get(livroId).getDados());
		}
		else if (tipoObra == 2)	
		{
			for (int i = 0; i < periodicos.size(); i++)
			{
				System.out.print(i+". ");
				System.out.println(periodicos.get(i).getTitulo());
			}
			System.out.println("Digite o numero do periódico para obter informações:");
			int periodicoId = reader.nextInt();
			reader.nextLine();
			
			System.out.println(periodicos.get(periodicoId).getDados());		
		}
		else System.out.println("Entrada inválida.");	
		
		System.out.println("\nPressione enter para continuar...");
		reader.nextLine();
		reader.nextLine();
	}

	/**
	 * 
	 */
	private String telaPesquisa;

}