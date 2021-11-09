
public class Funcionario extends Pessoa{

	private float salario;
	private String funcao;
	
	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", funcao=" + funcao + ", getNome()=" + getNome() + ", getCpf()="
				+ getCpf() + "]";
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
}
