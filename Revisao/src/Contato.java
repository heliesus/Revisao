
public class Contato {
	private String name;
	private String telefone;
	
	public Contato(String name, String telefone){
		this.name = name;
		this.telefone = telefone;
	}
	public Contato(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString(){
		return name;
		
	}
}
//essa porra desse comentario vai ser o segundo commit