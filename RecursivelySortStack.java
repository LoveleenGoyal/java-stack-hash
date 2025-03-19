import java.util.Stack;

public class RecursivelySortStack {

    // Function to sort the stack recursively
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);       // Recursively sort remaining stack
            insertSorted(stack, temp); // Insert element back at correct position
        }
    }

    // Helper function to insert an element at the correct position
    private static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int temp = stack.pop();
            insertSorted(stack, element); // Recursively insert in sorted order
            stack.push(temp); // Restore removed element
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}

/*Original Stack: [3, 1, 4, 2, 5]
Sorted Stack: [1, 2, 3, 4, 5]
*/
