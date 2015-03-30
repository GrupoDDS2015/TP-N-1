package casaDeRopa;

import java.util.ArrayList;
import java.util.Collection;

public class Negocio {
	private Double valorFijo;
	private Double gananciaDelDia = 0.0;
	private Collection<Prenda> prendas = new ArrayList<Prenda>();
	private Collection<Venta> prendasVendidas = new ArrayList<Venta>();
	
	public Negocio(){
		super();
	}
	
	public void valorFijo(Double valorFijo){
		this.valorFijo = valorFijo;
	}
	
	public void agregarPrenda(Prenda prenda){
		prendas.add(prenda);
	}
	
	public void agregarPrendaVendida(Venta prendaVendida){
		prendasVendidas.add(prendaVendida);
	}
	
	public Double precioFinal(Prenda prenda){
		return (this.valorFijo + prenda.precioBase()) * prenda.tasaInteres();
	}
	
	public Double gananciaDel(String fecha){
		for(Venta prendaVendida : prendasVendidas){
			if(prendaVendida.mismaFecha(fecha)){
				this.gananciaDelDia = this.precioFinal(prendaVendida.prenda())*prendaVendida.cantidad() + this.gananciaDelDia;
			}
		}
		return this.gananciaDelDia;
		
	}
	

}
