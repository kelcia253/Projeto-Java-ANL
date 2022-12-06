
public class Cliente {

	private int IdCliente;
	private String Nome;
	private int Endereco;
	
	public int getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getEndereco() {
		return Endereco;
	}
	public void setEndereco(int endereco) {
		Endereco = endereco;
	}
	@Override
	public String toString() {
		return getNome();
	}
	
	
}
