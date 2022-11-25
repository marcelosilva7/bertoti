package classes;

import java.util.LinkedList;
import java.util.List;

public class Locadora {
	
	 private List<Dvd> dvds = new LinkedList<Dvd>();
	 
	 private List<Cliente> clientes = new LinkedList<Cliente>();
	 
	 private List<Aluguel> alugar = new LinkedList<Aluguel>();
	 
	 private List<Aluguel> devolver = new LinkedList<Aluguel>();
	 
	    
	   	public void cadastrarDvd(Dvd dvd){
	        dvds.add(dvd);
	    }
	   	
	   	public void cadastrarCliente(Cliente cliente){
	        clientes.add(cliente);
	    }
	    
	    public List<Dvd> buscarDvdPorEspecificacao(Especificacao espec){
	        List<Dvd> dvdsencontrados = new LinkedList<Dvd>();
	        for(Dvd dvd:dvds){
	            if(dvd.getEspec().comparar(espec)){
	                dvdsencontrados.add(dvd);}
	            
	            } return dvdsencontrados;
	        }
	        
	    public Dvd buscarPorTitulo(String titulo){
	        for (Dvd dvd:dvds){
	            if(dvd.getTitulo().equals(titulo)){
	                return dvd;
	            }
	        }
	        return null;
	    }
	    
	    public Cliente buscarCpf(Long cpf){
	        for (Cliente c:clientes){
	            if(c.getCpf().equals(cpf)){
	                return c;
	            }
	        }
	        return null;
	    }
	    
	    public List<Cliente> buscarCliente(Cliente cliente){
	        List<Cliente> clientesencontrados = new LinkedList<Cliente>();
	        for(Cliente c:clientes){
	            if(c.compararCliente(cliente)){
	                clientesencontrados.add(c);}
	            
	            } return clientesencontrados;
	        }

	    public void alugar(Dvd dvd, Cliente cliente) {
	    	Aluguel alu = new Aluguel();
	    	alu.setCliente(cliente);
	    	dvd.setDisponivel(false);
	    	alu.setDvd(dvd);
	    	alugar.add(alu);
	    	
	    }
	    
	    public void devolver(Dvd dvd, Cliente cliente) {
	    	Aluguel alu = new Aluguel();
	    	alu.setCliente(cliente);
	    	dvd.setDisponivel(true);
	    	alu.setDvd(dvd);
	    	devolver.add(alu);
	    	
	    }

		public List<Dvd> getDvds() {
			return dvds;
		}

		public void setDvds(List<Dvd> dvds) {
			this.dvds = dvds;
		}

		public List<Cliente> getClientes() {
			return clientes;
		}

		public void setClientes(List<Cliente> clientes) {
			this.clientes = clientes;
		}

		public List<Aluguel> getAlugar() {
			return alugar;
		}

		public void setAlugar(List<Aluguel> alugar) {
			this.alugar = alugar;
		}

		public List<Aluguel> getDevolver() {
			return devolver;
		}

		public void setDevolver(List<Aluguel> devolver) {
			this.devolver = devolver;
		}
	    
	    
	    
	    
}
