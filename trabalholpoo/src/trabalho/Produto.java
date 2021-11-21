package trabalho;

import java.util.InputMismatchException;

public class Produto implements Comparable<Produto> {

	private String nomeProduto;
	private float valor;
	private Fornecedor empresa;

	public Produto(String nomeProduto, float valor, Fornecedor empresa) {
		this.nomeProduto = nomeProduto;
		this.empresa = empresa;
		try {
			this.valor = valor;
		} catch (InputMismatchException e) {
			System.out.println("Valor informado errado.");
		}
	}

	@Override
	public int compareTo(Produto prod) {
		return (int) (this.getValor() - prod.getValor());
	}

	@Override
	public String toString() {
		return nomeProduto + " R$: " + valor;
	}

	// Métodos get e set da classe Produto

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return empresa;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.empresa = fornecedor;
	}

}
