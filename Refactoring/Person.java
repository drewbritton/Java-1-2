public class Person {

    public static final int STUDENT = 0;
    public static final int FACULTY = 1;
    public static final int STAFF = 2;
    
    String name; // person's name
    int type; // is person student, faculty, staff?
    
    public Person( String name, int type ) {
        this.name = name;
        this.type = type;
    }
    
    public String speak() {
        if ( type == STUDENT ) {
            return "Don't have a cow!";
        }
        else if ( type == FACULTY ) {
            return "Do what I mean, not what I say.";
        }
        else if ( type == STAFF ) {
            return "cheese-eating surrender monkeys!";
        }
        else {
            return "huh?";
        }
    }
    
    public String toString() {
        String str = name +":";
        if ( type == STUDENT ) {
            str += "student";
        }
        else if ( type == FACULTY ) {
            str += "faculty";
        }
        else if ( type == STAFF ) {
            str += "staff";
        }
        else {
            str += "TBD";
        }
        return str;
    }
}