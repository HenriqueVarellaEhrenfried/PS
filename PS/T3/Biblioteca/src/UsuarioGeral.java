
public class UsuarioGeral extends Usuario {
	
	int TEMPODEV = 7;
	int MAXOBRAS = 1;

	public boolean validaSenha(String senha){
		if (this.senha == senha)
			return true;
		else
			return false;
	}
	
	
	public boolean validaNumeroEmprestimo(){
		if (this.NumObrasEmprestadas < this.MAXOBRAS)
			return true;
		else
			return false;
	}
	
	
}
