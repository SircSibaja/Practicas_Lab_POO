public class P8 {

    public static void main(String [] args){
        Torneo torneo = new Torneo();
        int opc,x=0;
        

        System.out.println("Bienvenido al programa\nAqui podra registrar los datos sobre sus torneos, equipos y jugadores");
        do{
            System.out.println("\n[1] Ingresar datos del torneo, equipo y jugadores\n[2] Mostrar datos de los torneos\n[3] Salir");
            switch(opc=CapturaEntrada.capturarEntero("Seleccione una opcion")){
                case 1:
                    System.out.println("\nIngrese los datos del Torneo");
                    torneo.setNombreTorneo(CapturaEntrada.capturarString("Nombre del torneo"));
                    torneo.setRegion(CapturaEntrada.capturarString("Region del torneo"));
                    torneo.setNumEquipos(CapturaEntrada.capturarEntero("Equipos participantes"));
                    torneo.setPartidosJugados(CapturaEntrada.capturarEntero("Partidos jugados"));
                    torneo.setPartidosPendientes(CapturaEntrada.capturarEntero("Partidos pendientes"));
                    torneo.DatosEquipo(torneo.getNumEquipos());
                    x=1;
                break;

                case 2:
                    if(x==1){
                        System.out.println("\nEstos son los datos del torneo:\n\nNombre: "+torneo.getNombreTorneo()+"\nRegion: "+torneo.getRegion()+"\nNumero de equipos participantes: "
                        +torneo.getNumEquipos()+"\nPartidos jugados: "+torneo.getPartidosJugados()+"\nPartidos pendientes: "+torneo.getPartidosPendientes());
                        torneo.MostrarDatosE();
                    }
                    else{
                        System.out.println("\nPrimero debe registar los datos del torneo");
                    }
                break;

                case 3:
                    System.out.println("\nSaliendo...");
                break;

                default:
                    System.out.println("\nError: Opcion no valida");
            }
        }while(opc!=3);
    }
}
        