package programming.assign05;

/**
 * @author abritton
 */
public class KrakenAlien extends Alien {
    
    public KrakenAlien(String name, int health) {
        super(name, health);
    }
    
    @Override
    public int getDamage() {
        return 10;
    }
    
    public int getHealth() {
        return 100;
    }
}
