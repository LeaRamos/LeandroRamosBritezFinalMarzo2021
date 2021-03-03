package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LineaOrdenTest {
	@Test
	public void queSePuedeCalcularElTotalPorDetalle() {		
		
		Producto p1=new Producto(1, "yerba", 200.0);
		//Producto p2=new Producto(2, "azucar", 20.0);
		//Producto p3=new Producto(3, "galletita", 50.0);
		
		LineaOrden lo1=new LineaOrden(p1, 5);
		
		Integer cantidad=lo1.getCantidad();
		
		assertEquals(242.0,p1.getPrecioFinal(),0.0 );
		
		Double precioFinalTotal=p1.getPrecioFinal()*cantidad;
		
		assertEquals(precioFinalTotal,lo1.getSubtotal(),0.0);
		

	}
	
}
