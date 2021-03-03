package ar.edu.unlam.pb2.ordenes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
 * Mantiene una colección de Productos, los cuales no pueden
 * estar duplicados. Además, por cada Producto se desea mantener 
 * la cantidad del mismo en Stock,
 */
public class Catalogo {
	
	/*
	 * ¿Cuál es la colección adecuada?
	 */
	Map <Integer, Integer> listaProductos;
	
	
	
	public Catalogo() {
		
		listaProductos = new HashMap<Integer, Integer>();
	}

	/*
	 * Agregar producto al catálogo.
	 * No se permiten Productos duplicados. Criterio: número de Producto. 
	 */
	public Boolean agregarProducto(Producto producto, Integer cantidad){
		
		listaProductos.put(producto.getNumero(), cantidad);
		return true;
	}
	
	/*
	 * Remueve Producto del Catálogo.
	 * Lanza una Excepción si el Producto no se encuentra en el Catálogo.
	 */
	public Boolean quitarProducto(Producto producto) throws noExisteElProductoExcepción {
		
		if(this.getListaProductos().containsKey(producto.getNumero())) {
			 listaProductos.remove(producto.getNumero());
			 return true;
		}
		throw new noExisteElProductoExcepción("no existe el producto");
			
	}
	
	/*
	 * Descuenta la cantidad deseada de producto del Stock.
	 */
	
	public Boolean removerStock(Producto producto, Integer cantidad) throws noExisteElProductoExcepción {
		if(listaProductos.containsKey(producto.getNumero())) {
			
			Integer nuevaCantidad=listaProductos.get(producto.getNumero())-cantidad;
			
			return listaProductos.replace(producto.getNumero(), listaProductos.get(producto.getNumero()), nuevaCantidad);
		}
		
		throw new noExisteElProductoExcepción("no existe el producto");
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
