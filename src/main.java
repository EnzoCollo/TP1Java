package src;
public class main{
    public static void main(String[] args) {
        persona persona1 = new persona("Enzo");
        Pasaporte p = new Pasaporte("AB2420");
        persona1.setPasaporte(p);
        persona1.mostrarPasaporte();
    }
}