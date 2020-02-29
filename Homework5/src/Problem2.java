import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        System.out.println("Input size of array: ");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] array = new int[n];
        int i;

        for (i=0; i<n; ++i){
        System.out.println("Input element "+ i + ": ");
        array[i]  = scanner.nextInt();
        };
    }
}
