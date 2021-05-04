import java.util.Scanner;

public class CapturaEntrada {

    public static String capturarString(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return sc.nextLine();
    }

    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return sc.nextInt();
    }

    public static double capturarDouble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return sc.nextDouble();
    }
}
