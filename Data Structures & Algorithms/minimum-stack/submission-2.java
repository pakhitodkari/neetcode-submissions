class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int val) {
        if(s1.isEmpty() && s2.isEmpty()){
            s1.push(val);
            s2.push(val);
        }
        else{
        s1.push(val);
        if(s1.peek()>s2.peek()){
            s2.push(s2.peek());
        }else{
            s2.push(val);
        }
        }
    }
    
    public void pop() {
        if(s1.isEmpty()){
            return;
        }
        s1.pop();
        s2.pop();
    }
    
    public int top() {
        if(s1.isEmpty()){
            return -1;
        }
        return s1.peek();
    }
    
    public int getMin() {
        if(s2.isEmpty()){
            return -1;
        }
        return s2.peek();
    }
}
