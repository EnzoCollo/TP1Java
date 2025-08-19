package src;
public class main{
    public static void main(String[] args) {
        persona persona1 = new persona("Enzo");
        Pasaporte p = new Pasaporte("ABC123");
        persona1.setPasaporte(p);
        persona1.mostrarPasaporte();
    }
}