/* 14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
*/
package ProblemSolving;

class longestCommonPrefix{
    
    public static char longestCommonPrefix (String[] strs){
        //System.out.println(strs.length);
        //System.out.println(strs[2].length());
        for(int i=0 ; i < strs.length; i++){
           for(int j=0 ; j < strs[i].length(); j++){
           if(strs[i].charAt(j)==strs[i+1].charAt(j) && strs[i+1].charAt(j)==strs[i+2].charAt(j)){
               return strs[i].charAt(j);
           }else{
               return ' ';
           }  
        
       }    
       }
    return ' ';

    }
    public static void main(String []args){
       String[] Strs ={"flower","flow","flight"}; 
       System.out.print("\"" + longestCommonPrefix(Strs) + "\""); 
       //System.out.println(Strs[0].charAt(1));
    }
}