import java.util.Random;
import java.util.Scanner;

public class RandomSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = { "Ivan", "Peter", "Steve", "Michell" };
        String[] places = { "Sofia", "Plovdiv", "Varna", "Burgas" };
        String[] verbs = { "eats", "holds", "sees", "plays with", "brings" };
        String[] nouns = { "stones", "cake", "apple", "laptop", "bikes" };
        String[] adverbs = { "slowly", "diligently", "warmly", "sadly", "rapidly" };
        String[] details = { "near the river", "at home", "in the park" };

        System.out.println("Hello, this is your first random-generated sentence: ");
        while (true){
            String randomName = gerRandomWord(names);
            String randomPlace = gerRandomWord(places);
            String randomVerb = gerRandomWord(verbs);
            String randomNoun = gerRandomWord(nouns);
            String randomAdverb = gerRandomWord(adverbs);
            String randomDetail = gerRandomWord(details);

            System.out.printf("%s from %s %s %s %s %s%n", randomName, randomPlace, randomAdverb, randomVerb, randomNoun, randomDetail);
            System.out.println("Click [Enter] to generate a new one");
            if(scanner.nextLine().isEmpty()) continue;
        }
    }
    public static String gerRandomWord (String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }
}