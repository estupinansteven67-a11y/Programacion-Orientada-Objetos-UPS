package uni1a;
import com.ups.poo.Investigador; // Importamos tu clase del otro paquete

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador; // <--- Fíjate en la 'i' minúscula

    public Documental(String titulo, int duracion, String genero, String tema, Investigador investigador) {
        super(titulo, duracion, genero);
        this.tema = tema;
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + getId() + ", Título: " + getTitulo());
        System.out.println("Género: " + getGenero() + ", Tema: " + tema);
    }
}