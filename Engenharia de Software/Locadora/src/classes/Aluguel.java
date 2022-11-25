package classes;

public class Aluguel {
	
	private Dvd dvd;
	private Cliente cliente;
	
	public Aluguel(Dvd dvd, Cliente cliente) {
		super();
		this.dvd = dvd;
		this.cliente = cliente;
	}

	public Aluguel() {
		super();
	}

	public Dvd getDvd() {
		return dvd;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
