import java.util.Scanner;

public class CapturarDatos{

    public static String CapturarNombre(){
        System.out.println("\nIngresa un nombre: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static float[] CapturarCalificacion(){
        int cant = CapturarCantidad();
        float calificacion[] = new float[cant];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < calificacion.length; i++){
            System.out.print("\nIngresa la calificacion "+(i+1)+": ");
            calificacion[i] = sc.nextFloat();
        }
        return calificacion;
    }

    public static int CapturarCantidad(){
        System.out.println("Cuantas calificaciones va a ingresar: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}