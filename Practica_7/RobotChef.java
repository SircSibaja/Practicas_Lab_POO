public class RobotChef extends GUI implements Cuchillos, Caliente {

    public RobotChef(int bateria, int id, String nombre, String ultimaAccion) {
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

    public boolean Servir(boolean cocinar, boolean ingredientes, boolean servir){
        if(ingredientes==true && cocinar==true){
            System.out.println("\nSe ha servido el platillo\n¡Hurra! El plato estaba delicioso");
            bateria=bateria-25;
            ultimaAccion = "Servir el plato";
            servir=true;
        }
        if(ingredientes==false){
            System.out.println("\nError: No se puede servir el platillo ya que aun no se han preparado los ingredientes");
        }
        else{
            if (cocinar==false){
                System.out.println("\nError: No se puede servir el platillo ya que aun no se ha cocinado el platillo");
            }
        }
        return servir;  
    }   
}
