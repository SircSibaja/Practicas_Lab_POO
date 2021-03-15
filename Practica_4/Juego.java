public class Juego {
    public static void main(String[] args){

        Pajaro[] pajaros = new Pajaro[]{new Pajaro("Rojo","Mediano"), new Pajaro("Blanco","Grande"),new Pajaro("Rosa","Mediano")};
        for(int i=0; i<pajaros.length; i++){
            System.out.println("\nColor: "+pajaros[i].getColor()+"\nTamaño: "+pajaros[i].getTamaño()+pajaros[i].Subir()+pajaros[i].Cargar()+pajaros[i].LanzarPajaro());
        }

        Amarillo p1 = new Amarillo("Amarillo", "Mediano");
        Azul p2 = new Azul("Azul", "Chico");
        Negro p3 = new Negro("Negro", "Grande");

        System.out.println("\nColor: "+p1.getColor()+"\nTamaño: "+p1.getTamaño()+p1.Subir()+p1.Cargar()+p1.LanzarPajaro()+"\nHabilidad activada: "+p1.Velocidad());
        System.out.println("\nColor: "+p2.getColor()+"\nTamaño: "+p2.getTamaño()+p2.Subir()+p2.Cargar()+p2.LanzarPajaro()+"\nHabilidad activada: "+p2.Dividirse());
        System.out.println("\nColor: "+p3.getColor()+"\nTamaño: "+p3.getTamaño()+p3.Subir()+p3.Cargar()+p3.LanzarPajaro()+"\nHabilidad activada: "+p3.Explotar());

    }
}
