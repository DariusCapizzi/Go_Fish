import java.util.ArrayList;
import java.util.Collections;

public class Player {
  private ArrayList<String> mHand = new ArrayList();
  private int mScore;
  private int mID;


  public Player(game) {
    mID = game.getPlayerArray().size();
    game.addPlayer(this);
  }

  public int getScore(){
    return mScore;
  }

  public ArrayList<String> getHand() {
    return mHand;
  }

  public void addToHand(Game game) {
    mHand.add(game.draw());
    // System.out.println(getHand());
  }

  public void addToHand(Game game, int number) {
    for (int i=0;i<number;i++) {
      mHand.add(game.draw());
    }
    // System.out.println(getHand());
  }

  public void addToHandForUs(String card) {
    mHand.add(card);
    // System.out.println(getHand());
  }

  public void removeFromHand(String card){
    mHand.remove(card);
    // System.out.println(getHand());
  }

  public void fourOfKind() {

    for (int i = 0; i < mHand.size(); i++) {
      int counter=0;
      ArrayList<String> removableCards = new ArrayList<String>();
      for (int j = 0; j < mHand.size(); j++) {
        try {
          if (Integer.parseInt(mHand.get(i).substring(0,1)) == Integer.parseInt(mHand.get(j).substring(0,1)) ){
            counter++;
            removableCards.add(mHand.get(j));
          }
        } catch (NumberFormatException e){
          if (Integer.parseInt(mHand.get(i).substring(0,2)) == Integer.parseInt(mHand.get(j).substring(0,2)) ){
            counter++;
            removableCards.add(mHand.get(j));
          }
        }
      }

      if(counter==4){

        mScore++;
        for (int j=0;j<removableCards.size();j++ ) {
          removeFromHand(removableCards.get(j));
        }
      }
    }
  }

  public Boolean checkIfInHand(String card) {
    if (mHand.contains(card)) {
      return true;
    } else {
      return false;
    }
  }

}
