package trabalho;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float valorProduto = 0.0f, salarioFuncionario = 0.0f;

		Endereco endereco1 = new Endereco("rua1", 1, "bairro1", "cidade1");
		Endereco endereco2 = new Endereco("rua2", 2, "bairro2", "cidade2");
		Endereco endereco3 = new Endereco("rua3", 3, "bairro3", "cidade3");
		Endereco endereco4 = new Endereco("rua4", 4, "bairro4", "cidade4");
		Endereco endereco5 = new Endereco("rua5", 5, "bairro5", "cidade5");
		Endereco endereco6 = new Endereco("rua6", 6, "bairro6", "cidade6");

		Funcionario funcionario1 = new Funcionario("Funcionario1", "56369445789", endereco1, "0001-9876", 1200.00f,
				"Medico");
		Funcionario funcionario2 = new Funcionario("Funcionario2", "47980485181", endereco2, "0002-9876", 2000.50f,
				"Barista");

		Cliente cliente1 = new Cliente("Cliente1", "99984743454", endereco3, "1000-9876");
		Cliente cliente2 = new Cliente("Cliente2", "27373296807", endereco4, "2000-9876");

		Fornecedor fornecedor1 = new Fornecedor("Escritorio Contabil", "Super-Contas", "58124531000176", endereco5,
				"9876-1000");
		Fornecedor fornecedor2 = new Fornecedor("Coca Cola Industrias Ltda", "Coca-Cola", "25442736000140", endereco6,
				"9876-2000");

		// CONFERIR
		
		Produto produto1 = new Produto("produto1", 10f, fornecedor1);
		Produto produto2 = new Produto("produto2", 20.50f, fornecedor1);
		Produto produto3 = new Produto("produto3", 30f, fornecedor1);
		Produto produto4 = new Produto("produto4", 40.50f, fornecedor1);
		Produto produto5 = new Produto("produto5", 50f, fornecedor1);
		Produto produto6 = new Produto("produto6", 60.50f, fornecedor2);
		Produto produto7 = new Produto("produto7", 70f, fornecedor2);
		Produto produto8 = new Produto("produto8", 80.50f, fornecedor2);
		Produto produto9 = new Produto("produto9", 90f, fornecedor2);
		Produto produto10 = new Produto("produto10", 100.50f, fornecedor2);
		
		Compra compra1 = new Compra(funcionario1, cliente1);
		Compra compra2 = new Compra(funcionario2, cliente2);

		compra1.adicionaProduto(produto1);
		compra1.adicionaProduto(produto2);
		compra1.adicionaProduto(produto3);
		compra1.adicionaProduto(produto4);
		compra1.adicionaProduto(produto5);
		compra2.adicionaProduto(produto6);
		compra2.adicionaProduto(produto7);
		compra2.adicionaProduto(produto8);
		compra2.adicionaProduto(produto9);
		compra2.adicionaProduto(produto10);
		
		// Listar os Cliente, os Fornecedore e as Compras conforme citado acima.
		System.out.println("Cliente 1 \n" + cliente1.toString());
		System.out.println("\nCliente 2 \n" + cliente2.toString());
		
		System.out.print("\nFornecedor 1: " + fornecedor1.getNomeFantasia());
		System.out.print("\nFornecedor 2: " + fornecedor2.getNomeFantasia());
		
		System.out.println("\n\nPrimeira compra:");
		compra1.listarCompra();
		
		System.out.println("\nSegunda compra:");
		compra2.listarCompra();
		
	}
}
