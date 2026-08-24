import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("How many element : ");
        int n=sc.nextInt();
        System.out.println("Enter actual elements :");
        int arr[]=new int[n];
    
    for(int i=0;i<arr.length;i++)
        {    
           arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
            {    
               sum=sum+arr[i];
            }
        System.out.println("Sum is : "+sum);

    }
}
