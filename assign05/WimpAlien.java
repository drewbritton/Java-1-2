package programming.assign05;

/**
 * @author abritton
 */
public class WimpAlien extends Alien {
    
    public WimpAlien(String name, int health) {
        super(name, health);
    }
    
    @Override
    public int getDamage() {
        return 1;
    }
    
    public int getHealth() {
        return 100;
    }
}
