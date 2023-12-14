package ViradoNoJirayaClasses.Construtores;

public class Anime {
    private String nome;
    private int episodios;
    private String genero;

    public Anime(String nome, int episodios, String genero){
        this.nome = nome;
        this.episodios = episodios;
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getGenero() {
        return genero;
    }
}
