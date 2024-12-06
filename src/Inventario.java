import java.util.ArrayList;

public class Inventario {

    private ArrayList<Dispositivo> listaDispositivos;
    private ArrayList<String> nombresDispositivos;
    // Inicializamos los arrays en el constructor.
    public Inventario() {
        listaDispositivos = new ArrayList();
        nombresDispositivos = new ArrayList();
    }

    public ArrayList<Dispositivo> getListaDispositivos() {
        return listaDispositivos;
    }

    public void setListaDispositivos(ArrayList<Dispositivo> listaDispositivos) {
        this.listaDispositivos = listaDispositivos;
    }

    public ArrayList getNombresDispositivos() {
        return nombresDispositivos;
    }

    public void setNombresDispositivos( String nombre) {
        nombresDispositivos.add(nombre);
    }

    protected String imprimirDatos() {
        String datosDispositivo = "\n";

        for (Dispositivo dispositivo : listaDispositivos) {
            datosDispositivo+=dispositivo.imprimirTipo();
        }
        System.out.println(datosDispositivo);
        return datosDispositivo;
    }

    protected void agregarDispositivo(Dispositivo dispositivo) {

        for (Dispositivo dispositivo2 : listaDispositivos) {
            if(dispositivo2.getId() == dispositivo.getId()) {
                throw new DispositivoDuplicadoException("[ERROR] EL ID YA ESTA ASIGNADO A OTRO DISPOSITIVO");
            }
        }
        listaDispositivos.add(dispositivo);
    }

    protected int getUsoDispositivos(){
        int horas = 0;
        for(Dispositivo d: listaDispositivos){
            horas+= d.getHoraAcumulada();
        }
        return horas;
    }

    protected void listarNombreDispositivos() {
        // Limpiar la lista antes de llenarla
        nombresDispositivos.clear();

        for (Dispositivo d : listaDispositivos) {
            nombresDispositivos.add(d.getNombreDispositivo());
        }
    }


    protected boolean mostrarDispositivo(int idDispositivo){
         int indice = 0;
         int cont = 0;
         boolean existeDispositivo = false;
        for(Dispositivo d: listaDispositivos){
            if (d.getId() == idDispositivo){
                indice = cont;
                existeDispositivo = true;
            }
            cont +=1;
        }
        if (existeDispositivo){
            System.out.println("\n[Dispositivo encontrado]\n");
            System.out.println(listaDispositivos.get(indice).imprimirTipo());
        }else{
            throw new DispositivoNoEncontradoException("[ERROR] ID inexistente");
        }

        return existeDispositivo;

    }



}