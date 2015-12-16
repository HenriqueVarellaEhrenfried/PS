
import java.util.*;

/**
 * 
 */
public class TelaCadastroObra extends Tela {

	/**
	 * Default constructor
	 */
	public TelaCadastroObra() {
	}

	/**
	 * 
	 */
	private String telaCadastroObra;
	
	
	public void exibirTela(List<Livro> livros, List<Periodico> periodicos){
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Digite 1 para Livro ou 2 para Periodico:");
		int tipoObra = reader.nextInt(); // Scans the next token of the input as an int.
		reader.nextLine();  // Consume newline left-over
		System.out.println("Digite o titulo:");
		String titulo = reader.nextLine();
		if (tipoObra == 1){
			System.out.println("Digite o nome do autor:");
			String autor = reader.nextLine();
			System.out.println("Digite o ano de publicacao:");
			int anoPub = reader.nextInt();
			
			livros.add(new Livro(titulo, autor, anoPub));
		}
		else{
			if (tipoObra == 2){
				System.out.println("Digite o volume:");
				int volume = reader.nextInt();
				System.out.println("Digite o mes de publicacao:");
				int mesPub = reader.nextInt();
				System.out.println("Digite o ano de publicacao:");
				int anoPub = reader.nextInt();
				
				periodicos.add(new Periodico(titulo, volume, mesPub, anoPub));
			}
			else{
				System.out.println("Entrada invalida");
			}
		}
	}

}