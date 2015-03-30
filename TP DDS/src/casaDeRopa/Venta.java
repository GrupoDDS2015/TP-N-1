package casaDeRopa;

public class Venta {
	private Double cantidad;
	private Prenda prenda;
	private String fecha;
	
	public void fecha(String fecha){
		this.fecha = fecha;
	}
	
	public void cantidad(Double cantidad){
		this.cantidad = cantidad;
	}
	
	//Fijarse si es necesario
	public void prenda(Prenda prenda){
		this.prenda = prenda;
	}
	
	public String fecha(){
		return this.fecha;
	}
	
	public Double cantidad(){
		return this.cantidad;
	}
	
	public Prenda prenda() {
		return this.prenda;
	}
	
	public Boolean mismaFecha(String fecha){
		return (this.fecha == fecha);
	}

}
