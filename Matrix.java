import java.util.Scanner;

public class Transpose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a rows(n) : ");
        int n = sc.nextInt();
        System.out.println("Enter a cols(m): ");
        int m = sc.nextInt();
        System.out.println("Enter actual matrix : ");
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(+a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
