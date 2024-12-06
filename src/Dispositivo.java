public abstract class Dispositivo {

    private int id;
    private String nombreDispositivo;
    private int horaAcumulada;

    public Dispositivo(int id, String nombreDispositivo, int horaAcumulada) {
        this.id = id;
        this.nombreDispositivo = nombreDispositivo;
        this.horaAcumulada = horaAcumulada;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getNombreDispositivo() {
        return nombreDispositivo;
    }

    protected void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    protected int getHoraAcumulada() {
        return horaAcumulada;
    }

    protected void setHoraAcumulada(int horaAcumulada) {
        this.horaAcumulada = horaAcumulada;
    }

    protected abstract String imprimirTipo();
}