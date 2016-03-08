package programming.assign05;

/**
 * @author abritton
 */
public class OrcAlien extends Alien {
    
    public OrcAlien(String name, int health) {
        super(name, health);
    }
    
    @Override
    public int getDamage() {
        return 6;
    }
    
    public int getHealth() {
        return 100;
    }
}
