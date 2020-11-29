public class SimpleDotCom {

  //instance variables
  int[] locationCells;
  int numOfHits = 0;

  //constructor
  public void setLocationCells(int[] locs) {
    locationCells = locs;
  }

  //check yourself method- checks guess
  //default result is miss, if hit result is hit
  public String checkYourself(String stringGuess) {
    int guess = Integer.parseInt(stringGuess);
    String result = "miss";
    for (int cell : locationCells) {
      if (guess == cell) {
        result = "hit";
        numOfHits++;
        break;
      }
    }
    
    //kill method. if # of hits = length of dotcom, result is kill
    if (numOfHits == locationCells.length){
      result = "kill";
    }
    System.out.println(result);
    return result;
  }
}