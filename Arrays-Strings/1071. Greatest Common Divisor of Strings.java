class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //2 completely different strings
        if(!(str1+str2).equals(str2+str1))
            return "";
        //math formula (incase words are different)
        int s1 = str1.length();
        int s2 = str2.length();
        int gcd_res = gcd(s1,s2);
        return str1.substring(0,gcd_res);
    }        
        public int gcd(int a, int b){
            if(b == 0) return a;
            else return gcd(b,a%b);
        }
        

    
}
