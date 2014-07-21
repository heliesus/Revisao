
public class PessoaFisica extends Contato {
	private String cpf;
	
	public PessoaFisica(){
		
	}

	public PessoaFisica(String name, String telefone, String cpf) {
		super(name, telefone);
		this.cpf = cpf;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
