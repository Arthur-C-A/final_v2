public class Smartphone extends Dispositivo{

    private double bateria; // en mAh
    private double tamanioPantalla; // en pulgadas

    public Smartphone(int id, int horaAcumulada, double bateria, double tamanioPantalla) {
        super(id, "Smartphone", horaAcumulada); // Hardcodeado por que es un sentido no hacerlo.
        this.bateria = bateria;
        this.tamanioPantalla = tamanioPantalla;
    }

    protected double getBateria() {
        return bateria;
    }

    protected void setBateria(double bateria) {
        this.bateria = bateria;
    }

    protected double getTamanioPantalla() {
        return tamanioPantalla;
    }

    protected void setTamanioPantalla(double tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    @Override
    protected String imprimirTipo() {
        return "\nEs un: "+getNombreDispositivo() +"\nID: "+getId()+"\nHora Acumulada: "+getHoraAcumulada()+
                "\nTamanio de Pantalla: "+getTamanioPantalla()+"\nBateria mAh: "+getBateria()+"\n";
    }
}