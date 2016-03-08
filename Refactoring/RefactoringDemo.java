public class RefactoringDemo {
    public static void main( String[] args ) {
        School springfieldElemantary = new School();
        springfieldElemantary.addPerson( 
            new Person( "William MacDougal", Person.STAFF) );
        springfieldElemantary.addPerson( 
            new Person( "Edna Krabappel", Person.FACULTY) );
        springfieldElemantary.addPerson( 
            new Person( "Milhouse Van Houten", Person.STUDENT) );
        springfieldElemantary.addPerson( 
            new Person( "Allison Taylor", Person.STUDENT) );
          
        System.out.println( springfieldElemantary );
        System.out.println();
        
        // find out what each person says
        Person next = springfieldElemantary.nextPerson();
        while ( next != null ) {
            System.out.println( next + " says \"" 
                              + next.speak() + "\"");
            next = springfieldElemantary.nextPerson();
        }
        
    }
}