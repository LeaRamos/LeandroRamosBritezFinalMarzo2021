package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductoTest {
	@Test
	public void queSePuedePedirImpuestoSobreProducto() {	
		Producto p1=new Producto(1, "yerba", 200.0);
		
		
		assertEquals(42.0, p1.getImpuesto(),0.0);
		
	}
	
	@Test
	public void queSePuedePedirImpuestoSobreProductoDeLujo() {	
		ProductoDeLujo pl1=new ProductoDeLujo(2, "dulce de leche", 400.0);
		
		assertEquals(144.0, pl1.getImpuesto(),0.0);
	}
	
}
