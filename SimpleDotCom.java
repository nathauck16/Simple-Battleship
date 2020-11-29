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

  //get the user guess
  public String checkYourself(String stringGuess) {
        //convert user guess to an int
        int guess = Integer.parseInt(stringGuess);
        //create default result
        String result = "miss";
        //repeat with each cell in the locationCells array(each cell location of the object)
        for (int cell : locationCells) {
          if (guess == cell) {
            result = "hit";
            numOfHits++;
            break;  //get out of the loop
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