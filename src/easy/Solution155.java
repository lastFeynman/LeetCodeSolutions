package easy;

import java.util.ArrayList;
import java.util.List;

public class Solution155 {

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
	}

}

class MinStack {
	private List<Integer> min;
	private List<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
        min = new ArrayList<>();
        min.add(Integer.MAX_VALUE);
        stack = new ArrayList<>();
    }
    
    public void push(int x) {
    	if(x < min.get(min.size()-1))
    		min.add(x);
    	else 
    		min.add(min.get(min.size()-1));
        stack.add(x);
    }
    
    public void pop() {
    	min.remove(min.size()-1);
        stack.remove(stack.size()-1);
    }
    
    public int top() {
		return stack.get(stack.size()-1);
    }
    
    public int getMin() {
		return min.get(min.size()-1);    
    }
}