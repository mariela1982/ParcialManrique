package ar.edu.unlam.parcialR;

public class TarjetaDeDebito extends Tarjeta implements Pagadora {
	

	public TarjetaDeDebito(Long numero, String titular, String fechaDeVencimiento,
			Integer codSeg, Double saldo) {
		this.setNumero(numero);
		this.setTitular(titular);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setCodigoDeSeguridad(codSeg);
		this.setSaldo(saldo);
	
	}


	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

}
