public class AreaConhecimento {
    private long id;
    private String titulo;

    public AreaConhecimento(long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
