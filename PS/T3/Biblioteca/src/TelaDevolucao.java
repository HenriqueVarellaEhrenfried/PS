
import java.util.*;
import java.util.Calendar;

/**
 * 
 */
public class TelaDevolucao extends Tela {

	/**
	 * Default constructor
	 */
	public TelaDevolucao() {
	}
	
	
	public void exibirTela(List<Professor> professores, List<Aluno> alunos, 
			List <UsuarioGeral> usuariosGeral,List<Livro> livros, 
			List<Periodico> periodicos){
		
		Calendar calendar = Calendar.getInstance();
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Digite 1 para Professor, 2 para Aluno e 3 para Usuario em Geral:");
		int tipoUsuario = reader.nextInt(); // Scans the next token of the input as an int.
		System.out.println("Digite nome de usuario:");
		String nomeUsuario = reader.nextLine(); 
		int idUsuario = 0;
		switch (tipoUsuario){
			case 1:
				for ( int i=0;i<professores.size();++i ){
					if ( professores.get(i).getNomeDeUsuario().equals(nomeUsuario) ){
						idUsuario = i;
						if (professores.get(i).emprestimos.size() > 0){
							for (int j=0; j<professores.get(i).emprestimos.size(); j++){
								System.out.print(j+". ");
								if (professores.get(i).emprestimos.get(i).getTipoObra() == 1){
									int livroId = professores.get(i).emprestimos.get(i).getObraID();
									System.out.println(livros.get(livroId).getTitulo());
								}
							}
						}
						else{
							System.out.println("O usuário não possui nenhum empréstimo");
							break;
						}
					}
				}
				System.out.println("Digite o número da obra para devolução: ");
				int numeroLivro = reader.nextInt(); 
				
				int hoje = calendar.get(Calendar.DAY_OF_YEAR);
				int dataEsperadaDevolucao = professores.get(idUsuario).emprestimos.get(numeroLivro).getDataEsperadaDevolucao();
				int atraso = hoje - dataEsperadaDevolucao;
				if( atraso > 0){
					System.out.println("Este usuário deverá pagar R$"+(atraso*5)+",00 de atraso");
					System.out.println("Aperte enter para confirmar o pagamento e a devolução");
					reader.nextLine();
					reader.nextLine();
					// TODO: Finish method for professor
				}
					
				break;
		}
		
	}

	/**
	 * 
	 */
	private String telaDevolucao;

}