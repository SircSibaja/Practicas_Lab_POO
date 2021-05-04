public class Equipo{

    private String nombreEquipo;
    private String division;
    private String nombreEntrenador;
    private int torneosParticipacion;
    private int torneosGanados;
    private int torneosPerdidos;
    private int numJugadores;
    private Jugador[] jugador;

    public void DatosJugador(int numJugadores){
        jugador = new Jugador[numJugadores];
        int x;

        for(int i=0; i<jugador.length; i++){
            System.out.println("\nIngrese los datos del jugador "+(i+1));
            jugador[i]= new Jugador();
            System.out.println("\nJugador "+(i+1));
            jugador[i].setNombre(CapturaEntrada.capturarString("Nombre del jugador"));
            jugador[i].setEstatura(CapturaEntrada.capturarDouble("Esatura del jugador"));
            jugador[i].setPosicion(CapturaEntrada.capturarString("Posicion del jugador"));
            if(i==0){
                x=1;
            }
            else{
                x=0;
            }
            do{
                jugador[i].setNumUniforme(CapturaEntrada.capturarEntero("Numero de uniforme"));
                for(int j=0; j<i; j++){
                    if(jugador[i].getNumUniforme()==jugador[j].getNumUniforme()){
                        System.out.println("\nEse numero de uniforme ya esta ocupado, escoja otro");
                    }
                    else{
                        x=1;
                    }
                }
            }while(x!=1);
            jugador[i].setPuntosAnotados(CapturaEntrada.capturarEntero("Total de puntos anotados"));
        }
    }

    public void MostrarDatosJ(){
        for(int i=0; i<jugador.length; i++)
        System.out.println("\nJugador "+(i+1)+"\nNombre: "+jugador[i].getNombre()+"\nNummero de uniforme: "+jugador[i].getNumUniforme());
        System.out.println("\nTotal de jugadores registrados: "+JugadoresRegistrados(jugador));
        System.out.println("Suma Total de puntos anotados por el equipo: "+SumaDePuntos(jugador));

    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public int getTorneosParticipacion() {
        return torneosParticipacion;
    }

    public void setTorneosParticipacion(int torneosParticipacion) {
        this.torneosParticipacion = torneosParticipacion;
    }

    public int getTorneosGanados() {
        return torneosGanados;
    }

    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;
    }

    public int getTorneosPerdidos() {
        return torneosPerdidos;
    }

    public void setTorneosPerdidos(int torneosPerdidos) {
        this.torneosPerdidos = torneosPerdidos;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public Jugador[] getJugador() {
        return jugador;
    }

    public void setJugador(Jugador[] jugador) {
        this.jugador = jugador;
    }

    public int JugadoresRegistrados(Jugador[] jugador){
        int registrados;
        registrados=jugador.length;
        return registrados;
    }
    public int SumaDePuntos(Jugador[] jugador){
        int puntos=0;
        for (int  i=0; i<jugador.length; i++){
            puntos=puntos+jugador[i].getPuntosAnotados();
        }
        return puntos;
    }
}