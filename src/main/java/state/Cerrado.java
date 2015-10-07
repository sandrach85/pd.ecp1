package state;

public class Cerrado extends ConexionEstado {

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(Estado.PREPARADO);
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(int respuesta,Conexion conexion) {
		// TODO Auto-generated method stub
		conexion.getLink();
		conexion.setEstado(Estado.CERRADO);
	}

	@Override
	public void enviar(String msg,Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

}
