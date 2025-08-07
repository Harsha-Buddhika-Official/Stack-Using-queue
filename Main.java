



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
    }
}
