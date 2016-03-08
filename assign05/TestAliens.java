package programming.assign05;

/* Andrew Britton
 * CPW 143 Fall 2015
 * Programming Assignment 05
 */

public class TestAliens {
	/** ======================
	*    main method.
	*    In main we simply create a small army and output its total damage (17).
	* ======================
	*/
	public static void main( String[] args ) {
		Alien squid = new KrakenAlien( "Squid", 100 );
		Alien uggrod = new OrcAlien( "Uggrod", 100 );
		Alien peeWee = new WimpAlien( "PeeWee", 100 );

		AlienArmy army = new AlienArmy( 3 );	// 3 aliens in the pack
		army.addAlien( squid );
		army.addAlien( uggrod );
		army.addAlien( peeWee );

		System.out.println( "Total army damage = " + army.calculateDamage() );
	}
}