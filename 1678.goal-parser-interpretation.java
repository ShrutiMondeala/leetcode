/*
 * @lc app=leetcode id=1678 lang=java
 *
 * [1678] Goal Parser Interpretation
 */

// @lc code=start
class Solution {
    public String interpret(String command) {
        
        String str = "";

        for (int i =0; i< command.length(); i++){

            if (command.charAt(i) == 'G'){

                str += 'G';
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) ==')'){
                str += 'o';
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) =='a'){
                str += "al";
            }
            else{

            }
        }

        return str;
    }
}
// @lc code=end

