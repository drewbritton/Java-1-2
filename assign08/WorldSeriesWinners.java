package programming.assign08;

// Andrew Britton
// CPW 143 Java II
// Programming Assignment 08: Maps
// This program takes in a .txt file containing teams that have
// participated in the World Series, and lists the years each team
// has won. The information from the .txt file is stored in a TreeMap.

import java.io.*;
import java.util.*;

public class WorldSeriesWinners {

    public static void main( String[] args ) 
        throws FileNotFoundException {
        
        Scanner input = new Scanner(new File("ListofWorldSeriesChampions.txt"));
                        
        
        ArrayList<WorldSeriesGame> allGames = 
                                    new ArrayList<WorldSeriesGame>();
        
        input.nextLine(); // Skip title line in file.
        input.nextLine(); // Skip column heading line.
        
        // read all the remaining lines from file
        while ( input.hasNextLine() ) {
            String oneLine = input.nextLine();
            // there was no World Series in 1904 or 1994
            if ( !oneLine.contains("No World Series was played") ) {
                allGames.add( makeGame( oneLine ) );
            }
        }
        
        // Here's every World Series from 1903 to 2014.
//        for ( WorldSeriesGame game : allGames ) {
//            System.out.println( game );
//        }
        
        // Your code goes here.
        Map<String, List<Integer>> worldSeriesTeams =
                        new TreeMap<String, List<Integer>>();
        for (int i = 0; i < allGames.size(); i++) {
            if (!worldSeriesTeams.containsKey(allGames.get(i).getWinner())) {
                worldSeriesTeams.put(allGames.get(i).getWinner(), new ArrayList<Integer>());
            }
            worldSeriesTeams.get(allGames.get(i).getWinner()).add(allGames.get(i).getYear());
        }
        //System.out.println(worldSeriesTeams);
        System.out.println("Team's winning years: ");
        System.out.println("\n");
        
        Iterator<String> it = worldSeriesTeams.keySet().iterator();
        while (it.hasNext()) {
            String teamName = it.next();
            List<Integer> yearsWon = worldSeriesTeams.get(teamName);
            System.out.println();
        }
        
        


    }
    
    public static WorldSeriesGame makeGame( String oneLine ) {

        int year = Integer.parseInt( oneLine.substring( 0, 4 ) );
        String winner = 
             oneLine.substring( 4, 1 + oneLine.indexOf( ")" ) ).trim();
        String games = 
             oneLine.substring( 1 + oneLine.indexOf( ")" ), 
                                6 + oneLine.indexOf( ")" ) ).trim();
        String runnerUp = 
             oneLine.substring( 6 + oneLine.indexOf( ")" ) ).trim();
        
        return new WorldSeriesGame( year, winner, games, runnerUp );
    }
}