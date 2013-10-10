package persistencia.dominio;

import java.util.List;

public class Paniol {
	
	private Long id;
	private int numero;
	private List<Repuesto> repuestos;
	public Paniol() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Paniol(Long id, int numero, List<Repuesto> repuestos) {
		super();
		this.id = id;
		this.numero = numero;
		this.repuestos = repuestos;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public List<Repuesto> getRepuestos() {
		return repuestos;
	}
	public void setRepuestos(List<Repuesto> repuestos) {
		this.repuestos = repuestos;
	}

	@Override
	public String toString() {
		return "Paniol [id=" + id + ", numero=" + numero + ", repuestos="
				+ repuestos + "]";
	}
	
	


}
