package programming.assign07;

public class TriangleExceptionTester {
    public static void main( String[] args ) {
    
        System.out.println( "no-arg construction:" );
        Triangle ta = new Triangle();
        System.out.println( "Triangle should have sides"
                           + " {2, 4, 5}" );
        System.out.println( "Triangle has these sides " + ta );
        System.out.println();
        
        
        System.out.println( "general construction of valid triangle: " );
        Triangle tb = new Triangle( 3, 4, 5 );
        System.out.println( "Triangle should have sides "
                          + "{3, 4, 5}" );
        System.out.println( "Triangle has these sides " + tb );
        System.out.println();
        
        
        System.out.println( "general construction of INVALID triangle: " );
        int[][] sides = { { 3, 4, 7 }, 
                          { 3, 7, 4 }, 
                          { 4, 3, 7 },
                          { 4, 7, 3 },
                          { 7, 3, 4 },
                          { 7, 4, 3 }
                        };
        for ( int i = 0; i < sides.length; i++ ) {
            try {
                int a = sides[ i ][ 0 ];
                int b = sides[ i ][ 1 ];
                int c = sides[ i ][ 2 ];
                Triangle tc = new Triangle( a, b, c );
                System.out.println( "PROBLEM: illegal triangle not detected"); 
            }   
            catch( IllegalTriangleException ite ) {
                System.out.println( "Success! illegal triangle detected" );
                System.out.println( ite );
            }
            System.out.println();
        }                        

        System.out.println(); 
    }
}