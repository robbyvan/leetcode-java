public class Solution {
  public int[] twoSum(int[] nums, int target){
    int[] res = new int[2];
    Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; ++i){
      int other = target - nums[i];
      if (myMap.containsKey(other)){
        res[0] = myMap.get(other);
        res[1] = i;
        return res;
      }
      myMap.put(nums[i], i);
    }
    return res;
  }
}