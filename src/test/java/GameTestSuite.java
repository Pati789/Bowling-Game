import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTestSuite {


    Game game = new Game();

    @Test
    public void rollTest() {
        game.roll(1);
        game.roll(4);
        game.roll(4);
        game.roll(5);
        game.roll(6);
        game.roll(4);
        game.roll(5);
        game.roll(5);
        game.roll(10);
        game.roll(0);
        game.roll(1);
        game.roll(7);
        game.roll(3);
        game.roll(6);
        game.roll(4);
        game.roll(10);
        game.roll(2);
        game.roll(8);
        game.roll(6);

        assertEquals(133, game.getScore());
    }

}
