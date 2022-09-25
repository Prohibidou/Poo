
public class Episodio extends Obra {

	private String fechaEmision;

	


	public Episodio(String titulo, Float duracion, Integer calif, String fechaEmision) {
		super(titulo, duracion, calif);
		this.fechaEmision = fechaEmision;
	}






	@Override public String toString() {
		return "Episodio   " + super.getTitulo() + "  duracion en mins :  " + super.getDuracion() + "   calificacion   "
				+ super.getCalif() + "  [fechaEmision=" + fechaEmision + "]";
	}

}
