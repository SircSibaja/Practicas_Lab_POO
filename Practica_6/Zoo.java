public class Zoo{
    
    Animal arreglo[] = new Animal[100];
    Animal arreglo1[] = new Animal[100];

    int i=0,x;

    public void AgregarAnimal(){
        if(i<=arreglo.length){
            System.out.println("\nVamos a agregar un nuevo animal al Zoo\nLlena el siguiente formulario");
            switch(x=Capturar.capturarEntero("\n¿Que especie de animal es?\n[1] Pajaro\n[2] Elefante\n[3] Caballo\n[4] Oso\n")){
                case 1:
                    System.out.println();
                    arreglo[i] = new Pajaro(Capturar.capturarString("\n¿Cual es el nombre del pajaro?"), Capturar.capturarString("\n¿Cual es el sexo del pajaro?"), Capturar.capturarEntero("\n¿Cual es la edad del pajaro?"));
                break;

                case 2:
                    System.out.println();
                    arreglo[i] = new Elefante(Capturar.capturarString("\n¿Cual es el nombre del elefante?"), Capturar.capturarString("\n¿Cual es el sexo del elefante?"), Capturar.capturarEntero("\n¿Cual es la edad del elefante?"));
                break;

                case 3:
                    System.out.println();
                    arreglo[i] = new Caballo(Capturar.capturarString("\n¿Cual es el nombre del caballo?"), Capturar.capturarString("\n¿Cual es el sexo del caballo?"), Capturar.capturarEntero("\n¿Cual es la edad del caballo?"));
                break;

                case 4:
                    System.out.println();
                    arreglo[i] = new Oso(Capturar.capturarString("\n¿Cual es el nombre del oso?"), Capturar.capturarString("\n¿Cual es el sexo del oso?"), Capturar.capturarEntero("\n¿Cual es la edad del oso?"));
                default:
                    System.out.println("\nOpcion no valida");
                break;
            }
            if(x==1||x==2||x==3||x==4){
                i=i+1;
            }
        }
        else{
            System.out.println("\nLo sentimos, ya no tenemos espacio en el Zoo para mas animales");
        }
    }
        

    public void EliminarAnimal(){
        int num,k=0;
        if(i>0){
            System.out.println("\nEstos son los animales que hay actualmente en el Zoo");
            for (int j=0; j<i; j++){
                arreglo[j].mostrarnombre(j);
            }
            num = Capturar.capturarEntero("\n¿Que animal deseas trasladar?\n");
            for(int j=0; j<i; j++){
                if(j!=num-1){
                    arreglo1[k]=arreglo[j];
                    k++;
                }
                else{
                    System.out.println("\nEl animal esta siendo trasladado...");
                }
            }
            for(k=0; k<i; k++){
                arreglo[k]=arreglo1[k];
    
            }
            System.out.println("\nEl animal se ha trasladado con exito");
            i=i-1;
        }
        else{
            System.out.println("\nNo hay animales en el Zoo que podamos trasladar");
        }
       

    }

    public void MostrarAnimales(){
        if(i>0){
            System.out.println("\nEsta es la lista de los animales actuales en el Zoo");
            for (int j=0; j<i; j++){
                System.out.println("\nAnimal No."+(j+1));
                System.out.println("Nombre: "+arreglo[j].getNombre()+"\nSexo: "+arreglo[j].getSexo()+"\nEdad: "+arreglo[j].getEdad());
            }
        }
        else{
            System.out.println("\nLo sentimos actualmente no hay animales en el Zoo");
        }
    }


    public Animal[] getArreglo() {
        return arreglo;
    }


    public void setArreglo(Animal[] arreglo) {
        this.arreglo = arreglo;
    }

    
}