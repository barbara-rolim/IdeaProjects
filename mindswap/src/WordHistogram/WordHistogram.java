package WordHistogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordHistogram implements Iterable<String> {

    private Map<String, Integer> histogram;
    private String word;

    public WordHistogram() {
        this.histogram = new HashMap<>();
    }

    public void analyzeString(String toAnalyse) {
        //limpa o histograma antes de analisar uma nova String
        histogram.clear();

        //dividi em palavras e mapeia cada palavra para sua frequencia
        String[] words = toAnalyse.toLowerCase().split("\\s+");
        for (String word : words) {
            //remove pontuacao
            word = word.replaceAll("[^a-zA-Z]", "");

            //atualiza a frequencia no histograma
            histogram.put(word, histogram.getOrDefault(word, 0) + 1);
        }
    }

    public int get(String word) {
        return histogram.getOrDefault(word, 0);
    }

    @Override
    public Iterator<String> iterator() {
        return histogram.keySet().iterator();
    }
}
