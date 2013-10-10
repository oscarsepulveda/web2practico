package persistencia.dominio;

public class RenglonMantenimiento {
	
	private Long id;
	private String detalle;
	private Repuesto repuesto;
	
	
	
	public RenglonMantenimiento() {
		
	}

	public RenglonMantenimiento(Long id, String detalle, Repuesto repuesto) {
		super();
		this.id = id;
		this.detalle = detalle;
		this.repuesto = repuesto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Repuesto getRepuesto() {
		return repuesto;
	}

	public void setRepuesto(Repuesto repuesto) {
		this.repuesto = repuesto;
	}

	@Override
	public String toString() {
		return "RenglonMantenimiento [id=" + id + ", detalle=" + detalle
				+ ", repuesto=" + repuesto + "]";
	}
	
	
	
	


}
