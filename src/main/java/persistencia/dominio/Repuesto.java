package persistencia.dominio;

public class Repuesto {
	
	private Long id;
	private String codigo;
	private String descripcion;
	
	public Repuesto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Repuesto(Long id, String codigo, String descripcion) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Repuesto [id=" + id + ", codigo=" + codigo + ", descripcion="
				+ descripcion + "]";
	}
	
	


}
