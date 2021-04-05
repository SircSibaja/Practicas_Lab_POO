public class Veterinario{
    String nombre, horario;
    int edad;

    public Veterinario(String nombre, String horario, int edad) {
        this.nombre = nombre;
        this.horario = horario;
        this.edad = edad;
    }

    public void Informacion(){
        System.out.println("\nInformacion del veterinario");
        System.out.println("\nNombre: "+this.nombre+"\nEdad: "+this.edad+"\nHorario: "+this.horario);
    }

    public void Vacuna(Animal arreglo[],int num){
        if(num>0){
            for (int i=0; i<num; i++){
                if (arreglo[i].getVacuna()==false){
                    arreglo[i].setVacuna(true);
                    System.out.println("\nVacunando a "+arreglo[i].getNombre()+"\nYa se termino de vacunar a "+arreglo[i].getNombre());
                }
                else{
                    System.out.println("\n"+arreglo[i].getNombre()+" ya ha sido vacunado anteriormente");
                }
            }
        }
        else{
            System.out.println("\nActualmente no tenemos animales en el Zoo");
        }

    }

    public void Alimentar(Animal arreglo[],int num){
        if(num>0){
            for (int i=0; i<num; i++){
                arreglo[i].setAlimento(true);
                System.out.print("\nAlimentando a "+arreglo[i].getNombre()+"\nYa se termino de alimentar a "+arreglo[i].getNombre()+" con ");
                arreglo[i].Comida();
            }
        }
        else{
            System.out.println("\nActualmente no tenemos animales en el Zoo");
        }
    }

    public void Saludo(){
        System.out.println("\nHola,ahorita mismo estoy ocupado pero gracias por pasar a saludar");
    }
}
