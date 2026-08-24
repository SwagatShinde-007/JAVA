
class Number {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 3 };

        // get
        System.out.println(arr[0]);

        // set
        arr[0] = 30;
        System.out.println(arr[0]);

        // length
        System.out.println(arr.length);
        // traverse
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}