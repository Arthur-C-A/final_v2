import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario();
        inventario.agregarDispositivo(new Smartphone(11,4,4,4));
        inventario.agregarDispositivo(new Tablet(15,4,"1920x1080"));
        inventario.agregarDispositivo(new Smartphone(12,4,8,4));
        inventario.agregarDispositivo(new Smartphone(135,4,2,4));
        inventario.agregarDispositivo(new Smartphone(110,4,1,4));
        inventario.agregarDispositivo(new Smartphone(1111,4,0,4));
        inventario.agregarDispositivo(new Smartphone(113,4,0.4,4));
        inventario.agregarDispositivo(new Smartphone(9,12,2.3,4));
        Main.escribirArchivo(inventario);
        inventario.listarNombreDispositivos();
        inventario.getNombresDispositivos();
        inventario.agregarDispositivo(new Smartphone(11,4,4,4));
        inventario.mostrarDispositivo(9999);
    }

    public static void escribirArchivo(Inventario inventario){
        String ruta = "informe_dispositivos.txt";
        String datos = "--- INVENTARIO DISPOSITIVOS ---\n"+inventario.imprimirDatos();
        FileWriter fw = null;
        try{
            fw = new FileWriter(ruta);
            fw.write(datos);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Metodo Finalizado");
        }
    }
}