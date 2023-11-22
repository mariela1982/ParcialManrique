package ar.edu.unlam.parcialR;

public class CuentaVirtual implements MedioDePago, Pagadora {
	private String cvu;
	private String titular;
	private String entidad;
	private Double saldo;
	
	
	public CuentaVirtual(String cvu, String titular, String entidad, Double saldo) {
		this.setCvu(cvu);
		this.setTitular(titular);
		this.setEntidad(entidad);
		this.setSaldo(saldo);
	}

	

	public String getCvu() {
		return cvu;
	}

	public void setCvu(String cvu) {
		this.cvu = cvu;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

}
