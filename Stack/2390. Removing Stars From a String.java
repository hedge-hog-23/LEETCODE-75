class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(i != '*') st.push(i);
            else if (!st.isEmpty()) st.pop();
        }
        // String ans = "";
        // for (char i : st)
        //     ans+=i;
        // return ans;
        StringBuilder ans = new StringBuilder();
        for(char i : st)
            ans.append(i);
        return ans.toString();

    }
}
