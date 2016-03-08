// Chapter 12
// Permutations Revisited (slide 43)

public class Permutations {

    public static int count = 0;
    
    public static void main(String[] args) {
        String str = "DREW";
        
        printAllPermutations(str);
    }
    
    public static void printAllPermutations(String str) {
        printAllPermutations("", str);
    }
    
    private static void printAllPermutations(String temp, String str) {
        if (str.length() == 0) {
            System.out.println(++count + ": " + temp);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String a = temp + str.charAt(i);
                String b = str.substring(0, i)
                         + str.substring(i + 1);
                printAllPermutations(a, b);
            }
            /*
            for (int i = 0; i < str.length(); i++) {
                temp += str.charAt(i);
                str = str.substring(0, i);
            }  */
            
            for (int i = 0; i < str.length(); i++) {
                temp += str.charAt(i);
                str = str.substring(0, i)
                    + str.substring(i + 1);
                printAllPermutations(temp, str);
                str = str.substring(0, i)
                    + temp.charAt(temp.length()
        
        }
    }
}