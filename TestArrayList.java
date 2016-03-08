import java.util.*;

public class TestArrayList {

   public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<String>();
      list.add("this");
      list.add("is");
      list.add("lots");
      list.add("of");
      list.add("fun");
      list.add("for");
      list.add("every");
      list.add("java");
      list.add("programmer");
      
      markLength4(list);
   }
   
   // this method takes in an ArrayList of Strings and then adds a new element
   // of "****" before any words with exactly four characters
   public static void markLength4(ArrayList<String> list) {
      for (int i = 0; i < list.size(); i++) {
         String current = list.get(i);
         if (current.length() == 4) {
            list.add(i, "****");
            i++;    // must add i++ to avoid infinite loop
         }
      }
      System.out.println(list);
   }
}
        
