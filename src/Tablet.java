public class Tablet extends Dispositivo{

    private String resolucionPantalla;

    public Tablet(int id, int horaAcumulada, String resolucionPantalla) {
        super(id, "Tablet", horaAcumulada);
        this.resolucionPantalla = resolucionPantalla;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }

    //protected String getDatosDispositivo(){

        //return getNombreDispositivo()+"\n"+getId()+"\n"+getHoraAcumulada()+
          //      "\n"+getResolucionPantalla();
    //}

    @Override
    protected String imprimirTipo() {
        return "\nEs un: "+getNombreDispositivo() +"\nID: "+getId()+"\nHora Acumulada: "+getHoraAcumulada()+
                "\nResolucion de Pantalla: "+getResolucionPantalla();
    }

}