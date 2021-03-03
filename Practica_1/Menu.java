import java.util.Scanner;

public class Menu{

    public static void main(String[] args){

        Operaciones opt = new Operaciones();
        int x=0;
        int opcion;
        do {
            System.out.println("\nBienvenido al menu\nSeleccione una opcion\n");
            System.out.println("[1] Capturar nombre y calificaciones\n[2] Imprimir calificaciones y promedio\n[3] Imprimir calificaciones y calificacion mas baja\n[4] Imprimir calificaciones y calificacion mas alta\n[5] Salir\n");
            
            Scanner opc = new Scanner(System.in);
            opcion = opc.nextInt();

            switch(opcion){
                case 1:
                  opt.Datos();
                  x=1;
                   break;

                case 2:
                if(x==1){
                  opt.ImprimirCalificaciones();
                  opt.CalcularPromedio();
                  
                }
                else{
                   System.out.println("\nCapture primero nombre y calificaciones.\n");
                }
                   break;

                case 3:
                if(x==1){
                  opt.ImprimirCalificaciones();
                  opt.CalcularMenor();
                }
                else{
                   System.out.println("\nCapture primero nombre y calificaciones.\n");
                }
                  break;

                case 4:
                if(x==1){
                  opt.ImprimirCalificaciones();
                  opt.CalcularMayor();
                }
                else{
                   System.out.println("\nCapture primero nombre y calificaciones.\n");
                }
                   break;

                case 5:
                   System.out.println("\nSaliendo del menu...\n");
                   break;

                default:
                   System.out.println("\nOpcion no valida\n");
                   break;        
            }
        }while(opcion!=5);
    }
}
