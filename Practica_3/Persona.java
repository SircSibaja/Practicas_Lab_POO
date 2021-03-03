import java.util.Scanner;

public class Persona{

    public static void main(String[] args){

        String nombre;
        String apellidoPaterno;
        String apellidoMaterno;
        String fechaNac;
        String sexo;
        String lugarNac;

        System.out.print("Ingresa tu apellido paterno: ");
        Scanner sc = new Scanner(System.in);
        apellidoPaterno = sc.nextLine();
        apellidoPaterno = apellidoPaterno.toUpperCase();

        System.out.print("\nIngresa tu apellido materno: ");
        Scanner sc2 = new Scanner(System.in);
        apellidoMaterno = sc2.nextLine();
        apellidoMaterno = apellidoMaterno.toUpperCase();

        System.out.print("\nIngresa tu nombre(s): ");
        Scanner sc3 = new Scanner(System.in);
        nombre = sc3.nextLine();
        nombre = nombre.toUpperCase();

        System.out.print("\nIngresa fecha de nacimiento en AA/MM/DD: ");
        Scanner sc4 = new Scanner(System.in);
        fechaNac= sc4.nextLine();

        System.out.print("\nIngresa tu sexo: ");
        Scanner sc5 = new Scanner(System.in);
        sexo = sc5.nextLine();
        sexo = sexo.toUpperCase();

        System.out.print("\nIngresa Entidad federativa de nacimiento abreviada de acuerdo con la siguiente tabla: ");
        System.out.println("\nAGUASCALIENTES AS\tBAJA CALIFORNIA BC\tBAJA CALIFORNIA SUR BS\tCAMPECHE CC\tCOAHUILA CL\nCOLIMA CM\tCHIAPAS CS\tCHIHUAHUA CH\t"+
        "DISTRITO FEDERAL DF\tDURANGO DG\nGUANAJUATO GT\tGUERRERO GR\tHIDALGO HG\tJALISCO JC\tMÉXICO MC\nMICHOACÁN MN\tMORELOS MS\tNAYARIT NT\tNUEVO LEÓN NL\tOAXACA OC\n"+
        "PUEBLA PL\tQUERÉTARO QT\tQUINTANA ROO QR\tSAN LUIS POTOSÍ SP\tSINALOA SL\nSONORA SR\tTABASCO TC\tTAMAULIPAS TS\tTLAXCALA TL\tVERACRUZ VZ\nYUCATÁN YN\tZACATECAS ZS\tNACIDO EN EL EXTRANJERO NE\n");
        Scanner sc6 = new Scanner(System.in);
        lugarNac = sc6.nextLine();
        lugarNac = lugarNac.toUpperCase();


        Calcular Curp = new Calcular();
        Calcular Rfc = new Calcular();
        Calcular CyF = new Calcular();

        System.out.println("\nQue desea calcular\n[1] CURP\n[2] RFC\n[3] Ambos\n");
        Scanner sc7 = new Scanner(System.in);
        int opc = sc7.nextInt();

        switch(opc){
            case 1:
            Curp.CalcularCurp(apellidoPaterno, apellidoMaterno, nombre, fechaNac, sexo, lugarNac);
            break;
            case 2:
            Rfc.CalcularRFC(apellidoPaterno, apellidoMaterno, nombre, fechaNac);
            break;
            case 3:
            CyF.CalcularAmbos(apellidoPaterno, apellidoMaterno, nombre, fechaNac, sexo, lugarNac);
            break;
        }
        
    }
}