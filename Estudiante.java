enum Curso {
	PRIMARIA, ESO, BACHILLERATO, UNIVERSIDAD
};
/**
 * 
 * Clase estudiante
 * @author d18sisaj
 * 
 */
public class Estudiante extends Persona{
	Curso curso;
	protected Estudiante(String nombre, String apellidos, String nif,
			Curso curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.curso = curso;
	}

	/**
	 * Cambia el nombre
	 * @param nombre
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * cambia el apellido
	 * @param apellidos
	 */
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * canbia el nif
	 * @param nif
	 */
	protected void setNif(String nif) {
		this.nif = nif;
	}
		
	/**
	 * devuelve el curso
	 * @return
	 */
	protected Curso getCurso() {
		return curso;
	}

	/**
	 * cambia el curso
	 * @param curso
	 */
	protected void setCurso(Curso curso) {
		this.curso = curso;
	}

	
}
