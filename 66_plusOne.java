public class Solution {
  public int[] plusOne(int[] digits) {
    int n = digits.length;
    int carry = 0;
    int[] digits2 = new int[n+1];
    for (int i = n - 1; i > -1; i--){
      if (digits[i] < 9){
        digits[i] += 1;
        digits2[i+1] = digits[i];
        return digits;
      }else{
        digits[i] = 0;
        digits2[i+1] = 0;
      }
    }
    digits2[0] = 1;
    return digits2;    
  }
}