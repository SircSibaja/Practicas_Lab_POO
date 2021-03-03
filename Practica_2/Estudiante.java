public class Estudiante {
    String nombre;
    String id;
    String materia;
    int cali;
    String estado;

    public Estudiante(String nombre, String id, String materia, int cali){
        this.nombre = nombre;
        this.id = id;
        this.materia = materia;
        this.cali = cali;
    }

    public String getNombre(){
        return nombre;
    }

    public String getId(){
        return id;
    }

    public String getMateria(){
        return materia;
    }

    public int getCali(){
        return cali;
    }
    public void Estado(){
        if(cali>=60){
            System.out.println("Estado: Aprobado");
        }
        else{
            System.out.println("Estado: Reprobado");
        }
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }
    public void setCalificacion(int cali){
        this.cali = cali;
    }
    
}
