package trabalho;

import java.util.InputMismatchException;

public class Funcionario extends Pessoa {

	private double salario;
	private String funcao;

	public Funcionario(String nome, String cpf, Endereco endereco, String celular, double salario, String funcao) {
		super(nome, cpf, endereco, celular);
		try {
			this.salario = salario;
		} catch (InputMismatchException e) {
			System.out.println("Entrada errada para sal�rio de funcion�rio.");
		}
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Nome do funcion�rio: " + getNome() + "\nCPF do funcion�rio: " + getCpf() + "\nCelular do funcion�rio: "
				+ getCelular() + "\nFun��o do funcion�rio: " + this.funcao + "\nSal�rio do funcion�rio: "
				+ this.salario;
	}

}