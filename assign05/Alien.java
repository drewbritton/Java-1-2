package programming.assign05;

/**
 * @author abritton
 */

public abstract class Alien {
    
    private int health; // 0 = dead, 100 = full strength.
    private String name;
    
    public Alien(String name, int health) {
        this.name = name;
        this.health = health;
    }
    
    public abstract int getDamage();
    
    
} // Alien.