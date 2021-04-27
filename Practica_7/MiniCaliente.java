public class MiniCaliente extends GUI implements Caliente{

    public MiniCaliente(int bateria, int id, String nombre, String ultimaAccion) {
        super(bateria, id, nombre, ultimaAccion);
    }
    
    public void Informacion(){
        System.out.println("\nNombre del robot: "+nombre+"\nIdentificacion: "+id+"\nNivel de bateria: "+bateria+"%"+"\nUltima accion realizada: "+ultimaAccion);
    }

    public boolean CocinarPlatillo(boolean cocinar, boolean ingredientes){
        if(ingredientes==false){
            System.out.println("\nError: Primero se deben preparar los ingredientes");
        }
        else{
            if (cocinar==false){
                System.out.println("\nEl platillo se esta cocinando...\nSe ha terminado de cocinar el platillo");
                cocinar=true;
                bateria=bateria-25;
                ultimaAccion = "Cocinar el platillo";
            }
            else{
                System.out.println("\nEl platillo ya fue cocinado anteriormente");
            }
        }
        return cocinar;
    }
}
