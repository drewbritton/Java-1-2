// Andrew Britton

public class Location {
    private char type; // W: wall, O: open, S: start, F: finish.
    private boolean explored; // true: we are done with this one.
    private int x; // x coord of this location
    private int y; // y coord of this location
    
    public Location( char type, int x, int y ) {
        this.type = type;
        this.x = x;
        this.y = y;
        explored = false;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public boolean equals( Object other ) {
        if ( other != null && other instanceof Location ) {
            return this == other;
        }
        else {
            return false;
        }
    }
    
    public boolean isExplored() {
        return explored;
    }
    
    public void setExplored() {
        explored = true;
    }
    
    public boolean isWall() {
        return type == 'W';
    }
    
    public String toString() {
        return "" + type;
    }
}
