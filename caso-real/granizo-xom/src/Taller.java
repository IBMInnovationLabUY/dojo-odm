
public class Taller {
	private String id_taller;
	private int nivel_seguridad; //0 - no seguro 1 - revisi�n nivel 1 2 - no requiere revisi�n
	
	public Taller() {
		// TODO Auto-generated constructor stub
	}
	
	public void setNivel_seguridad(int nivel_seguridad) {
		this.nivel_seguridad = nivel_seguridad;
	}
	
	public void setId_taller(String id_taller) {
		this.id_taller = id_taller;
	}
	
	public String getId_taller() {
		return id_taller;
	}
	
	public int getNivel_seguridad() {
		return nivel_seguridad;
	}
}
