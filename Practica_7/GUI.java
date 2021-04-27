public abstract class GUI {
    int bateria, id;
    String nombre,ultimaAccion;

    
    public GUI(int bateria, int id, String nombre, String ultimaAccion) {
        this.bateria = bateria;
        this.id = id;
        this.nombre = nombre;
        this.ultimaAccion = ultimaAccion;
    }

    public abstract void Informacion();
    
}
