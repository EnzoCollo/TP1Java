package src;

public class persona {
    private String nombre;
    private Pasaporte pasaporte;
    public persona(String nombre) {
        this.nombre = nombre;
    }
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
    public void mostrarPasaporte(){
        if(pasaporte != null) {
            System.out.println(nombre + ": Pasaporte: " + pasaporte.getnumero());
        } else {
            System.out.println(nombre + "No tiene pasaporte.");
        }
    }
}
