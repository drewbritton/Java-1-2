package programming.assign05;

/**
 * @author abritton
 */

public class AlienArmy {
    
    private Alien[] aliens;
    private int nextAlien;    // the index of the next alien
    
    public AlienArmy( int numAliens ) {
        aliens = new Alien[ numAliens ];
    }
    
    public void addAlien( Alien newAlien ) {
        aliens[ nextAlien++ ] = newAlien;
        if (this.aliens.length != aliens.length) {
            newAlien = null;
        }
    }
    
    public int getNumAliens() {
        return aliens.length;
    }
     
    
    public int calculateDamage() {
        int damage = 0;
        for (int i = 0; i < aliens.length; i++) {
            damage += aliens[ i ].getDamage();
        }
        return damage;
    }
    
    
} // AlienArmy.