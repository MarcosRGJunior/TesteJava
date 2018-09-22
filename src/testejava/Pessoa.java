package testejava;

public class Pessoa {

	// ela ter� que atributos, contrutor ou contrutores e m�todo de acesso de objeto
	
	
	// atributos, geralmente privado
	private String nome;
	private Integer idade;
	private Endereco endereco;
	
	//construtor
	
	
	public Pessoa( String nome , Integer idade) {
		this.nome= nome;
		this.idade= idade;
	}
	
	//metodo de acesso
	
	public String getNome() {
		return this.nome;
	}
	
	public Integer getIdade() {
		return this.idade;
	}
	
	public void aniversario() {
		this.idade= idade+1;
	}
	 public Endereco getEndereco() {// getter
		 return this.endereco; 
		 
	 }
	 
	 public void setEndereco(Endereco endereco) { //seter
		 this.endereco= endereco;
	 }

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
	}


	
}
