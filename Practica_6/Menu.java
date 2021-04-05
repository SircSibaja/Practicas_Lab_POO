public class Menu {
    public static void main(String[] args){
        Zoo zoo = new Zoo();
        Veterinario vet = new Veterinario("Carlos","8:00 - 18:00", 27);
        int opc, op;
        System.out.println("\nBienvenido al Zoo\nEsto es lo que puede hacer aqui:");
        do{
            System.out.println("\n[1] Agregar un animal al Zoo\n[2] Trasladar un animal a otro Zoo\n[3] Mostrar animales en el Zoo\n[4] Ver al veterinario\n[5] Salir");
            switch(opc = Capturar.capturarEntero("\nSeleccione la opcion que desee\n")){
                case 1:
                    zoo.AgregarAnimal();
                break;

                case 2:
                    zoo.EliminarAnimal();
                break;

                case 3:
                    zoo.MostrarAnimales();
                break;

                case 4:
                    switch(op=Capturar.capturarEntero("\n¿Que es lo que quiere hacer con el veterinario?\n[1] Ver su informacion\n[2] Vacunar a los animales del Zoo\n[3] Ayudarlo a alimentar a los animales\n[4] Saludarlo\n[5] Nada")){
                        case 1:
                            vet.Informacion();
                        break;

                        case 2:
                            vet.Vacuna(zoo.getArreglo(),zoo.i);
                        break;
            
                        case 3:
                            vet.Alimentar(zoo.getArreglo(),zoo.i);
                        break;

                        case 4:
                            vet.Saludo();
                        break;

                        case 5:
                            System.out.println("\nHasta luego");
                        break;

                        default:
                            System.out.println("\nOpcion seleccionada no valida");
                        break;
                    }
                break;

                case 5:
                    System.out.println("\nSaliendo...");
                break;

                default:
                    System.out.println("\nOpcion seleccionada no valida");
                break;
            }


        }while(opc!=5);
    }
}
