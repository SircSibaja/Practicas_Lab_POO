import java.util.Scanner;

public class Capturar {

    public static String capturarString(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int capturarEntero(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static float capturarFloat(){
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }
}
