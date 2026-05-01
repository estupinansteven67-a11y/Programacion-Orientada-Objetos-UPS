package uni1a;
import com.ups.poo.Temporada;

public class SerieDeTV extends ContenidoAudiovisual {
    private Temporada temporada; // Relación de Agregación con la clase Temporada

    // El constructor debe recibir 4 parámetros para que la línea 19 de la prueba funcione
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, Temporada temporada) {
        super(titulo, duracionEnMinutos, genero); // Pasamos los datos a ContenidoAudiovisual
        this.temporada = temporada;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        if (temporada != null) {
        	System.out.println("Temporada: " + temporada.getNumero() + " (Episodios: " + temporada.getEpisodios() + ")");
        }
    }
}