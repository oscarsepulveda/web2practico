package persistencia.dominio;
import java.math.BigDecimal;

public class Taller {

	private BigDecimal id;
	private String nombre;
	private String direccion;
	private String observación;
	
	public Taller(){}
	
	public Taller(BigDecimal id, String nombre, String direccion, String observación) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.observación = observación;
	}
	
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getObservación() {
		return observación;
	}
	public void setObservación(String observación) {
		this.observación = observación;
	}
}
