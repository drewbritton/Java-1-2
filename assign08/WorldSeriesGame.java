package programming.assign08;

public class WorldSeriesGame {
    private int year;
    private String winner;
    private String games;
    private String runnerUp;
    
    public WorldSeriesGame( int year,
                            String winner,
                            String games,
                            String runnerUp ) {
        this.year = year;
        this.winner = winner;
        this.games = games;
        this.runnerUp = runnerUp;
    }
    public int getYear() {
        return year;
    }
    public String getWinner() {
        return winner;
    }
    public String getGames() {
        return games;
    }
    public String getRunnerUp() {
        return runnerUp;
    }
    public String toString() {
        return year + " " + winner + " " + games + " " + runnerUp;
    }
}