public class Pajaro {
    String color, tamaño;

    public Pajaro(String color, String tamaño) {
        this.color = color;
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String Subir(){
        return ("\nEl pajaro se subio a la resortera");
    }

    public String Cargar(){
        return ("\nEl pajaro esta siendo cargador en la resortera");
    }
    
    public String LanzarPajaro(){
        return ("\nEl pajaro fue lanzado");
    }
    

    
}
