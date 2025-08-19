package src.asignaturas;
import java.util.List;
import java.util.ArrayList;

public class Profesor {
    private String nombreProfe;
    private List cursos = new ArrayList<>();
    public Profesor(String nombreProfe) {
        this.nombreProfe = nombreProfe;
    }
    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }
    public void eliminarCurso(Curso curso){
        cursos.remove(curso);
    }
    public List getCursos() {
        return cursos;
    }
    public void mostrarCursos() {
        if(cursos.isEmpty()) {
            System.out.println(nombreProfe + " no tiene cursos asignados.");
        } else {
            System.out.println(nombreProfe + " tiene los siguientes cursos:");
            for(Object curso : cursos) {
                System.out.println(((Curso) curso).getNombre());
            }
        }
    }
}
