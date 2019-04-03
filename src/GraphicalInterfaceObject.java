/*
 * Graphical Interface object: 
 * Displays the state of the current game (the current room, connected rooms, inventory, etc.).
 */
public class GraphicalInterfaceObject {
	private GameControl gameControl;
	
	public GraphicalInterfaceObject() {
	    System.out.println("Starting GraphicalInterfaceObject");
	    this.gameControl = new GameControl();
	}
}