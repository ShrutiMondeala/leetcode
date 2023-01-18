/*
 * @lc app=leetcode id=1700 lang=java
 *
 * [1700] Number of Students Unable to Eat Lunch
 */

// @lc code=start
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i : students){

            queue.add(i);
        }

        Stack stack = new Stack();

        for(int i : sandwiches){
            stack.push(i);
        }

        for (int i = 0 ; i < stack.size(); i++){

            if (queue.peek() == stack.get(i)){
                stack.pop();
                queue.remove();
            }
            else{
                int a = queue.remove();
                queue.add(a);
            }
        }

        return queue.size();
    }
}
// @lc code=end

