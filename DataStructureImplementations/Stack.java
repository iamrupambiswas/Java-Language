class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;
    
    public Stack(int size) {
        this.maxSize = size;
        this.top = -1;
        this.stackArray = new int[maxSize];
        System.out.println("Stack initiated with size of " + this.maxSize);
    }
    
    public void push(int element) {
        if(top == maxSize-1) {
            System.out.println("Stack overflow!");
            return;
        }
        
        stackArray[++top] = element;
    }
    
    public int pop() {
        if(top == -1) {
            System.out.println("Stack underflow!");
            return -1;
        }
        
        return stackArray[top--];
    }
    
    public int peek() {
        return (top == -1) ? -1 : stackArray[top];
    }
}