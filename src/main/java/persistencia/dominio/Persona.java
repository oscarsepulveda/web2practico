package persistencia.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String typoDoc;
	private String nroDoc;
	private String nombre;
	private String apellido;
	
	public Persona(){}
	
	public Persona(long id, String typoDoc, String nroDoc, String nombre,
			String apellido) {
		super();
		this.id = id;
		this.typoDoc = typoDoc;
		this.nroDoc = nroDoc;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Persona(String typoDoc, String nroDoc, String nombre, String apellido) {
		super();

		this.typoDoc = typoDoc;
		this.nroDoc = nroDoc;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getTypoDoc() {
		return typoDoc;
	}
	public void setTypoDoc(String typoDoc) {
		this.typoDoc = typoDoc;
	}
	
	public String getNroDoc() {
		return nroDoc;
	}
	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	
}
