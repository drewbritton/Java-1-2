package programming.assign04;

/**
 *
 * @author abritton
 */
public class Email extends Document {
    private String sender;
    private String recipient;
    private String subject;
    
    // constructor with 4 parameters
    public Email(String sender, String recipient, String subject, String text) {
        super(text);
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
    }
    
    // constructor with 3 parameters
    public Email(String sender, String recipient, String subject) {
        super();
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
    }
    
    // toString method
    @Override
    public String toString() {
        return "From: " + sender + ", To: " + recipient +
                ", Subject: " + subject + "\n" + super.toString();
    }
}
