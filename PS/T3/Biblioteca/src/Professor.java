
public class Professor extends Usuario {
	
	int TEMPODEV = 30;
	int MAXOBRAS = 3;

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
