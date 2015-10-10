package state;

public class Conexion {
	private ConexionEstado estado;

	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		this.estado = new Cerrado();
	}

	public Link getLink() {
		return link;
	}

	public Estado getEstado() {
		return this.estado.getEstado();
	}

	protected void setEstado(ConexionEstado estado) {
		this.estado = estado;
	}

	public void abrir() {
		estado.abrir(this);
	}

	public void parar() {
		estado.parar(this);
	}

	public void cerrar() {
		estado.cerrar(this);
	}

	public void recibir(int respuesta) {
		estado.recibir(respuesta, this);
	}

	public void enviar(String msg) {
		estado.enviar(msg, this);
	}

	public void iniciar() {
		estado.iniciar(this);
	}
}
