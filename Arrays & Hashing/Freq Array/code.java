import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = input.nextInt();
        int [] arr = new int[size];
        int [] freq = new int[10005];

        for (int i = 0; i<size ; i++){
            System.out.println("enter element number " + i);
            arr[i] = input.nextInt();
            freq[arr[i]]++;
        }
        System.out.println("enter q");
        int q = input.nextInt();
        while (q!=0){
            q--;
            System.out.println("iteration of number ....");
            int num = input.nextInt();
            System.out.println(freq[num]);

        }


    }
}
