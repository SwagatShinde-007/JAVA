import java.util.Scanner;

public class Rotate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows(n) : ");
        int n = sc.nextInt();
        System.out.println("Enter Columns(m) : ");
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Enter actual element : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose of matrix is : ");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Anticlockwise matrix is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
