package src.GestionUsuarios;
// Relacion de dependencia en creacion
public class GestorUsuarios {
    public void crearYMostrarUsuario(String nombre){
        Usuario usuario = new Usuario(nombre);
        System.out.println("El usuario creado es: " + usuario.getNombre());
    }
}
