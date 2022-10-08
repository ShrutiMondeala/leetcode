/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int flag=0;
        int start=0;
        int end=start+1;
        int num=nums.length-1;
        for(int i=0;i<=num;i++){
            for(int j=1;j<=num;j++){
                if((nums[i]+nums[j])==target && i<j){
                    arr[0]=i;
                    arr[1]=j;
                    flag=1;
                    break;
                }
                else{
                    continue;
                }
            }
            if(flag==1){
                break;
            }
        }
       return arr;
    }
}
// @lc code=end

