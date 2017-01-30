import java.util.*;
public class Solution {
  public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> myMap = new HashMap<Character, Integer>();
    int currhead = 0;
    int maxLen = 0;
    int currLen = 0;

    for (int i = 0; i < s.length(); ++i){
      char c = s.charAt(i);
      if (myMap.containsKey(c) == true){
        currhead = Math.max(myMap.get(c), currhead);//利用max消除错误判断重复
        currLen = i - currhead;
      }else{
        currLen = currLen + 1;
      }
      if (currLen > maxLen){
        maxLen = currLen;
      }
      myMap.put(c, i);
    } 
    return maxLen;
  }
}