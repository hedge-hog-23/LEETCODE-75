class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> s = new Stack<>();
        for(int i : asteroids){
            if(i > 0){
                s.push(i);
            }
            else{
                while(!s.isEmpty() && s.peek()>0 && s.peek()<Math.abs(i)){
                    s.pop();
                }
                if(!s.isEmpty() && s.peek() == Math.abs(i))
                    s.pop();
                else{
                    if(s.isEmpty() || s.peek()<0)
                        s.push(i);
                }
            }
        }

        int arr[] = new int[s.size()];
        for(int i = 0;i<s.size();i++){
            arr[i] = s.get(i);
        }
        return arr;
    }
}
