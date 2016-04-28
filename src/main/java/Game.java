import java.util.ArrayList;
import java.util.Collections;

public class Game {
  // private //player

  //store mDeck in sessionstorage
  private ArrayList<String> mDeck = new ArrayList<String>();

  private static ArrayList<Player> playerArray = new ArrayList<Player>();

  public Game(){
    resetGame();
  }

  public static void addPlayer(Player player) {
    playerArray.add(player);
  }

  public static ArrayList<Player> getPlayerArray(){
    return playerArray;
  }

  //reset Game
  public void resetGame(){
    mDeck.clear();
    for (int i=1;i<14;i++) {
      //conditions for special names
      mDeck.add(i + " hearts");
      mDeck.add(i + " spades");
      mDeck.add(i + " clubs");
      mDeck.add(i + " diamonds");
    }
    Collections.shuffle(mDeck);
    // System.out.println(mDeck);
  }

  public ArrayList<String> getDeck(){
    return mDeck;
  }

  //remove card from mDeck
  public String draw(){
    // // return value if draw is impossible?
    // if (isGameOver()) {
    //   return "Game Over";
    // } else {
      String drawnCard = mDeck.get(0);
      mDeck.remove(0);
      Collections.shuffle(mDeck);
      System.out.println(drawnCard);
      return drawnCard;
    // }
  }

  //endGame
  public boolean isGameOver(){
    if (mDeck.size() == 0) {
      return true;
    } else {
      return false;
    }
  }


}
