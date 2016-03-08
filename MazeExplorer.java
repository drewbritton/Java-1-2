// Andrew Britton
// CPW 143 Java II
// Programming Assignment 11

import java.io.*;
import java.util.*;

public class MazeExplorer {
    public static void main( String[] args ) 
                  throws FileNotFoundException {
    
        String inputFileName = "EasyMaze.txt"; 
                            // or "Maze1.txt"; // or Maze2.txt 
    
        if ( runMaze( inputFileName ) ) {
            System.out.println( "There is a way out!" );
        }
        else {
            System.out.println( "THERE IS NO WAY OUT!" );
        }
    }
    
    public static boolean runMaze( String fileName ) 
                        throws FileNotFoundException {
        Scanner input = new Scanner( new File( fileName ) );
        ArrayList<String> inputHolder = new ArrayList<String>();
        while( input.hasNextLine() ) {
            String oneLine = input.nextLine();
            inputHolder.add( oneLine );
            System.out.println( oneLine );
        }
        System.out.println();
        
        // dimensions of maze
        int width = inputHolder.get( 0 ).length();
        int height = inputHolder.size();
        
        // array to hold the actual maze.
        Location[][] theMaze = new Location[ height ][ width ]; 
        
        for( int i = 0; i < height; i++ ) {
            for( int j = 0; j < width; j++ ) {
                theMaze[ i ][ j ] = new Location( 
                        inputHolder.get( i ).charAt( j  ), i, j );
            }
        }
        
        // by our convention, the maze has walls all around 
        // it and the start is in the upper left and the 
        // finish is in the lower right.
        // example:
        //     WWWWWWWW
        //     WSOOOOOW
        //     WOOOOOFW
        //     WWWWWWWW
        return isMazeEscapable( theMaze );
    }
    /*
    create an empty stack of Location to explore.
    push the START Location onto the stack.

    while ( stack is not empty ) {
        pop a location loc from the stack.
        if we have pulled loc from the stack before:
            no need to explore it again, so skip loc.
        if loc is FINISH:
            the end was reachable!
        else, loc is a new reachable non-finish location, 
        so explore it:
            add all non-wall adjacent maze locations to the stack.
            record the fact that we have explored loc.
    }
    if the stack is empty, the finish is unreachable.
    */
    public static boolean isMazeEscapable( Location[][] maze ) {
        // we assume the START is in the upper left corner
        // and the FINISH is in the lower right corner.
        final Location START = maze[ 1 ][ 1 ];
        final Location FINISH = maze[ maze.length - 2 ]
                                    [ maze[ 0 ].length - 2 ];
                                       
        Stack<Location> stack = new Stack<Location>();
        stack.push( START );
        
        ///////////////////////////////////////////////
        // Your code goes here
        ///////////////////////////////////////////////
        
        while (!stack.isEmpty()) {
            Location loc = stack.pop();
            Location 
            if (loc.isExplored()) {
                break;
            }
            if (loc.equals(FINISH)) {
                System.out.println("The end was reachable!");
                return true;
            } else {
                stack.push()
            }
            
        }
        
        // stack is empty, the finish is unreachable
        return false;
    }
    
    
    
    public static void printStatus( Location[][] maze,
                                    Location current ) { 
                                    
        int currentX = current.getX();
        int currentY = current.getY();
        for ( int i = 0; i < maze.length; i++ ) {
            for ( int j = 0; j < maze[ 0 ].length; j++ ) {
                if ( i == currentX && j == currentY ) {
                    System.out.print( "$" );
                }
                else {
                    System.out.print( maze[ i ][ j ] );
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println( "Press ENTER to continue..." );
        new java.util.Scanner(System.in).nextLine();
    }
}