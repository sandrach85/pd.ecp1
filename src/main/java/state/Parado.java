package state;

public class Parado extends ConexionEstado {

	public Parado() {
		super(Estado.PARADO);
	}

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void enviar(String msg, Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(new Preparado());
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new Parado());
	}

}
