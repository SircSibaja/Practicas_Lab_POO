import java.io.BufferedReader;
import java.io.FileReader;


public class Leer {
	
	public Leer(String Archivo) {
		LeerArchivo(Archivo);
		CambiarDatos();
	}
	
	BufferedReader leer;
	String linea;
	String[] datos = null;
	int[] datosEnteros = new int[21];
	
	public void LeerArchivo(String Archivo) {
		try {
			leer = new BufferedReader(new FileReader(Archivo));
			while((linea = leer.readLine()) != null) {
				datos = linea.split(",");
				System.out.println();
			}
			leer.close();
			linea = null;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void CambiarDatos() {
		datosEnteros[0] = 67;
		for(int i=1 ; i < datos.length; i++) {
			datosEnteros[i] = Integer.parseInt(datos[i]);
			
		}
	}
	
	public void Calificaciones(Alumno al1, Alumno al2, Alumno al3) {
		int x = 0;
		
		for(int i=0; i < datosEnteros.length; i++) {
			if(i < 7) {
				al1.calificaciones[x] = datosEnteros[i];
				x++;
			}
			else if(i >= 7 && i < 14) {
				if(x == 7) {x = 0;}
				al2.calificaciones[x] = datosEnteros[i];
				x++;
			}
			else if(i >= 14 && i < 21) {
				if(x == 7) {x = 0;}
				al3.calificaciones[x] = datosEnteros[i];
				x++;
			}
		}
	}
}