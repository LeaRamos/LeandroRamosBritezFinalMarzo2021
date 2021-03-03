package ar.edu.unlam.pb2.ordenes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
 * Mantiene una colecci�n de Productos, los cuales no pueden
 * estar duplicados. Adem�s, por cada Producto se desea mantener 
 * la cantidad del mismo en Stock,
 */
public class Catalogo {
	
	/*
	 * �Cu�l es la colecci�n adecuada?
	 */
	Map <Integer, Integer> listaProductos;
	
	
	
	public Catalogo() {
		
		listaProductos = new HashMap<Integer, Integer>();
	}

	/*
	 * Agregar producto al cat�logo.
	 * No se permiten Productos duplicados. Criterio: n�mero de Producto. 
	 */
	public Boolean agregarProducto(Producto producto, Integer cantidad){
		
		listaProductos.put(producto.getNumero(), cantidad);
		return true;
	}
	
	/*
	 * Remueve Producto del Cat�logo.
	 * Lanza una Excepci�n si el Producto no se encuentra en el Cat�logo.
	 */
	public Boolean quitarProducto(Producto producto) throws noExisteElProductoExcepci�n {
		
		if(this.getListaProductos().containsKey(producto.getNumero())) {
			 listaProductos.remove(producto.getNumero());
			 return true;
		}
		throw new noExisteElProductoExcepci�n("no existe el producto");
			
	}
	
	/*
	 * Descuenta la cantidad deseada de producto del Stock.
	 */
	
	public Boolean removerStock(Producto producto, Integer cantidad) throws noExisteElProductoExcepci�n {
		if(listaProductos.containsKey(producto.getNumero())) {
			
			Integer nuevaCantidad=listaProductos.get(producto.getNumero())-cantidad;
			
			return listaProductos.replace(producto.getNumero(), listaProductos.get(producto.getNumero()), nuevaCantidad);
		}
		
		throw new noExisteElProductoExcepci�n("no existe el producto");
	}
	
	/*
	 * Devuleve la cantidad de Productos en existencia.
	 */
	public Integer obtenerCantidad(Producto producto) {
		return listaProductos.get(producto.getNumero());
	}

	public Map<Integer, Integer> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(Map<Integer, Integer> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	
}
