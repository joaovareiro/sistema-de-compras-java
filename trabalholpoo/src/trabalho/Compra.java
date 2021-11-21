package trabalho;

import java.util.Collections;
import java.util.ArrayList;

public class Compra {

	// Atributos

	private Funcionario funcionario;
	private Cliente cliente;
	private ArrayList<Produto> compra = new ArrayList<>();

	public Compra(Funcionario funcionario, Cliente cliente) {

		this.funcionario = funcionario;
		this.cliente = cliente;
	}

	public void adicionaProduto(Produto prod) {
		this.compra.add(prod);
	}

	public void listarCompra() {
		Collections.sort(compra);

		System.out.println("Funcion�rio respons�vel: " + funcionario.getNome());
		System.out.println("Cliente: " + cliente.getNome());

		float totalCompra = 0;

		for (Produto produto : compra) {
			System.out.println(produto);
			totalCompra = totalCompra + produto.getValor();
		}

		System.out.printf("Valor total da compra = R$%.2f\n", totalCompra);
	}
}
