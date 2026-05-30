class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        int index;
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                index = st.pop();
                result[index] = i - index;
            }
            st.push(i);
        }
        return result;
    }
}
