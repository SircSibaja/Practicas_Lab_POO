public class Azul extends Pajaro {
    String dividirse;

    public Azul(String color, String tamaño) {
        super(color, tamaño);
    }

    public String Dividirse(){
        dividirse = "El pajaro se dividio en 3";
        return dividirse;
    }
}
