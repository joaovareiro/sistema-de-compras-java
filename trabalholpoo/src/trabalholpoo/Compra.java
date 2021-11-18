package trabalholpoo;

import java.util.Collections;
import java.util.ArrayList;

public class Compra {

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
		
		float totalCompra=0;
		
		for(Produto produto:compra) {
			System.out.println(produto);
			totalCompra = totalCompra + produto.getValor();
		}
		System.out.printf("Valor total da compra = %.2f\n", totalCompra);
		System.out.println("Funcionário responsável: "+ funcionario.getNome());
		System.out.println("Cliente: "+ cliente.getNome());
	}
}
