import java.util.Scanner;

public class MaxArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter actual elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Max is : "+max);

    }

}
