public class Laptop extends Dispositivo{

    private int ram;
    private int almacenamiento;

    public Laptop(int id, int horaAcumulada, int ram, int almacenamiento) {
        super(id, "Laptop", horaAcumulada);
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    protected String imprimirTipo() {
        return "\nEs un: "+getNombreDispositivo() +"\nID: "+getId()+"\nHora Acumulada: "+getHoraAcumulada()+
                "\nMemoria RAM: "+getRam() +"\nGB de almacenamiento: "+getAlmacenamiento()+"\n";
    }
}