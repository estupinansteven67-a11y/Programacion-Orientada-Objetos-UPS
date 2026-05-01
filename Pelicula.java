package uni1a;
import com.ups.poo.Actor;

public class Pelicula extends ContenidoAudiovisual {
    private String director;
    private Actor actor;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String director, Actor actor) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.actor = actor;
    } // Aquí termina el constructor

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Película:");
        System.out.println("ID: " + getId() + ", Título: " + getTitulo());
        System.out.println("Director: " + director + ", Actor: " + (actor != null ? actor.getNombre() : "N/A"));
    }
} // Aquí cierra la clase