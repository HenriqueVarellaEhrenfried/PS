
public class Aluno extends Usuario {
	
	int TEMPODEV = 15;
	int MAXOBRAS = 2;

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
