import java.util.Scanner;

public class Practica2 {
    
    public static void main(String[] args){
        
        Estudiante datos1 = new Estudiante("Pepe", "123", "Matematicas", 59 );

        System.out.println("\nEstos son los datos del estudiante 1: \n");
        System.out.println("Nombre: "+datos1.getNombre());
        System.out.println("Identificacion: " +datos1.getId());
        System.out.println("Materia: "+datos1.getMateria());
        System.out.println("Calificacion: "+datos1.getCali());
        datos1.Estado();

        Estudiante datos2 = new Estudiante("Erika", "124", "Ciencias", 89 );

        System.out.println("\nEstos son los datos del estudiante 2: \n");
        System.out.println("Nombre: "+datos2.getNombre());
        System.out.println("Identificacion: " +datos2.getId());
        System.out.println("Materia: "+datos2.getMateria());
        System.out.println("Calificacion: "+datos2.getCali());
        datos2.Estado();

        Estudiante datos3 = new Estudiante("David", "125", "Calculo", 99 );

        System.out.println("\nEstos son los datos del estudiante 3: \n");
        System.out.println("Nombre: "+datos3.getNombre());
        System.out.println("Identificacion: " +datos3.getId());
        System.out.println("Materia: "+datos3.getMateria());
        System.out.println("Calificacion: "+datos3.getCali());
        datos3.Estado();

        Estudiante datos4 = new Estudiante("Max", "126", "Historia", 39 );

        System.out.println("\nEstos son los datos del estudiante 4: \n");
        System.out.println("Nombre: "+datos4.getNombre());
        System.out.println("Identificacion: " +datos4.getId());
        System.out.println("Materia: "+datos4.getMateria());
        System.out.println("Calificacion: "+datos4.getCali());
        datos4.Estado();

        Estudiante datos5 = new Estudiante("Cesar", "127", "Fisica", 71 );

        System.out.println("\nEstos son los datos del estudiante 5: \n");
        System.out.println("Nombre: "+datos5.getNombre());
        System.out.println("Identificacion: " +datos5.getId());
        System.out.println("Materia: "+datos5.getMateria());
        System.out.println("Calificacion: "+datos5.getCali());
        datos5.Estado();

        Estudiante datos = new Estudiante("", "", "", 0);
        String nombre;
        String id;
        String materia;
        int cali;
        
        for(int i=0;i<5;i++){
            System.out.println("\nIngrese un nombre: ");
            Scanner sc = new Scanner(System.in);
            nombre = sc.nextLine();

            System.out.println("Ingrese una id: ");
            Scanner sc1 = new Scanner(System.in);
            id = sc1.nextLine();

            System.out.println("Ingrese una materia: ");
            Scanner sc2 = new Scanner(System.in);
            materia = sc2.nextLine();

            System.out.println("Ingrese una calificacion: ");
            Scanner sc3 = new Scanner(System.in);
            cali = sc3.nextInt();

            datos.setNombre(nombre);
            datos.setId(id);
            datos.setMateria(materia);
            datos.setCalificacion(cali);
            
            System.out.println("\nEstos son los datos del estudiante "+(i+6)+": \n");
            System.out.println("Nombre: "+datos.getNombre());
            System.out.println("Identificacion: " +datos.getId());
            System.out.println("Materia: "+datos.getMateria());
            System.out.println("Calificacion: "+datos.getCali());
            datos.Estado();
        }

    }
}


