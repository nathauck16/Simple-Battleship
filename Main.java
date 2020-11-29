class Main {

  public static void main(String[] args) {
      //variables
    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();
    SimpleDotCom dot = new SimpleDotCom();
    int randomNum = (int) (Math.random() * 5);

    //3 consecutive cells
    int[] locations = {randomNum, randomNum + 1, randomNum + 2};

    dot.setLocationCells(locations);
    
    boolean isAlive = true;
    
    while (isAlive == true) {
      // prompt guess between 0 and 6
      String guess = helper.getUserInput("enter a number");
      String result = dot.checkYourself(guess);
      numOfGuesses++;
      if(result.equals("kill")){
        isAlive = false;
        System.out.println(" you took " + numOfGuesses + " guesses.");
      }
    }
  }
}