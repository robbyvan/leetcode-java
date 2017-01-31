import java.util.*;
// public class Solution {
//   public List<Integer> topKFrequent(int[] nums, int k) {

//     Map<Integer, Integer> map = new HashMap<>();

//     for (int num : nums){
//       map.put(num, map.getOrDefault(num, 0) + 1);
//     }

//     PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b) -> (b.getValue() - a.getValue()));

//     for (Map.Entry<Integer, Integer> entry : map.entrySet()){
//       maxHeap.add(entry);
//     }

//     List<Integer> res = new ArrayList<>();
//     while  (res.size() < k){
//       Map.Entry<Integer, Integer> entry = maxHeap.poll();
//       res.add(entry.getKey());
//     }

//     return res;

//   }
// }


//bucket
public class Solution {
  public List<Integer> topKFrequent(int[] nums, int k) {

   Map<Integer, Integer> map = new HashMap<>();
   for (int num : nums){
    map.put(num, map.getOrDefault(num, 0) + 1);
   }

   List<Integer>[] bucket = new List[nums.length + 1];
   for (int num : map.keySet()){
    int freq = map.get(num);
    if (bucket[freq] == null){
      bucket[freq] = new LinkedList<>();
    }
    bucket[freq].add(num);
   }

   List<Integer> res = new LinkedList<>();
   for (int i = bucket.length - 1; i >0 && k > 0; --i){
    if (bucket[i] != null){
      List<Integer> list = bucket[i];
      res.addAll(list);
      k -= list.size();
    }
   }
   return res;

  }
}