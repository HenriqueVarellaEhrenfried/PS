
import java.util.*;

/**
 * 
 */
public class Periodico extends Obra {

	/**
	 * Default constructor
	 */
	public Periodico(String titulo, int volume, int mesPub, int anoPub) {
		setTitulo(titulo);
		setVolume(volume);
		setMesPub(mesPub);
		setAnoPub(anoPub);
	}
	
	
	public void setTitulo(String titulo2){
		this.titulo = titulo2;		
	}
	
	public void setAnoPub(int anoPub2) {
		this.ano = anoPub2;		
	}
	
	public void setMesPub(int mesPub2) {
		this.mes = mes;		
	}

	public void setVolume(int volume2) {
		this.volume = volume2;		
	}

	private String titulo;
	private int volume;
	private int mes;
	private int ano;

	/**
	 * @param info 
	 * @return
	 */
	public String getDados() {
		// TODO implement here
		return "";
	}

}