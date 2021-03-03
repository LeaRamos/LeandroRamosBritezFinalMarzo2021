package ar.edu.unlam.pb2.ordenes;

public class Producto {
	private Integer numero; //ID
	private String descripcion;
	private Double precio;

	/*
	 * Se crea un producto.
	 */
	public Producto(Integer numero, String descripcion, Double precio) {	
		this.numero=numero;
		this.descripcion=descripcion;
		this.precio=precio;
	}
	
	/*
	 * Retorna el precio unitario del Producto.
	*/
	public Double getPrecio() {
		return this.precio;
	}
	
	/*
	 * Devulve el monto del impuesto.
	 * Todo producto tiene un 21% de impuesto.
	 */
	public Double getImpuesto() {
		Double impuesto=0.21;
		return this.precio*impuesto;
	}
	
	/*
	 * Devuelve la descripción del Producto
	 */
	public String getDescripcion() {
		return this.descripcion;
	}
	
	/*
	 * Devuelve el precio del producto luego de aplicar el impuesto.
	 */
	public Double getPrecioFinal() {
		Double precioFinal=0.0;
		return precioFinal=this.getImpuesto()+this.getPrecio();
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
