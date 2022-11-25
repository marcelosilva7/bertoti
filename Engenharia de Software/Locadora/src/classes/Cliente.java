package classes;

public class Cliente {
	
	private String nome;
	private Long cpf;
	private String nascimento;
	private String email;
	
	
	public Cliente(String nome, Long cpf, String nascimento, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.email = email;
	}
	
	public Cliente() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean compararCliente(Cliente cliente){
        if (this.nome.equals(cliente.nome)&& this.cpf.equals(cliente.cpf) &&
                this.nascimento.equals(cliente.nascimento) 
                && this.email.equals(cliente.email)){
                    return true;
        }else{
            return false;
        }
    }

}
