package uni1a;

// Importamos las clases que están en el otro paquete (según tu imagen)
import com.ups.poo.Actor;
import com.ups.poo.Temporada;
import com.ups.poo.Investigador;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE GESTIÓN AUDIOVISUAL - ETAPA 5");
        System.out.println("----------------------------------------");

        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        // Objetos originales
        contenidos[0] = new Pelicula("Avatar", 162, "Ciencia Ficción", "James Cameron", new Actor("Zoe Saldaña"));
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasía", new Temporada(1, 10));
        contenidos[2] = new Documental("Cosmos", 45, "Ciencia", "Astronomía", new Investigador("Neil deGrasse Tyson"));
        
        // Tus expansiones (Etapa 4)
        contenidos[3] = new VideoYouTube("Mantenimiento IGM Snake", 12, "Tutorial", "Neblina Custom Riders", 500);
        contenidos[4] = new Cortometraje("Puyo de Noche", 8, "Documental Corto", "Amazonas Films");

        for (ContenidoAudiovisual c : contenidos) {
            if (c != null) {
                c.mostrarDetalles();
                System.out.println("---------------------------");
            }
        }
    }
}