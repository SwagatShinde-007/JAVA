import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements : ");
        int n=sc.nextInt();
        System.out.println("Enter actual elements : ");
        int arr[]=new int[n];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
           sum= sum+arr[i];
        }
        System.out.println("Sum is : "+sum);

    }
}