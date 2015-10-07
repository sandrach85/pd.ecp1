package state;

public abstract class ConexionEstado {

	public abstract void abrir(Conexion conexion);

	public abstract void cerrar(Conexion conexion);

	public abstract void recibir(int respuesta,Conexion conexion);

	public abstract void enviar(String msg,Conexion conexion);

	public abstract void iniciar(Conexion conexion);
}
