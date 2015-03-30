package casaDeRopa;

public abstract class Prenda {
private Double precioBase;
private Presedencia presedencia;
	
	public void precioBase(Double precioBase){
		this.precioBase = precioBase;
	}
	
	public Double precioBase(){
		return this.precioBase;
	}
	
	public void presedencia(Presedencia presedencia){
		this.presedencia = presedencia;
	}
	
	public Double tasaInteres(){
		return this.presedencia.tasa();
	}

}
