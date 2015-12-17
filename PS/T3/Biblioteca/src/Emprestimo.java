
import java.util.*;
import java.util.Calendar;

/**
 * 
 */
public class Emprestimo {

	/**
	 * Default constructor
	 */
	public Emprestimo(int tipoObra, int obraID, int tipoUsuario, int usuarioID) {
		Calendar calendar = Calendar.getInstance();
		this.dataEmprest = calendar.get(Calendar.DAY_OF_YEAR);
		
		if (tipoUsuario == 1){
			this.dataEsperadaDevolucao = (this.dataEmprest+30) % 365;			
		}
		if (tipoUsuario == 2){
			this.dataEsperadaDevolucao = (this.dataEmprest+15) % 365;			
		}
		if (tipoUsuario == 3){
			this.dataEsperadaDevolucao = (this.dataEmprest+7) % 365;			
		}
		
		this.obraID = obraID;
		this.tipoObra = tipoObra;
		this.tipoUsuario = tipoUsuario;
		this.usuarioID = usuarioID;
	}

	private int dataEmprest;
	private int dataDevolucao;
	private int dataEsperadaDevolucao;
	private int usuarioID;
	private int tipoUsuario;
	private int obraID;
	private int tipoObra;

	public void devolve(int tipoObra, int obraID, int tipoUsuario, int usuarioID) {
		switch (tipoUsuario){
			case 1:
				//professores.get(usuarioID).emprestimos.get()
				// TODO: Complete this method. Add lists to the param list
		}
	}


	public String confirmacaoPgto(String conf) {
		// TODO implement here
		return "";
	}
	
	public int getUsuarioID(){
		return this.usuarioID;
	}
	
	public int getObraID(){
		return this.obraID;
	}
	
	public int getTipoObra(){
		return this.tipoObra;
	}
	
	public int getDataEsperadaDevolucao(){
		return this.dataEsperadaDevolucao;
	}
	
}