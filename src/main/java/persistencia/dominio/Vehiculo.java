package persistencia.dominio;
import java.math.BigDecimal;

public class Vehiculo {

	private BigDecimal id;
	private String dominio;
	private String marca;
	private String modelo;
	
	public Vehiculo(){}	
	
	public Vehiculo(BigDecimal id, String dominio, String marca, String modelo) {
		this.id = id;
		this.dominio = dominio;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
