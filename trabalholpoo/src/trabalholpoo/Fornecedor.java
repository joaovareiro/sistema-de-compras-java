package trabalholpoo;

public class Fornecedor implements Verificavel{
	
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private Endereco endereco;
	private String celular;
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
	
	public Fornecedor(String razaoSocial, String nomeFantasia, String cnpj, Endereco endereco, String celular) {
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.celular = celular;
	}
	
	@Override
	public boolean validar(String codigo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void solicitarNovo() {
		// TODO Auto-generated method stub
		
	}
	
}
