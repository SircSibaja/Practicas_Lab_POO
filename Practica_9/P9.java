import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class P9 {

	public static void main(String[] args){
		
		Leer Archivo = new Leer("practica9.csv");
		Alumno al1 = new Alumno("Sirc Sibaja", "1272558",1);
		Alumno al2 = new Alumno("Jorge Flores", "1274537",2);
		Alumno al3 = new Alumno("Fernando Gomez", "1285436",3);
		
		Archivo.Calificaciones(al1, al2, al3);
		al1.CalcularPromedio();
		al2.CalcularPromedio();
		al3.CalcularPromedio();
		System.out.println(al1.MostarDatos());
		System.out.println(al2.MostarDatos());
		System.out.println(al3.MostarDatos());	
		
		try {
			File documento = new File("Alumnos.txt");
			FileWriter escribirdoc = new FileWriter(documento);
			PrintWriter imprimirdoc = new PrintWriter(escribirdoc);
			imprimirdoc.println(al1.MostarDatos());
			imprimirdoc.println(al2.MostarDatos());
			imprimirdoc.println(al3.MostarDatos());
			imprimirdoc.close();
			
            System.out.println("El archivo se creo con exito");
		}catch(IOException e) {
			System.out.println("Error: " + e);
		}
	}
}