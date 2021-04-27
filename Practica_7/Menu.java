public class Menu{
    public static void main(String[] args){
        boolean ingredientes=false;
        boolean cocinar=false;
        boolean servir=false;
        int opc,opcion;

        RobotChef rc = new RobotChef(100, 789, "RobotChef", "Ninguna");
        MiniCuchillos cu = new MiniCuchillos(100, 123, "Mini Robot Cuchillos","Ninguna");
        MiniCaliente ca = new MiniCaliente(100,456,"Mini Robot Calentador","Ninguna");

        System.out.println("\nBienvenido al sistema\nAqui podra coordinar a los robots para cocinar su platillo");
        do{
            System.out.println("\nSeleccione al robot que quiere controlar\n[1] RobotChef\n[2] Mini Robot Cuchillos\n[3] Mini Robot Calentador\n[4] Salir del programa");
            switch(opc = Capturar.capturarEntero()){
                case 1:
                    do{
                        System.out.println("\nSeleccione que accion quiere que realice el robot\n[1] Preparar los ingredientes\n[2] Cocinar el platillo\n[3] Servir el platillo\n[4] Mostrar infromacion del robot\n[5] Regresar al menu anterior");
                        switch(opcion = Capturar.capturarEntero()){
                            case 1:
                                ingredientes = rc.PreparaIngredientes(ingredientes);
                            break;

                            case 2:
                                cocinar = rc.CocinarPlatillo(cocinar, ingredientes);
                            break;

                            case 3:
                                servir = rc.Servir(cocinar, ingredientes, servir);
                            break;

                            case 4:
                                rc.Informacion();
                            break;

                            case 5:
                            break;

                            default:
                                System.out.println("\nOpcion no valida");
                            break;
                        }
                    }while(opcion!=5 && servir!=true);
                break;

                case 2:
                    do{
                        System.out.println("\nSeleccione que accion quiere que realice el robot\n[1] Preparar los ingredientes\n[2] Cocinar el platillo\n[3] Servir el platillo\n[4] Mostrar infromacion del robot\n[5] Regresar al menu anterior");
                        switch(opcion = Capturar.capturarEntero()){
                            case 1:
                                ingredientes = cu.PreparaIngredientes(ingredientes);
                            break;

                            case 2:
                                System.out.println("\nError: El Mini Robot Cuchillos no puede cocinar los platillos");
                            break;

                            case 3:
                                System.out.println("\nError: El Mini Robot Cuchillos no puede servir los platillos");
                            break;

                            case 4:
                                cu.Informacion();
                            break;

                            case 5:
                            break;

                            default:
                                System.out.println("\nOpcion no valida");
                            break;
                        }
                    }while(opcion!=5);
                break;

                case 3:
                    do{
                        System.out.println("\nSeleccione que accion quiere que realice el robot\n[1] Preparar los ingredientes\n[2] Cocinar el platillo\n[3] Servir el platillo\n[4] Mostrar infromacion del robot\n[5] Regresar al menu anterior");
                        switch(opcion = Capturar.capturarEntero()){
                            case 1:
                                System.out.println("\nError: El Mini Robot Calentador no puede preparar los ingredientes");
                            break;

                            case 2:
                                cocinar = ca.CocinarPlatillo(cocinar, ingredientes);
                            break;

                            case 3:
                                System.out.println("\nError: El Mini Robot Calentador no puede servir los platillos");
                            break;

                            case 4:
                                ca.Informacion();
                            break;

                            case 5:
                            break;

                            default:
                                System.out.println("\nOpcion no valida");
                            break;
                        }
                    }while(opcion!=5);
                break;
            }
        }while(opc!=4 && servir!=true);  
        System.out.println("\nGracias por usar nuestros robots :)\nInformacion final sobre el uso todos los robots");
        rc.Informacion();
        cu.Informacion();
        ca.Informacion();
    }
}