public class Solution {
    public int[] singleNumber(int[] nums) {
      int mixed = 0;
      for (int num : nums){
        mixed = mixed ^ num;
      }
      mixed = mixed & ~(mixed-1);

      int num1 = 0;
      int num2 = 0;
      for (int num : nums){
        if ((num & mixed) > 0){
          num1 = num1 ^ num;
        }else{
          num2 = num2 ^ num;
        }
      }
      int[] result = new int[2];
      result[0] = num1;
      result[1] = num2;
      return result;
    }
}