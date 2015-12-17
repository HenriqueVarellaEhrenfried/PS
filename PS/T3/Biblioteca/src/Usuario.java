
import java.util.*;

/**
 * 
 */
public class Usuario {

	/**
	 * Default constructor
	 */
	public Usuario() {
	}

	private String nome;
	private String profissao;
	private String nomeDeUsuario;
	private String senha;
	private String cpf;
	private String rg;
	private String telefone;
	private String email;
	private String idUsuario;
	private int obrasEmprestadas = 0;
	private String tipoConta;
	private int MAXOBRAS;
	private int TEMPODEV;

	private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();


	/**
	 * @return
	 */
	public Usuario getUser() {
		return null;
	}

	/**
	 * 
	 */
	public void atualizaEmprestimo(int tipoObra, int obraID, int tipoUsuario, int usuarioID) {
		Emprestimo emprestimoCriado = new Emprestimo(tipoObra, obraID, tipoUsuario, usuarioID);
		this.emprestimos.add(emprestimoCriado);
		this.obrasEmprestadas++;
	}

	/**
	 * @param senha
	 * @return 
	 */
	public boolean validaSenha(String senha) {
		// TODO implement here
		return true;
	}

	/**
	 * @return
	 */
	public boolean validaPossibilidadeDeEmprestimo() {
		if (this.obrasEmprestadas < this.MAXOBRAS)
			return true;
		else
			return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}

	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}

}