import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n]; // Result array
        Stack<Integer> stack = new Stack<>(); // Stack stores indices

        for (int i = 0; i < n; i++) {
            // Pop elements while stack is not empty and the current price is greater
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index to stack
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);

        // Print the span array
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
