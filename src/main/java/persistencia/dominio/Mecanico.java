package persistencia.dominio;

public class Mecanico {

	private String box;
	private Taller taller;
	
	public Mecanico(){}
	
	public Mecanico(String box, Taller taller) {
		this.box = box;
		this.taller = taller;
	}
	
	public String getBox() {
		return box;
	}
	public void setBox(String box) {
		this.box = box;
	}
	
	public Taller getTaller() {
		return taller;
	}
	public void setTaller(Taller taller) {
		this.taller = taller;
	}
}
