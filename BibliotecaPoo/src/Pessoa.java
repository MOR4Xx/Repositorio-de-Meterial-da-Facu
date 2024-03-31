public abstract class Pessoa {
    private String nome;
    private String data_Nasc;
    private long cpf;

    public Pessoa(String nome, String data_Nasc, long cpf) {
        this.nome = nome;
        this.data_Nasc = data_Nasc;
        this.cpf = cpf;
    }

    public String getData_Nasc() {
        return data_Nasc;
    }

    public void setData_Nasc(String data_Nasc) {
        this.data_Nasc = data_Nasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }


}