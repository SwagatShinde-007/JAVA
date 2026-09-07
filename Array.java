
public class Array {
    public static void main(String[] args) {
    int []arr={0,1,2,3,4};
    System.out.println(arr[2]);

    arr[2]=20;
    System.out.println(arr[2]);

    arr[2]=40;
    System.out.println(arr[2]);

    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }

    }
}