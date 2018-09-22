package testejava;

public class Endereco {

	private String rua;
	private String cep;
	private String bairro; 
	private String complemento;
	
	public Endereco(String rua, String bairro, String cep) {
		this.rua= rua;
		this.cep= cep;
		this.bairro= bairro;
		this.complemento="";
	}


	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getRua() {
		return rua;
	}

	public String getCep() {
		return cep;
	}

	public String getBairro() {
		return bairro;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cep=" + cep + ", bairro=" + bairro + ", complemento=" + complemento + "]";
	}
	
	
	
}
