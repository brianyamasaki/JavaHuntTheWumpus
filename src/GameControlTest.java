import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class GameControlTest {

    @Test
    public void instantiateGameControlShouldSucceed() {
        GameControl gameControl = new GameControl(); // GameControl is tested

        // assert statements
        assertNotNull(gameControl, "Game Control instantiates properly");
    }
}