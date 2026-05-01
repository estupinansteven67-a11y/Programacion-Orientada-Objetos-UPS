package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String productora;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String productora) {
        super(titulo, duracionEnMinutos, genero);
        this.productora = productora;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Productora: " + productora);
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("---------------------------");
    }
}