public class Guardar {

    String nombre;
    float calificacion[];

    public void Datos(){
        nombre = CapturarDatos.CapturarNombre();
        calificacion = CapturarDatos.CapturarCalificacion();
    }

    public void setCalificacion(float[] calificacion){
        this.calificacion = calificacion;
    }

    public float[] getCalificacion(){
        return calificacion;
    }

}
