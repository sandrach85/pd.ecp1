package state;

public class Preparado  extends ConexionEstado{

	public Preparado() {
		super(Estado.PREPARADO);
	}

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(new Preparado());
	}
        
	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new Cerrado());
	}

	@Override
	public void recibir(int respuesta,Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void enviar(String msg,Conexion conexion) {
		conexion.getLink().enviar(msg);
		conexion.setEstado(new Esperando());
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
