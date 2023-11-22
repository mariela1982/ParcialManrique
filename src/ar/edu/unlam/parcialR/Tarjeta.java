package ar.edu.unlam.parcialR;

public abstract class Tarjeta implements MedioDePago {
	protected Long numero;
	protected String titular;
	protected String fechaDeVencimiento;
	protected Integer codigoDeSeguridad;
	protected Double saldo;
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}
	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}
	public Integer getCodigoDeSeguridad() {
		return codigoDeSeguridad;
	}
	public void setCodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	



}
