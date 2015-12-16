
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
	private int NumObrasEmprestadas;
	private String tipoConta;



	/**
	 * @return
	 */
	public Usuario getUser() {
		// TODO implement here
		return null;
	}

	/**
	 * 
	 */
	public void atualizaEmprestimo() {
		// TODO implement here
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
		// TODO implement here
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}