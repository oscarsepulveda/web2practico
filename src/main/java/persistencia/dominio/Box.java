package persistencia.dominio;

public class Box {
	
	 private Long id;
	 private int numero;
	 private String categoria;
	
	 public Box() {
	 }

	public Box(Long id, int numero, String categoria) {
		super();
		this.id = id;
		this.numero = numero;
		this.categoria = categoria;
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Box [id=" + id + ", numero=" + numero + ", categoria="
				+ categoria + "]";
	}
	 
	
	 
	 


}
