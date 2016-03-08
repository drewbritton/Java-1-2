package programming.assign04;

import java.util.Set;

/**
 *
 * @author abritton
 */
public class DocumentTester {
    public static void main(String[] args) {
        // test Document class
        System.out.println( "Testing Document:" );
        Document docOne = new Document();
        System.out.println( docOne );
        docOne.setText( "Now, we have content." );
        System.out.println( docOne );
        Document docTwo = new Document( "Here is some text!" );
        System.out.println( docTwo );
        System.out.println();
        
        // test Email class
        System.out.println( "Testing Email:" );
        Email emailOne = new Email( "Me", "You", "with love" );
        System.out.println( emailOne );
        emailOne.setText( "I'll send it along." );
        System.out.println( emailOne );
        Email emailTwo = new Email( "Hello", "Goodbye", "Don't know why",
                                    "I say high, you say low." );
        System.out.println( emailTwo );
        System.out.println();
        
        // test File class
        System.out.println( "Testing File:" );
        File fileOne = new File( "doc" );
        System.out.println( fileOne );
        fileOne.setText( "1234567890" );
        System.out.println( fileOne );
        File fileTwo = new File( "txt", "Beatles Forever!" );
        System.out.println( fileTwo );
        System.out.println();
    } 
}
