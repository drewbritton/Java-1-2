package programming.assign04;

/**
 *
 * @author abritton
 */
public class File extends Document {
    private String format;
    
    // constructor with 2 parameters
    public File(String format, String text) {
        super(text);
        this.format = format;
    }
    
    // constructor with 1 parameter
    public File(String format) {
        super();
        this.format = format;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Format: " + format + ", " + super.toString();
    }
}

