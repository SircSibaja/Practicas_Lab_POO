public class Pajaro extends Animal {

    public Pajaro(String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
    }
    
    @Override
    public void mostrarnombre(int i){
        System.out.println("["+(i+1)+"] "+ getNombre()+" el pajaro");
    }

    @Override
    public void Comida(){
        System.out.println("Semillas");
    }
}
