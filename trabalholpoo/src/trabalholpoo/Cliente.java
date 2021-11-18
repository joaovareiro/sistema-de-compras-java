package trabalholpoo;

public class Cliente extends Pessoa{

	public Cliente(String nome, String cpf, Endereco endereco, String celular) {
		super(nome, cpf, endereco, celular);
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
		return "Nome do cliente: " + getNome() +
			   "\nCPF do cliente: " + getCpf() + 
			   "\nCelular do cliente: " + getCelular();
	}
}
