package ar.edu.unlam.pb2.ordenes;


public class LineaOrden {
	private Producto item;
	private Integer cantidad;
		
	/*
	 * Crea un Item en la Orden con un Producto y catidad especificados.
	 */
	public LineaOrden(Producto producto, Integer cantidad) {	
		this.item=producto;
		this.cantidad=cantidad;
	}	
	
	/*
	 * Informa el Subtotal del Item.
	 */
	public Double getSubtotal() {
		Double subTotal=0.0;
		
		return subTotal=item.getPrecioFinal()*this.getCantidad();
		
	}
	/*
	 * Devuelve el Producto.	
	 */
	public Producto getProducto() {
		return this.item;
	}
	/*
	 * Devuelve la cantidad.
	 */
	public Integer getCantidad() {
		return this.cantidad;
	}	
	
}
