
public class PessoaJuridica extends Contato {
	private String cnpj;

	public PessoaJuridica(){
		
	}
	
	public PessoaJuridica(String name, String telefone, String cnpj) {
		super(name, telefone);
		this.cnpj = cnpj;
	}


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
