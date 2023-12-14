package WordHistogram;

public class Main {
    WordHistogram wordHistogram = new WordHistogram();

    public static void main(String[] args) {
        WordHistogram wordHistogram = new WordHistogram();
        wordHistogram.analyzeString("This is a sample sentence. This sentence is just for testing.");

        // Exemplo de uso do método iterator
        System.out.println("Palavras no histograma:");
        for (String word : wordHistogram) {
            System.out.println(word);
        }

        // Exemplo de uso do método get
        System.out.println("\nFrequência da palavra 'this': " + wordHistogram.get("this"));
        System.out.println("Frequência da palavra 'sentence': " + wordHistogram.get("sentence"));
    }
}
