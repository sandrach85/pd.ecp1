package state;

public class Esperando  extends ConexionEstado{

	public Esperando() {
		super(Estado.ESPERANDO);
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
	public void recibir(int respuesta,Conexion conexion) {
		conexion.getLink().recibir(respuesta);
		if (respuesta==0){
			conexion.setEstado(new Preparado());
		}else{
			conexion.setEstado(new Cerrado());
		}
	}

	@Override
	public void enviar(String msg,Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

}
