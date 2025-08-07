



public class Main {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top: " + stack.top()); // 30
        System.out.println("Pop: " + stack.pop()); // 30
        System.out.println("Top: " + stack.top()); // 20
        System.out.println("Is empty: " + stack.isEmpty()); // false
        stack.pop();
        stack.pop();
        System.out.println("Is empty: " + stack.isEmpty()); // true

        // Demonstrate QueueUsingArray
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        System.out.println("Queue front: " + queue.peek()); // 100
        System.out.println("Dequeue: " + queue.dequeue()); // 100
        System.out.println("Queue front: " + queue.peek()); // 200
        System.out.println("Queue size: " + queue.getSize()); // 2
        System.out.println("Is queue empty: " + queue.isEmpty()); // false
    }
}
