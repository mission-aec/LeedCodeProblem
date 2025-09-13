package ProblemSolving;

public class LongestCommonPrefix {

 public static String longestCommonPrefix(String[] strs) {
        String s=strs[0];

        for(byte i=0; i<strs.length; i++){
            if(strs[i].length()<s.length()){
                s=s.substring(0,strs[i].length());
            }
            else if(strs[i].length()==0){
                s="";
                return s;
            }
            for(byte j=0; j<Math.min(strs[i].length(),s.length()); j++){
                if(strs[i].charAt(j)!=s.charAt(j)){
                    s=s.substring(0,j);
                }
            }
        }
        return s;
        
}

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String s=longestCommonPrefix(strs);
        System.out.println(s);
    }
}