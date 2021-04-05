public class Oso extends Animal{

    public Oso(String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
    }
    
    @Override
    public void mostrarnombre(int i){
        System.out.println("["+(i+1)+"] "+ getNombre()+" el oso");
    }

    @Override
    public void Comida(){
        System.out.println("bayas");
    }
    
}
