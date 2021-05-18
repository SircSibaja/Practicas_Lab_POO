public class Alumno{
	String nombre;
	String matricula;
    int numal;
	String calif = new String();
	int[] calificaciones = new int[7];
	float promedio = 0;
	
	public Alumno(String nombre, String matricula, int numal) {
		this.nombre = nombre;
		this.matricula = matricula;
        this.numal = numal;
	}
	private void JuntarCalificaciones() {
		for(int i=0; i < calificaciones.length; i++) {
			calif += "["  + calificaciones[i] + "] ";
		}
	}
	public void MostrarCalificaciones() {
		System.out.print("Grades: ");
		for(int i=0; i < calificaciones.length; i++) {
			System.out.print("["  + calificaciones[i] + "] ");
		}
		System.out.println();
	}
	public void CalcularPromedio() {
		for(int i = 0 ; i < calificaciones.length; i ++) {
			promedio += calificaciones[i];
		}
		promedio /= calificaciones.length;
		JuntarCalificaciones();
	}
	
	public String MostarDatos() {
		return "Datos del estudiante "+ numal+ ": \nNombre: " + nombre + " \nMatricula: " + matricula + " \nCalificaciones: "+ calif + " \nPromedio: " + promedio+" \n";
	}
}