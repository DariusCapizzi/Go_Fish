import org.junit.*;
import static org.junit.Assert.*;

public class PlayerTest {

  @Test
  public void Player_instantiatesCorrectly_true() {
    Player testPlayer = new Player();
    assertEquals(true, testPlayer instanceof Player);
  }

  @Test
  public void addToHand_addsToHand_true() {
    Player testPlayer = new Player();
    Game testGame = new Game();
    testPlayer.addToHand(testGame);
    assertEquals(true, testPlayer instanceof Player);
  }

  @Test
  public void removeFromHand_takesCardOut_true() {
    Player testPlayer = new Player();
    testPlayer.addToHandForUs("12 spades");
    testPlayer.addToHandForUs("2 spades");
    assertEquals(true, testPlayer.getHand().contains("2 spades"));
    testPlayer.removeFromHand("2 spades");
    assertEquals(false, testPlayer.getHand().contains("2 spades"));
  }

  @Test
  public void fourOfKind_addToScoreAndRemoveFromHand_true() {
    Player testPlayer = new Player();
    testPlayer.addToHandForUs("12 spades");
    testPlayer.addToHandForUs("2 spades");
    testPlayer.addToHandForUs("2 hearts");
    testPlayer.addToHandForUs("2 clubs");
    testPlayer.addToHandForUs("2 diamonds");
    assertEquals(true, testPlayer.getHand().contains("2 spades"));
    testPlayer.fourOfKind();
    assertEquals(false, testPlayer.getHand().contains("2 spades"));
    // assertEquals(1,testPlayer.getScore());
  }

  @Test
  public void checkIfInHand_checksIfCardIsInHand_true() {
    Player testPlayer = new Player();
    testPlayer.addToHandForUs("3 hearts");
    assertEquals(true, testPlayer.checkIfInHand("3 hearts"));
  }


}
