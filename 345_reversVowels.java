public class Solution{
  public String reverseVowels(String s){
    if (s == null || s.length == 0){
      return "";
    }else{
      char[] charArr = s.toCharArray(s);
      String vowels = "aeiouAEIOU";
      int low = 0;
      int high = charArr.length - 1;
      while (low < high){
        while (low < high && !vowels.contains(charArr[low] + "")){
          low += 1;
        }
        while (high > low && !vowels.contains(charArr[high] + "")){
          high -= 1;
        }
        char temp = charArr[low];
        charArr[low] = charArr[high];
        charArr[high] = temp;
        i += 1;
        j -= 1;
      }
      return new String(charArr);
    }

  }
}

//   public class Solution {
//     public String reverseVowels(String s) {
//         if (s == ""){
//             return s;
//         }
//         Map<String, Boolean> map = new HashMap<String, Boolean>();
//         String[] vowels = {"a", "e", "i", "o", "u"};
//         for (String vowel : vowels){
//             map.put(vowel, true);
//         }
        
//         String[] strArr = s.split("");
//         for (int i = 0, j = strArr.length - 1; i < j; ){
//           while (i < j){
//             if (map.get(strArr[i]) == null){
//               i += 1;
//             }else {
//               break;
//             }
//           }
//           while (j > i){
//             if (map.get(strArr[j]) == null){
//               j -= 1;
//             }else{
//               break;
//             }
//           }
//           String temp = strArr[i];
//           strArr[i] = strArr[j];
//           strArr[j] = temp;
//           i += 1;
//           j -= 1;
//         }
//         StringBuffer sb = new StringBuffer();
//         for (int i = 0; i < strArr.length; i++){
//           sb.append(strArr[i]);
//         }
//         String str = sb.toString();
//         return str;
//     }
// }