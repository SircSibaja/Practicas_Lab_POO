public class Calcular {
    
    public void CalcularCurp(String apellidoPaterno,  String apellidoMaterno, String nombre, String fechaNac, String sexo, String lugarNac){

        int x=0;
        String Curp = new String();
        Curp +=apellidoPaterno.charAt(0);
        for(int i=1; i < apellidoPaterno.length(); i++){
            if(x!=1){
                if(Vocal(apellidoPaterno.charAt(i))){ 
                    Curp+=apellidoPaterno.charAt(i);
                    x=1;
                }
            }
        }
        Curp +=""+apellidoMaterno.charAt(0)+ nombre.charAt(0)+ fechaNac.charAt(0) +fechaNac.charAt(1)+fechaNac.charAt(3)+fechaNac.charAt(4)+fechaNac.charAt(6)+fechaNac.charAt(7)+sexo.charAt(0)+lugarNac;
        
        x=0;
        for(int i=1; i < apellidoPaterno.length(); i++){
            if(x!=1){
                if(Consonante(apellidoPaterno.charAt(i))){ 
                    Curp+=apellidoPaterno.charAt(i);
                    x=1;
                }
            }
        }
        x=0;
        for(int i=1; i < apellidoMaterno.length(); i++){
            if(x!=1){
                if(Consonante(apellidoMaterno.charAt(i))){ 
                    Curp+=apellidoMaterno.charAt(i);
                    x=1;
                }
            }
        }
        x=0;
        for(int i=1; i < nombre.length(); i++){
            if(x!=1){
                if(Consonante(nombre.charAt(i))){ 
                    Curp+=nombre.charAt(i);
                    x=1;
                }
            }
        }
        int numero1 = (int)(Math.random()*10);
        int numero2 = (int)(Math.random()*10);
        Curp +=""+numero1+numero2;

        System.out.println("\nSu CURP es: "+Curp+"\n");

    }

    public void CalcularRFC(String apellidoPaterno,  String apellidoMaterno, String nombre, String fechaNac){
        int x=0;
        String Rfc = new String();
        Rfc +=apellidoPaterno.charAt(0);
        for(int i=1; i < apellidoPaterno.length(); i++){
            if(x!=1){
                if(Vocal(apellidoPaterno.charAt(i))){ 
                    Rfc+=apellidoPaterno.charAt(i);
                    x=1;
                }
            }
        }
        int n1 = (int)(Math.random()*10);
        int n2 = (int)(Math.random()*10);
        int n3 = (int)(Math.random()*10);
        Rfc +=""+apellidoMaterno.charAt(0)+ nombre.charAt(0)+ fechaNac.charAt(0) +fechaNac.charAt(1)+fechaNac.charAt(3)+fechaNac.charAt(4)+fechaNac.charAt(6)+fechaNac.charAt(7)+n1+n2+n3;
        System.out.println("\nSu RFC es: "+Rfc+"\n");
    }
    
    public void CalcularAmbos(String apellidoPaterno,  String apellidoMaterno, String nombre, String fechaNac, String sexo, String lugarNac){
        CalcularCurp(apellidoPaterno, apellidoMaterno, nombre, fechaNac, sexo, lugarNac);
        CalcularRFC(apellidoPaterno, apellidoMaterno, nombre, fechaNac);
    }
    
    public static boolean Vocal(char c){
        if(c=='A' || c=='E' || c=='I' || c=='O' || c =='U'){
            return true;
        }else{
            return false;
        }
    }
    public static boolean Consonante(char c){
        if(c=='A' || c=='E' || c=='I' || c=='O' || c =='U'){
            return false;
        }else{
            return true;
        }
    }
}
