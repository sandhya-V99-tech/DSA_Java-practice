public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("orginal:");
        for (int num : arr)
            System.out.print(num + " ");

        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.print("\nReversed: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}