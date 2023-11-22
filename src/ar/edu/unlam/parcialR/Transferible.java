package ar.edu.unlam.parcialR;

public interface Transferible {
	
	Double getSaldo();
	void depositar(Double importe);
	Boolean extraer(Double importe);

}
