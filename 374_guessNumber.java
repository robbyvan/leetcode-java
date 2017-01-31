/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
  public int guessNumber(int n) {
    int low = 1;
    int high = n;
    int num = low +(high - low) / 2;
    int res = guess(num);
    
    while (res != 0){
      if (res < 0){
        high = num;
        num = low + (high - low) / 2;
      }else if (res > 0){
        low = num + 1;
        num = low + (high - low) / 2;
      }else {
        break;
      }
      res = guess(num);
    }
    return num;
  }
}