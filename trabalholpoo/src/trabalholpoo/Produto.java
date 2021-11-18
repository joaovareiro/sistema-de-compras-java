package trabalholpoo;

public class Produto implements Comparable<Produto>{

	private String nomeProduto;
	private Float valor;
	private Fornecedor fornecedor;
	
	public Produto(String nomeProduto, Float valor, Fornecedor fornecedor) {
		super();
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	@Override
    public int compareTo(Produto prod) {
        return (int) (this.getValor() - prod.getValor());
    }

	@Override
	public String toString() {
		return nomeProduto + "R$: " + valor;
	}
	
	
	
}
