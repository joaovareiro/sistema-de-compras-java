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
			System.out.println("Entrada errada para salário de funcionário.");
		}
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Nome do funcionário: " + getNome() + "\nCPF do funcionário: " + getCpf() + "\nCelular do funcionário: "
				+ getCelular() + "\nFunção do funcionário: " + this.funcao + "\nSalário do funcionário: "
				+ this.salario;
	}

}