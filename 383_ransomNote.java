public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.length() == 0){
          return true;
        }
        if (magazine == null || ransomNote.length() == 0){
          return false;
        }
        Map<Character, Integer> mMap = new HashMap<Character, Integer>();
        for (char i : magazine.toCharArray()){
          int count = mMap.getOrDefault(i, 0) + 1;
          mMap.put(i, count);
        }
        for (char i : ransomNote.toCharArray()){
          int count = mMap.getOrDefault(i, 0) - 1;
          if (count < 0){
            return false;
          }
          mMap.put(i, count);
        }
        return true;
    }
}