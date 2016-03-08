package vocabulary.comparison;

import java.util.*;
/**
 *
 * @author abritton
 */
public class Chapter11Solution {
    
    public static void main(String[] args) {
        
        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        Scanner input = new Scanner(new File(mobydick.txt));
        while (input.hasNext()) {
            String word = input.next();
            if (wordCount.containsKey(word)) {
                // seen this word before; increase count by 1
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                // never seen this word before
                wordCount.put(word, 1);
            }
        }
        
        Scanner console = new Scanner(System.in);
        System.out.print("Word to search for? ");
        String word = console.next();
        System.out.println("appears " + wordCount.get(word) + " times.");
    }
}
