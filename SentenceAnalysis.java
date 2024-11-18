import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SentenceAnalysis {
    public static void main(String[] args) {
        String sentence = "They used 233 features including 227 stylometric features and six novel social network-specific features like character-based ones numbers of alphabets, uppercase characters, special characters, word-based ones the total number of words, average word length, the number of words with 1 char, syntactic ones numbers of punctuation marks and functional words, the total number of sentences and many others";

        // Разделяем текст на слова, удаляя запятые
        List<String> words = Arrays.stream(sentence.split("[ ,]+"))
                .collect(Collectors.toList());

        // 1) Количество слов, заканчивающихся на "es"
        long countEndingWithEs = words.stream()
                .filter(word -> word.endsWith("es"))
                .count();
        System.out.println("Количество слов, заканчивающихся на 'es': " + countEndingWithEs);

        // 2) Слова упорядоченные по возрастанию длины
        List<String> sortedWords = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Слова, упорядоченные по длине: " + sortedWords);

        // 3) Сумма целых чисел в предложении
        int sumOfNumbers = Arrays.stream(sentence.split("[^0-9]+"))
                .filter(num -> !num.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println("Сумма целых чисел в предложении: " + sumOfNumbers);
    }
}
