
public class Usuario {
	String nome;
	String profissao;
	String nomeDeUsuario;
	String senha;
	String cpf;
	String rg;
	String telefone;
	String email;
	String idUsuario;
	int NumObrasEmprestadas;
	String tipoConta;
	
	public Usuario getUsuario(Usuario usuario){
		return usuario;
	}
	
	public void atualizaEmprestimo(){
		this.NumObrasEmprestadas += 1;
	}
	
	public boolean validaSenha(String senha){
		if (this.senha == senha)
			return true;
		else
			return false;
	}
	
	public String validaPossibilidadeDeEmprestimo(){
		if (this.NumObrasEmprestadas < 3){
			return "Este usuário consegue emprestar";
		}
		else{
			return "Este usuário não consegue emprestar";
		}
	}
	
	
}
