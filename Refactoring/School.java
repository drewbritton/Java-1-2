public class School {
    private static final int NUM_PEOPLE = 100;

    private Person[] people; // all the people in the school
    private int numPeople; // number of people in the school
    private int nextPerson; // iterator for people
    
    public School() {
        people = new Person[ NUM_PEOPLE ];
        numPeople = 0;
        nextPerson = 0;
    }
    public void addPerson( Person p ) {
        people[ numPeople++ ] = p;
    }
    public String toString() {
        String str = "";
        // add each person to the list
        for ( int i = 0; i < numPeople; i++ ) {
            str += people[ i ] + ", ";
        }
        // remove last ", " and return
        return str.substring( 0, str.length() - 2 );
    }
    
    public Person nextPerson() {
        if ( nextPerson == numPeople ) {
            return null;
        }
        return people[ nextPerson++ ];
    }
}