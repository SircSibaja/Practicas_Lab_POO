public class Banco {
    
    Cuenta cuenta = new Cuenta();

    public void CrearCuenta(){
        int n;
        cuenta.setSaldo(0);
        
        System.out.println("\nMuy bien, vamos a crear una cuenta");
        System.out.print("\nPrimero ingresa tu nombre: ");
        cuenta.setNombre(Capturar.capturarString());

        System.out.print("\nIngresa el Pin con el que accederas a tu cuenta: ");
        cuenta.setPin(Capturar.capturarEntero());

        System.out.println("\nTu saldo actualmente es de: "+cuenta.getSaldo());
        do{
            System.out.println("\n¿Quieres hacer tu primer deposito?\n[1] Si\n[2] Luego\n");
            switch(n=Capturar.capturarEntero()){
                case 1:
                    System.out.println("\n¿Cuanto dinero desea depositar?");
                    cuenta.setSaldo(Capturar.capturarFloat());
                    System.out.println("\nTu saldo actual es de: "+cuenta.getSaldo()+" $");
                break;

                case 2:
                    System.out.println("\nMuy bien, nos vemos luego");
                break;

                default:
                    System.out.println("\nIngresa una opcion valida");
                break;

            }
        }while(n!=1 && n!=2);
        System.out.println("\nTu cuenta se ha creado exitosamente"); 
    }

    public void AccederCuenta(){
        int pin,y,a=0;
        float retiro,deposito;

        do{
            System.out.println("\nIngrese su Pin para acceder a su cuenta");
            pin=Capturar.capturarEntero();
            if(pin==cuenta.getPin()){
                System.out.println("\nPin correcto");
                do{
                    System.out.println("\nSu saldo actual es de: "+cuenta.getSaldo()+" $\n\nSeleccione la opcion que desea realizar\n\n[1] Depositar\n[2] Retirar\n[3] Regresar al menu anterior\n");
                    switch (y=Capturar.capturarEntero()){
                        case 1:
                            System.out.println("\n¿Cuanto dinero desea depositar?");
                            deposito = Capturar.capturarFloat();
                            cuenta.setSaldo(cuenta.getSaldo()+deposito);
                            System.out.println("\nDeposito completo");
                        break;

                        case 2:
                            a=0;
                            do{
                                System.out.println("\n¿Cuanto dinero desea retirar?");
                                retiro = Capturar.capturarFloat();
                                if(retiro <= cuenta.getSaldo()){
                                    cuenta.setSaldo(cuenta.getSaldo()-retiro); 
                                    System.out.println("\nRetiro completado");
                                    a=1;
                                }
                                else{
                                    System.out.println("\nSaldo insuficiente");
                                }
                            }while(a!=1);
                        break;

                        default:
                        System.out.println("\nIngrese una opcion valida\n");
                        break;
                    }
                }while(y!=3);
            }
            else{
                System.out.println("\nPin incorrecto");
            }
        }while(pin!=cuenta.getPin());
    }
}
