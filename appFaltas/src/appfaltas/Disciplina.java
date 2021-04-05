package appfaltas;

public class Disciplina {
    // atributos
    private String nome;
    private int cargaHoraria;

    // construtores
    public Disciplina() {
    }

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    // metodos de acesso
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // metodos gerais
    public int totalDeFaltas() {

        return cargaHoraria * 25 / 100;
    }

}