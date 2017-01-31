import java.util.*;
public class Solution {
  public List<Integer> majorityElement(int[] nums) {
    if (nums.length == 0 || nums == null){
      return new ArrayList<Integer>();
    }
    int num1 = nums[0];
    int num2 = nums[0];
    int count1 = 0;
    int count2 = 0;

    for (int num : nums){

      if (num == num1){
        count1 += 1;
      }else if (num == num2){
        count2 += 1;
      }else{
        if (count1 == 0){
          num1 = num;
          count1 = 1;
        }else if (count2 == 0){
          num2 = num;
          count2 = 1;
        }else {
          count1 -= 1;
          count2 -= 1;
        }
      }//end else
    }//end for

    count1 = 0;
    count2 = 0;
    for (int i = 0; i < nums.length; ++i){

      if (nums[i] == num1){
        count1 += 1;
      }
      if (nums[i] == num2){
        count2 += 1;
      }

    }

    ArrayList<Integer> res = new ArrayList<>();
    if (count1 > nums.length / 3){
      res.add(num1);
    }
    if (num2 != num1 && count2 > nums.length/3){
      res.add(num2);
    }

    return res;
  }
}