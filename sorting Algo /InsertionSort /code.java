//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      int[] arr = new int[]{1, 105, 88, 46, 25, 40, 90, 66};
      insertionSort(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int j, key;
        for (int i = 1; i < arr.length; i++) {
            j = i - 1;
            key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
