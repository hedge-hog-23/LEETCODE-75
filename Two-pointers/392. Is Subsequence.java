class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        if(s.length()<1) return true;
        while(i<t.length()){
            if(t1[i] == s1[j]){
                j++;
            }
            i++;
        
        if(j == s.length()) return true;}
        return false;
    }
}
