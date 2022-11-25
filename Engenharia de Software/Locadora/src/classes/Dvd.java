package classes;

public class Dvd {

	 private String titulo;
	 private Especificacao espec;
	 private boolean disponivel;
	
	 public Dvd(String titulo, Especificacao espec) {
		super();
		this.titulo = titulo;
		this.espec = espec;
		this.disponivel = true;
	}

	public Dvd() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Especificacao getEspec() {
		return espec;
	}

	public void setEspec(Especificacao espec) {
		this.espec = espec;
	}

	public boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}	    
	    
	
}
