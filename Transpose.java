import java.util.Scanner;

public class Transpose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows(n) : ");
        int n = sc.nextInt();
        System.out.println("Enter cols(m): ");
        int m = sc.nextInt();

        int a[][] = new int[n][m];
        System.out.println("Enter actual matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The transposed matrix is : ");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}