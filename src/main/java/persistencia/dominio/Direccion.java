package persistencia.dominio;

public class Direccion {
	
	 private String calle;
	 private int numero;
	 private String localidad;
	 private String provincia;
	 private String pais;
	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Direccion(String calle, int numero, String localidad,
			String provincia, String pais) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero
				+ ", localidad=" + localidad + ", provincia=" + provincia
				+ ", pais=" + pais + "]";
	}
	 
	 


}
