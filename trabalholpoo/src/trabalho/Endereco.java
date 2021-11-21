package trabalho;

public class Endereco {
	
	private String rua;
	private int numro;
	private String bairro;
	private String cidade;
	private String cep;

	
	public Endereco(String rua, int numro, String bairro, String cidade, String cep) {
		this.rua = rua;
		this.numro = numro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}
	
	public Endereco(String rua, int numro, String bairro, String cidade) {
		super();
		this.rua = rua;
		this.numro = numro;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumro() {
		return numro;
	}

	public void setNumro(int numro) {
		this.numro = numro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
