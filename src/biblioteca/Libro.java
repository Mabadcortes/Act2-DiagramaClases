package biblioteca;

public class Libro {

	private String isbn = "";
	private String titulo = "";
	private int numPaginas;
	private String tematica = "";

	public Libro(String isbn, String titulo, int numPaginas, String tematica) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		this.tematica = tematica;
	}

}
