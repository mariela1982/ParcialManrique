package ar.edu.unlam.parcialR;


public abstract class CuentaBancaria implements Transferible,MedioDePago {
	protected String entidad;
	protected String titular;
	protected Double saldo;
	protected String cbu;
	
	public CuentaBancaria(String entidad, String titular,String cbu,Double saldo) {
		this.entidad = entidad;
		this.titular = titular;
		this.cbu = cbu;
		this.saldo = saldo;
		
	}
	
	
	
	public String getCbu() {
		return cbu;
	}



	public void setCbu(String cbu) {
		this.cbu = cbu;
	}



	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}



	public String getEntidad() {
			return this.entidad;
	}

	
	public String getTitular() {
			return this.titular;
	}
	
	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean extraer(Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

}
