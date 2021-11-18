package trabalholpoo;

public class Funcionario extends Pessoa{
	
	private float salario;
	private String funcao;
	
	public Funcionario(String nome, String cpf, Endereco endereco, String celular, float salario, String funcao) {
		super(nome, cpf, endereco, celular);
		this.salario = salario;
		this.funcao = funcao;
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

	@Override
	public String toString() {
		return "Nome do funcionário: " + getNome()+
				"\nCPF do funcionário: " + getCpf()+
				"\nCelular do funcionário: " + getCelular()+
				"\nSalário do funcionario: " + this.salario + 
				"\nFuncção do funcionário: " + this.funcao;
	}
	
	
}
