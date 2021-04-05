public class Elefante extends Animal{

    public Elefante(String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
    }

    @Override
    public void mostrarnombre(int i){
        System.out.println("["+(i+1)+"] "+ getNombre()+" el elefante");
    }
    
    @Override
    public void Comida(){
        System.out.println("fruta");
    }
}
