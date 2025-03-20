import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class PairWithSum {
    public static boolean checkPair(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(target - num)) {
                return true; // Pair found
            }
            seen.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        System.out.println(checkPair(arr,target));
    }
}

/*Enter the number of elements in array: 4
Enter the array elements: 10 15 3 7
Enter the target: 17
true
*/