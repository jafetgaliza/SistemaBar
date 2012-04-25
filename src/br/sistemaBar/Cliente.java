package br.sistemaBar;

public class Cliente {
	
	private int codCliente;
	private String nome;
	private String endereco;
	private String telefone;
	private String dataNasc;
	
	public Cliente(int codCliente,String nome,String endereco,String telefone,String dataNasc){
		this.codCliente = codCliente;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Cliente["+codCliente+"]: "+nome+"\nEndereco: "+endereco+ "\nTelefone: "+telefone
				+"\nData de Nascimento: "+dataNasc;
	}
	

}
