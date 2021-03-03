package ar.edu.unlam.pb2.ordenes;

public class noExisteElProductoExcepción extends Exception {
	public noExisteElProductoExcepción(String mensaje) {
		super(mensaje);
	}

}
