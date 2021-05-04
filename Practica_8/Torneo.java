public class Torneo{

    private String nombreTorneo;
    private String region;
    private int numEquipos;
    private int partidosJugados;
    private int partidosPendientes;
    private Equipo[] equipo;


    public void DatosEquipo(int numEquipos){
        equipo = new Equipo[numEquipos];

        for(int i=0; i<equipo.length; i++){
            System.out.println("\nIngrese los datos de equipo "+(i+1));
            equipo[i] = new Equipo();
            equipo[i].setNombreEquipo(CapturaEntrada.capturarString("Nombre del equipo"));
            equipo[i].setDivision(CapturaEntrada.capturarString("Division del equipo"));
            equipo[i].setNombreEntrenador(CapturaEntrada.capturarString("Nombre del entrenador"));
            equipo[i].setTorneosParticipacion(CapturaEntrada.capturarEntero("Numero de torneos en los que participo el equipo"));
            equipo[i].setTorneosGanados(CapturaEntrada.capturarEntero("Numero de torneos ganados"));
            equipo[i].setTorneosPerdidos(CapturaEntrada.capturarEntero("Numero de torneos perdidos"));
            equipo[i].setNumJugadores(CapturaEntrada.capturarEntero("Numero de jugadores de su equipo"));
            equipo[i].DatosJugador(equipo[i].getNumJugadores());
        }
    }

    public void MostrarDatosE(){
        for(int i=0; i<equipo.length; i++){
            System.out.println("\nNombre del equipo: "+equipo[i].getNombreEquipo()+"\nDivision: "+equipo[i].getDivision());
            equipo[i].MostrarDatosJ();
        }
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosPendientes() {
        return partidosPendientes;
    }

    public void setPartidosPendientes(int partidosPendientes) {
        this.partidosPendientes = partidosPendientes;
    }

    public Equipo[] getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo[] equipo) {
        this.equipo = equipo;
    }

}
