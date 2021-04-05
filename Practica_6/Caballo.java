public class Caballo extends Animal{

    public Caballo(String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
    }
    
    @Override
    public void mostrarnombre(int i){
        System.out.println("["+(i+1)+"] "+ getNombre()+" el caballo");
    }
    @Override
    public void Comida(){
        System.out.println("heno");
    }
}
