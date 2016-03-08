package programming.assign04;

/**
 *
 * @author abritton
 */
public class Document {
    private String text;
    
    // constructor method
    public Document(String text) {
        this.text = text;
    }
    
    // no-arg constructor
    public Document() {
        this.text = "This space intentionally left blank.";
    }
    
    // mutator method
    public void setText(String str) {
        text = str;
    }
    
    // accessor method
    public int size() {
        return text.length();
    }
    
    // toString method
    @Override
    public String toString() {
        return "Contents: " + text;
    }
}
