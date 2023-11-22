package ar.edu.unlam.parcialR;

public class TarjetaDeCredito extends Tarjeta implements Pagadora {
	private Double limiteEnPesos;
	private Double limiteEnDolares;

	public TarjetaDeCredito(Long numero, String titular, String fechaDeVencimiento,
			Integer codSeg, Double limiteCompraPesos, Double limiteCompraDolares) {
		this.setNumero(numero);
		this.setTitular(titular);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setCodigoDeSeguridad(codSeg);
		this.setLimiteEnDolares(limiteCompraDolares);
		this.setLimiteEnPesos(limiteCompraPesos);
		
	}
	

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}


	public Double getLimiteEnPesos() {
		return limiteEnPesos;
	}


	public void setLimiteEnPesos(Double limiteEnPesos) {
		this.limiteEnPesos = limiteEnPesos;
	}


	public Double getLimiteEnDolares() {
		return limiteEnDolares;
	}


	public void setLimiteEnDolares(Double limiteEnDolares) {
		this.limiteEnDolares = limiteEnDolares;
	}

}
