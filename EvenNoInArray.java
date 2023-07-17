public class EvenNoInArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 4, 6, 11, 13, 18, 21 };
        int[] ar = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ar[i] = arr[i];
            }
        }
        for (int j = 0; j < ar.length; j++) {
            System.out.println(ar[j]);
        }
    }
}
