// A custom Point class

public class Point {
    private int x;
    private int y;
    
    // constructor
    public Point() {
        this(0, 0);    // calls Point(int, int) constructor
    }
    
    // constructor (a new point with the given (x, y) coordinates
    public Point(int x, int y) {
        setLocation(x, y);
    }
    
    // accessor
    public int getX() {
        return x;
    }
    
    // accessor
    public int getY() {
        return y;
    }
    
    // sets this point's (x, y) location to the given values (mutator)
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    
    
    