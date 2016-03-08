import java.awt.*;

public class Rectangle143 extends Rectangle{

    private Color color;
    
    public Rectangle143( int x, int y, int width, int height, 
                         Color color ) {
        super( x, y, width, height );
        this.color = color;
    }
    
    public Color getColor() {
        return color;
    }
}