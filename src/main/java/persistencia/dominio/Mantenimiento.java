package persistencia.dominio;

import java.math.BigDecimal;
import java.sql.Date;

public class Mantenimiento {

	private BigDecimal id;
	private String estado;
	private Date fecha;
	private String observación;
	
	public Mantenimiento(){}

	public Mantenimiento(BigDecimal id, String estado, Date fecha,String observación) {
		this.id = id;
		this.estado = estado;
		this.fecha = fecha;
		this.observación = observación;
	}

	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getObservación() {
		return observación;
	}
	public void setObservación(String observación) {
		this.observación = observación;
	}
}
