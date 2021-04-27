public class MiniCuchillos extends GUI implements Cuchillos {
    
    public MiniCuchillos(int bateria, int id, String nombre, String ultimaAccion) {
        super(bateria, id, nombre, ultimaAccion);
    }
    
    public void Informacion(){
        System.out.println("\nNombre del robot: "+nombre+"\nIdentificacion: "+id+"\nNivel de bateria: "+bateria+"%"+"\nUltima accion realizada: "+ultimaAccion);
    }

    public boolean PreparaIngredientes(boolean ingredientes){
        if(ingredientes==false){
            System.out.println("\nLos ingredientes se estan preparando...\nSe han terminado de preparar los ingredientes");
            ingredientes=true;
            bateria=bateria-25;
            ultimaAccion = "Preparar los ingredientes";
        }
        else{
            System.out.println("\nLos ingredientes ya han sido preparados anteriormente");
        }
        return ingredientes;
    }
}
