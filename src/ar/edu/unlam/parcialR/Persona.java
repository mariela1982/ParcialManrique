package ar.edu.unlam.parcialR;

public abstract class Persona {
	protected Long cuilCuit ;
	protected String nombre;
	
	public Persona(Long cuilCuit,String nombre){
		this.cuilCuit = cuilCuit;
		this.nombre = nombre;
		
	}

	public Long getCuilCuit() {
		return cuilCuit;
	}

	public void setCuilCuit(Long cuilCuit) {
		this.cuilCuit = cuilCuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
