package Models;

public class Faculdade {
    private long cod;
    private String nome;
    private String estado;
    private String cidade;

    public Faculdade(long cod, String nome, String estado, String cidade) {
        this.cod = cod;
        this.nome = nome;
        this.estado = estado;
        this.cidade = cidade;

    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
