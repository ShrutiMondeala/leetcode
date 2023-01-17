/*
 * @lc app=leetcode id=1679 lang=java
 *
 * [1679] Max Number of K-Sum Pairs
 */

// @lc code=start
class Solution {
    public int maxOperations(int[] nums, int k) {
        int operationNumber = 0;

        List <Integer> newList = new ArrayList<Integer>();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

         for (int i =0 ; i <nums.length; i++){
             map.put(i+1,nums[i]);
         }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
 
		   if(!map.containsValue(k - entry.getValue())){
		      newList.add(entry.getValue());
		   }
  
		}

        return ((map.size() - newList.size())/2);
         
    }
}
// @lc code=end

