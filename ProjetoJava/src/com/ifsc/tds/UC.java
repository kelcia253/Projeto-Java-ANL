package com.ifsc.tds;
 
import com.ifsc.tds.Endereco;

public class UC {
	
	private int UCid;
	private Cliente Cliente;
	private int leituraAnterior;
	private int leituraAtual;
	private Endereco Endereco;
	public int getUCid() {
		return UCid;
	}
	public void setUCid(int uCid) {
		UCid = uCid;
	}
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	public int getLeituraAnterior() {
		return leituraAnterior;
	}
	public void setLeituraAnterior(int leituraAnterior) {
		this.leituraAnterior = leituraAnterior;
	}
	public int getLeituraAtual() {
		return leituraAtual;
	}
	public void setLeituraAtual(int leituraAtual) {
		this.leituraAtual = leituraAtual;
	}
	public Endereco getEndereco() {
		return Endereco;
	}
	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}
	
	
	

}
