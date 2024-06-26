class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int res = 0;
        int ret = 0;
        while(i<j){
            if(height[i]<=height[j]){
                res = height[i] * Math.abs(i-j);
                i++;
            }
            else{
                res = height[j] * Math.abs(i-j);
                j--;
            }
            if(res>ret) ret = res;
        }
        return ret;
        
    }
}
