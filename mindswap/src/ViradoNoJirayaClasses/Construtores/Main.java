package ViradoNoJirayaClasses.Construtores;

public class Main {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", 12, "Desenho");
        System.out.println(anime.getNome());
        System.out.println(anime.getEpisodios());
        System.out.println(anime.getGenero());
    }
}
