import java.util.*;

public class naive_method {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get array length
        System.out.println("Array length: ");
        int length = scanner.nextInt();

        // init array
        int[] arr = new int[length];

        // get array elements
        System.out.println("Type in elements line by line:\n");
        for (int l = 0; l < length; l++) {
            arr[l] = scanner.nextInt();
        }

        // set a very low max value
        int max = -1000;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // get the subarray sum from index i to j
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                System.out.println("Subarray sum from " + i + " to " + j + " --> " + sum);
                if (max < sum) {
                    System.out.println("New maximum found: " + sum);
                    max = sum;
                }
            }
        }

        System.out.println("Maximum subarray sum: " + max);
    }
}