public class Menu {

	public static void main(String[] args) {
        int opc,x=0;
        Banco banco = new Banco();
        System.out.println("\nBienvenido al programa");

        do {
            System.out.println("\nSeleccione una opcion\n[1] Crear cuenta\n[2] Acceder a una cuenta\n[3] Salir\n");
            opc = Capturar.capturarEntero();
            switch(opc){
                case 1:
                    banco.CrearCuenta();
                    x=1;
                break;

                case 2:
                    if(x==1){
                        banco.AccederCuenta();
                    }
                    else{
                        System.out.println("\nPrimero cree una cuenta");
                    }
                break;

                case 3:
                    System.out.println("\nSaliendo...\n");
                break;

                default:
                    System.out.println("\nOpcion no valida\n");
                break;
            }
        }while(opc != 3);
	}
}