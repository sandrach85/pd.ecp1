package state;

public class Preparado  extends ConexionEstado{

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(new Preparado());
	}
        
	@Override
	public void cerrar(Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recibir(int respuesta,Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviar(String msg,Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

}
