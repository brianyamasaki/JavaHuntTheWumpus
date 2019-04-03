/*
 * Graphical Interface object: 
 * Displays the state of the current game (the current room, connected rooms, inventory, etc.).
 * Hint: User interacts with game here
 * Hint: Sends game play events (like move room, shoot arrow, or buy Secret) to GameControl
 */
public class GraphicalInterface {
	private GameControl gameControl;
	
	public GraphicalInterface() {
	    System.out.println("Starting GraphicalInterface");
	    this.gameControl = new GameControl();
	}
	/*
	 * Example moveToRoom event received from user would call
	 * this.gameControl.moveToRoom(x)
	 *
	 */
}