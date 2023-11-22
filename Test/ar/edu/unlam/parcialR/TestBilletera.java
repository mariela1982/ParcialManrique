package ar.edu.unlam.parcialR;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.CBUInvalidoException;
import ar.edu.unlam.pb2.CuentaBancaria;
import ar.edu.unlam.pb2.Transferible;

public class TestBilletera {
	
	@Test
	public void queSePuedaCrearUnaTarjetaDeCredito() {
		final Long NUMERO_ESPERADO = 5446789813221201L;
		final String TITULAR_ESPERADO = "Mariela Manrique";
		final Integer CODIGO_DE_SEGURIDAD_ESPERADO = 123;
		final String FECHA_DE_VENCIMIENTO_ESPERADO = "25/08/2025";
		final Double LIMITE_COMPRA_EN_PESOS = 100000.0;
		final Double LIMITE_COMPRA_EN_DOLARES = 1000.0;
		
		Tarjeta tarjetaDeCredito = new TarjetaDeCredito(NUMERO_ESPERADO, TITULAR_ESPERADO, FECHA_DE_VENCIMIENTO_ESPERADO, CODIGO_DE_SEGURIDAD_ESPERADO, LIMITE_COMPRA_EN_PESOS, LIMITE_COMPRA_EN_DOLARES);
		assertNotNull(tarjetaDeCredito);
		
	}
	@Test
	public void queSePuedaCrearUnaTarjetaDeDebito() {
		final Long NUMERO_ESPERADO = 5446789813221201L;
		final String TITULAR_ESPERADO = "Mariela Manrique";
		final Integer CODIGO_DE_SEGURIDAD_ESPERADO = 123;
		final String FECHA_DE_VENCIMIENTO_ESPERADO = "25/08/2025";
		final Double SALDO_ESPERADO = 10000.0;
		
		
		Tarjeta tarjetaDeDebito = new TarjetaDeDebito(NUMERO_ESPERADO, TITULAR_ESPERADO, FECHA_DE_VENCIMIENTO_ESPERADO, CODIGO_DE_SEGURIDAD_ESPERADO, SALDO_ESPERADO);
		assertNotNull(tarjetaDeDebito);
		
	}
	
	@Test
	public void queSePuedaCrearUnaCuentaVirtual() {
		final String CVU_ESPERADO = "75432195446789813221201";
		final String TITULAR_ESPERADO = "Mariela Manrique";
		final String ENTIDAD = "Mercado Pago";
		final Double SALDO_ESPERADO = 10000.0;
		
		
		MedioDePago cuentaVirtual = new CuentaVirtual(CVU_ESPERADO, TITULAR_ESPERADO, ENTIDAD, SALDO_ESPERADO);
		assertNotNull(cuentaVirtual);
		
	}
	
	@Test
	public void queSePuedaCrearUnaCajaDeAhorro() {
		
		final String CBU_ESPERADO = "01702046600000087865";
		final String BANCO_ESPERADA = "HCBC";
		final String TITULAR_ESPERADO = "Manrique Mariela";
		final Double SALDO_ESPERADO = 150000.00;
		
		
		CuentaBancaria cajaDeAhorro = new CajaDeAhorro(CBU_ESPERADO, BANCO_ESPERADA, TITULAR_ESPERADO,SALDO_ESPERADO);
		
		as
		sertNotNull(cajaDeAhorro);
	}
	
	

	@Test
	public void queSePueanAlamcenarLosDistintosTiposDeTransacciones() {
		String nombre = "uala";
		Billetera nueva = new Billetera(nombre);
		
		
	}

}
