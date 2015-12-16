
import java.util.*;

/**
 * 
 */
public class Livro extends Obra {

	/**
	 * Default constructor
	 */
	public Livro(String titulo, String nomeAutor, int anoPub) {
		setTitulo(titulo);
		setAutor(nomeAutor);
		setAnoPub(anoPub);
	}
	
	
	private void setAnoPub(int anoPub2) {
		this.anoPub = anoPub2;		
	}


	private void setTitulo(String titulo2) {
		this.titulo = titulo2;		
	}


	private void setAutor(String autor) {
		this.autor = autor;		
	}


	private String titulo;
	private String autor;
	private Integer anoPub;
	private String editora;

	/**
	 * @param info 
	 * @return
	 */
	public String getDados() {
		// TODO implement here
		return "";
	}


	public String getTitulo() {
		return titulo;
	}

}