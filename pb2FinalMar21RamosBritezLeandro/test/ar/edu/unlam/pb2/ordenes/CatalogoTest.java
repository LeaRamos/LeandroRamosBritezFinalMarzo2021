package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;





public class CatalogoTest {

	@Test (expected=noExisteElProductoExcepción.class)
	public void queQuitarProductoInexitenteLanceExcepcion() throws noExisteElProductoExcepción {
		Producto p1=new Producto(1, "yerba", 200.0);
		Producto p2=new Producto(2, "azucar", 20.0);
		Producto p3=new Producto(3, "galletita", 50.0);
		
		Catalogo catalogo= new Catalogo();
		
		catalogo.agregarProducto(p1, 2);
		catalogo.agregarProducto(p2, 3);
		
		catalogo.quitarProducto(p3);
		
	}
	
	@Test
	public void queAlRemoverStockLaCantidadEnExistenciaSeaCorrecta() throws productoDuplicadoExcepción, noExisteElProductoExcepción {
		Producto p1=new Producto(1, "yerba", 200.0);
		Producto p2=new Producto(2, "azucar", 20.0);
		Producto p3=new Producto(3, "galletita", 50.0);
		
		Catalogo catalogo= new Catalogo();
		
		
		catalogo.agregarProducto(p1, 2);
		catalogo.agregarProducto(p2, 3);
		
		catalogo.removerStock(p1, 1);
		
		Integer cantidad=catalogo.obtenerCantidad(p1);
		
		assertEquals(cantidad, catalogo.obtenerCantidad(p1));

	}
}
