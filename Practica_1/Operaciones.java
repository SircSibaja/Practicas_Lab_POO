public class Operaciones extends Guardar{

    public void ImprimirCalificaciones(){
        System.out.println("\nEsta es la lista de las calificaciones: ");
        for (int i=0; i< calificacion.length; i++){
            System.out.println("Calificacion "+(i+1)+": "+ this.calificacion[i]+"");
        }
        System.out.println("\n");
    }
    public void CalcularPromedio(){
        float promedio=0;
        for (int i=0; i<calificacion.length; i++){
            promedio += this.calificacion[i];
        }
        promedio /= calificacion.length;
        System.out.println("\nEl promedio de las calificaciones es: "+promedio+"\n"); 
    }
    public void CalcularMenor(){
        float x=this.calificacion[0];
        for (int i=1; i<calificacion.length; i++){
            if(this.calificacion[i]<x){
                x=this.calificacion[i];
            }
        }
        System.out.println("\nLa calificacion mas baja es: "+x+"\n");
    }
    public void CalcularMayor(){
        float x=this.calificacion[0];
        for (int i=1; i<calificacion.length; i++){
            if(this.calificacion[i]>x){
                x=this.calificacion[i];
            }
        }
        System.out.println("\nLa calificacion mas alta es: "+x+"\n");
    }


}