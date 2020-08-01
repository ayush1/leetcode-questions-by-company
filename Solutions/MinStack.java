public class MinStack{
    int min = Integer.MAX_VALUE;
    Stack<Integer> s;

    /** initialize your data structure here. */
    public MinStack() {
        s = new Stack<Integer>();
    }

    public void push(int x) {
        if(s.isEmpty()){
            s.push(x);
            min = x;
            return;
        }
        if(x < min){
            s.push(2*x - min);
            min = x;
        } else {
            s.push(x);
        }

    }

    public void pop() {
        if(s.isEmpty()){
            return;
        }
        int value = s.pop();
        if(value < min){
            min = 2*min - value;
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min;
    }
}