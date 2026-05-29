class MinStack {
    Stack<Long> s1;
    long min;

    public MinStack() {
        s1 = new Stack<>();
        min = -1L;
    }
    
    public void push(int val) {
        if(s1.isEmpty()){
            s1.push((long)val);
            min = val;
        }
        else if(val<min){
            s1.push(2L*val-min);
            min = val;
        }else{
            s1.push((long)val);
        }
    }
    
    public void pop() {
        if(s1.isEmpty()){
            return;
        }else{
            long n = s1.pop();
            if(n<min){
                min = 2L*min-n;
            }
        }
        
    }
    
    public int top() {
        if(s1.isEmpty()){
            return -1;
        }
        long top = s1.peek();
        if(top<min){
            return (int)min;
        }
        return (int)top;
    }
    
    public int getMin() {
        if(s1.isEmpty()){
            return -1;
        }
        return (int)min;
    }
}
