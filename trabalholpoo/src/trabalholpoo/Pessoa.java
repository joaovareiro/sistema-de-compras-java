package trabalholpoo;

public abstract class Pessoa implements Verificavel{

	private String nome;
	private String cpf;
	private Endereco endereco;
	private String celular;
	
	public Pessoa(String nome, String cpf, Endereco endereco, String celular) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.celular = celular;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	

}
