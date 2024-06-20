import java.util.*;

public class UniqueWords {
    private String[] words;

    public UniqueWords(String[] words) {
        this.words = words;
    }

    public Set<String> getUniqueWords() {
        return new HashSet<>(Arrays.asList(words));
    }

    public Map<String, Integer> getWordCount() {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
}
