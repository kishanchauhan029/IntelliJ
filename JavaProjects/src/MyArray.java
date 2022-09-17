import java.util.Scanner;

public class MyArray {

    public static void main(String[] args) {
        sumArray();
    }

    public static void sumArray() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Please enter 5 numbers:");
        for (int i = 0; i <= 4; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum is: " + sum);
    }
}