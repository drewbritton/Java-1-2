import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class WindowsTester extends MouseInputAdapter {

    private Point p;
    JFrame frame;
    Graphics g;    
    OverLappedRectangles olr;
    MouseListener cl;

    public WindowsTester() {
        p = new Point();
        frame = new JFrame();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( new Dimension( 500, 550 ) );
        frame.setTitle( "Program 5" );
        frame.setVisible( true );
        g = frame.getGraphics();
        
        olr = new OverLappedRectangles();
        
        olr.addRect( new Rectangle143( 40, 40, 200, 300, Color.RED  ) );
        olr.addRect( new Rectangle143( 150, 80, 200, 300, Color.BLUE ) );
        olr.addRect( new Rectangle143( 25, 200, 200, 300, Color.YELLOW ) );
        olr.addRect( new Rectangle143( 200, 100, 200, 300, Color.GREEN ) );
        
        olr.drawOn( g );
        
        frame.addMouseListener( this );

        
    }
    
    public void mousePressed( MouseEvent event ) {
        p.setX( event.getX() );
        p.setY( event.getY() );
        System.out.println( p );
        olr.moveToTop( p );
        olr.drawOn( g );
    }
    
    public static void main( String[] args ) {
        WindowsTester wt = new WindowsTester();
    }
}