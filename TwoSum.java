import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i }; // Found the pair
            }

            numMap.put(nums[i], i);
        }
        return new int[] {}; // No solution found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        int[] result = findTwoSum(arr, target);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}

/*Enter the number of elements in array: 4
Enter the elements in array: 10 5 7 18
Enter the target sum: 15
0 1
*/
