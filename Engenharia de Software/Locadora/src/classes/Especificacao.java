package classes;

public class Especificacao {

	private String genero;
    private int ano;
    private String diretor;
    private String idioma;
	
    
    public Especificacao(String genero, int ano, String diretor, String idioma) {
		super();
		this.genero = genero;
		this.ano = ano;
		this.diretor = diretor;
		this.idioma = idioma;
	}
    
    
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
    
	public boolean comparar(Especificacao espec){
        if (this.diretor.equals(espec.diretor)&& this.ano == espec.ano &&
                this.genero.equals(espec.genero) 
                && this.idioma.equals(espec.idioma)){
                    return true;
        }else{
            return false;
        }
    }
	
}
