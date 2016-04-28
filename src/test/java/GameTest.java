import org.junit.*;
import static org.junit.Assert.*;



public class GameTest {

  @After
  public void tearDown() {
    Game testGame = new Game();
    testGame.resetGame();
  }

  @Test
  public void Game_instantiatesCorrectly_true() {
    Game testGame = new Game();
    assertEquals(true, testGame instanceof Game);
  }

  @Test
  public void Game_populatesDeck_true() {
    Game testGame = new Game();
    assertTrue(testGame.getDeck().size() == 52);
  }

  @Test
  public void Game_DrawReturnsCard_true() {
    Game testGame = new Game();
    assertTrue(testGame.draw() instanceof String);
  }

  @Test
  public void Game_DrawCardRemovesCardFromDeck_true() {
    Game testGame = new Game();
    testGame.resetGame();
    testGame.draw();
    assertTrue(testGame.getDeck().size() == 51);
  }
}
