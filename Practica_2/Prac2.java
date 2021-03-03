public class Prac2{
	public static void main (String[] args){
	String nombre; 
	Dog pet1 = new Dog("Enzo",7);
	System.out.println(pet1.getName());
	
	pet1.setName("Nico");
	System.out.println(pet1.getName());
	
	Dog pet2 = new Dog(" ",0);
	
	System.out.println("Captura nombre");
	String entrada;
	nombre = entrada.nextLine();
	pet1.setName(nombre);
	
	system.out.println("Captura edad");
	edad = entrada.nextInt();
	pet1.setAge(edad);
	
	}
	
	
}