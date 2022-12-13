package com.ifsc.tds;

public class Fatura {

	private int faturald;
	private int mesAno;
	private int consumo;
	private boolean pago;
	private UC unidadeConsumidora; 
	
	
	public int getFaturald() {
		return faturald;
	}
	public void setFaturald(int faturald) {
		this.faturald = faturald;
	}
	public int getMesAno() {
		return mesAno;
	}
	public void setMesAno(int mesAno) {
		this.mesAno = mesAno;
	}
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	
}
