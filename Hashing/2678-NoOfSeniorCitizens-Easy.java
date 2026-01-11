class Solution {
    public int countSeniors(String[] details) {
        int count =0;
        for(String s: details) {
            if(60 < Integer.parseInt(s.substring(11,13)))
               count++;
        }
        return count;
    }
}