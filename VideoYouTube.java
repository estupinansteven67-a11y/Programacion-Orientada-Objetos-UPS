package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    private int likes;

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String canal, int likes) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.likes = likes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Video de YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Canal: " + canal);
        System.out.println("Likes: " + likes);
        System.out.println("---------------------------");
    }
}