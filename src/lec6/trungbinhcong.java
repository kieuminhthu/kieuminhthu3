
package lec6;

import java.util.Arrays;
import java.util.Scanner;

public class trungbinhcong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        System.out.println("Cac phan tu cua mang: ");
        for (int i = 0; i < a; i++) {
            System.out.println("Phan tu " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
        }
        double average = Arrays.stream(arr).average().orElse(0);
        System.out.println("Trung binh cong cua mang la: " + average);
    }
}
