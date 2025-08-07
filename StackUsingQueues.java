

public class StackUsingQueues {
    private QueueUsingArray q1;
    private QueueUsingArray q2;
    private int capacity;

    public StackUsingQueues(int capacity) {
        this.capacity = capacity;
        q1 = new QueueUsingArray(capacity);
        q2 = new QueueUsingArray(capacity);
    }

    // Push element onto stack
    public void push(int x) {
        if (q1.getSize() == capacity) throw new RuntimeException("Stack is full");
        q2.enqueue(x);
        while (!q1.isEmpty()) {
            q2.enqueue(q1.dequeue());
        }
        // Swap q1 and q2
        QueueUsingArray temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Removes the element on top of the stack
    public int pop() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        System.out.println("Popping: " + q1.peek());
        return q1.dequeue();
    }

    // Get the top element
    public int top() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.peek();
    }

    // Return whether the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
